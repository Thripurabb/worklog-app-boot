package com.worklog.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection="employee")
class Employee {
	@Id
	String employeeId;
	String employeeName;
	String employeeRole;
	String employeeServiceLine;	
	List<ProjectInfo> projectInfo;
	public Employee() {
		super();
	}
	
	public Employee(String employeeId, String employeeName, String employeeRole, String employeeServiceLine) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeServiceLine = employeeServiceLine;
	}

	public Employee(String employeeId, String employeeName, String employeeRole, String employeeServiceLine,
			List<ProjectInfo> projectInfo) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeServiceLine = employeeServiceLine;
		this.projectInfo = projectInfo;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	public String getEmployeeServiceLine() {
		return employeeServiceLine;
	}
	public void setEmployeeServiceLine(String employeeServiceLine) {
		this.employeeServiceLine = employeeServiceLine;
	}
	public List<ProjectInfo> getProjectInfo() {
		return projectInfo;
	}
	public void setProjectInfo(List<ProjectInfo> projectInfo) {
		this.projectInfo = projectInfo;
	}
	
}
