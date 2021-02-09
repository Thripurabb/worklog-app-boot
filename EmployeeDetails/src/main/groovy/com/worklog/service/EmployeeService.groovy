package com.worklog.service

import com.worklog.model.Employee
import com.worklog.model.ProjectInfo

interface EmployeeService {
	List<Employee> getAllEmployee()
	Employee getEmployee(String empId)
	void addProjectInfo(String empId,ProjectInfo projectInfo)
	void saveEmployee(Employee employee)
}
