package com.worklog.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

import com.worklog.model.Employee
import com.worklog.model.ProjectInfo
import com.worklog.service.EmployeeService

import groovy.util.logging.Slf4j

@Slf4j
@RestController
@CrossOrigin(origins="http://localhost:3000")
class EmployeeController {
	@Autowired
	EmployeeService employeeService
	
	@PostMapping("/addEmployee")
	void addUser(@RequestBody Employee employee)
	{
		log.info("At add user request");
		employeeService.saveEmployee(employee)
	}
	@GetMapping("/getAll")
	List<Employee> getAllEmployee()
	{
		log.info("At get all Employee method")
		return employeeService.getAllEmployee()
	}
	@GetMapping("/get/{empId}")
	Employee getEmployee(@PathVariable String empId)
	{
		log.info("At get a Employee method")
		return employeeService.getEmployee(empId);
	}
	@PostMapping("/addProject/{empId}")
	void addProjectInfo(@PathVariable String empId,@RequestBody ProjectInfo projectInfo)
	{
		log.info("At add projectInfo method")
		employeeService.addProjectInfo(empId, projectInfo)
	}
	@Value("{welcome.message}")
	String welcomeMsg
	@GetMapping("/configmsg")
	public String configMsg()
	{
		log.info("At configMsg method from Employee Application")
		return welcomeMsg
	}
}
