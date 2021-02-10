package com.worklog.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import com.worklog.dao.EmployeeRepository
import com.worklog.model.Employee
import com.worklog.model.ProjectInfo

import groovy.util.logging.Slf4j

@Slf4j
@Service
class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository
	
	public void saveEmployee() {
			employeeRepository.save(new Employee("842430","Thripura","PAT","CDE",Arrays.asList(new ProjectInfo("02/01/2021","MFRP","Spring boot learning","5"),new ProjectInfo("02/01/2021","MetLife","React Js learning","4"))));
			employeeRepository.save(new Employee("842056","Janet Bessy","PAT","CDE",Arrays.asList(new ProjectInfo("02/01/2021","MFRP","Spring boot learning","5"),new ProjectInfo("02/01/2021","MetLife","React Js learning","4"))));
			employeeRepository.save(new Employee("841870","Nivethetha","PAT","CDE",Arrays.asList(new ProjectInfo("02/01/2021","MFRP","Spring boot learning","5"),new ProjectInfo("02/01/2021","MetLife","React Js learning","4"))));
			employeeRepository.save(new Employee("842391","Deepak Vignesh Pandi","PAT","CDE",Arrays.asList(new ProjectInfo("02/01/2021","MFRP","Spring boot learning","5"),new ProjectInfo("02/01/2021","MetLife","React Js learning","4"))));
			employeeRepository.save(new Employee("841894","Gowri Shanker","PAT","CDE",Arrays.asList(new ProjectInfo("02/01/2021","MFRP","Spring boot learning","5"),new ProjectInfo("02/01/2021","MetLife","React Js learning","4"))));
			employeeRepository.save(new Employee("841936","Rohith","PAT","CDE",Arrays.asList(new ProjectInfo("02/01/2021","MFRP","Spring boot learning","5"),new ProjectInfo("02/01/2021","MetLife","React Js learning","4"))));
			employeeRepository.save(new Employee("853093","Sivasankaran","PAT","CDE"));
			employeeRepository.save(new Employee("842302","Nagarjun","PAT","CDE"))
			employeeRepository.save(new Employee("842227","Barath","PAT","CDE"))
			employeeRepository.save(new Employee("841869","Gowshik","PAT","CDE"))
			employeeRepository.save(new Employee("841805","Murali Krishna","PAT","CDE"))
			
	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		log.info("At get all employee service method")
		return employeeRepository.findAll()
	}
	@Override
	public Employee getEmployee(String empId) {
		// TODO Auto-generated method stub
		log.info("At get a employee service method")
		return employeeRepository.findById(empId).get()
	}
	@Override
	public void addProjectInfo(String empId, ProjectInfo projectInfo) {
		log.info("At add projectInfo service method")
		Optional<Employee> employee = employeeRepository.findById(empId)
		Employee emp = employee.get()
		if(employee.isPresent())
		{
			if(emp.getProjectInfo()!=null)
			{
				List<ProjectInfo> projectList=emp.getProjectInfo();
				projectList.add(projectInfo)
				emp.setProjectInfo(projectList)
			}
			else
			{
				List<ProjectInfo> list =  new ArrayList<>();
				list.add(projectInfo);
				emp.setProjectInfo(list)
			}
		}
		employeeRepository.save(emp)
	}
	@Override
	public void saveEmployee(Employee employee) {
		log.info("At save employee service method")
		employeeRepository.save(employee);
	}
	
	
}
