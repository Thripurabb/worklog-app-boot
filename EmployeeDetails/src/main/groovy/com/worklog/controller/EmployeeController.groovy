package com.worklog.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

import com.worklog.model.Employee
import com.worklog.model.ProjectInfo
import com.worklog.service.EmployeeService

@RestController
@CrossOrigin(origins="http://localhost:3000")
class EmployeeController {
	@Autowired
	EmployeeService employeeService
	
	@PostMapping("/addEmployee")
	void addUser(@RequestBody Employee employee)
	{
		employeeService.saveEmployee(employee)
	}
	@GetMapping("/getAll")
	List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee()
	}
	@GetMapping("/get/{empId}")
	Employee getEmployee(@PathVariable String empId)
	{
		return employeeService.getEmployee(empId);
	}
	@PostMapping("/addProject/{empId}")
	void addProjectInfo(@PathVariable String empId,@RequestBody ProjectInfo projectInfo)
	{
		employeeService.addProjectInfo(empId, projectInfo)
	}
}
