package com.worklog.dao

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

import com.worklog.model.User

@Repository
interface LoginRepository extends MongoRepository<User,String>{
}
