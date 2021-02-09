package com.worklog.dao

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

import com.worklog.model.Employee

@Repository
interface EmployeeRepository extends MongoRepository<Employee,String>{
}
