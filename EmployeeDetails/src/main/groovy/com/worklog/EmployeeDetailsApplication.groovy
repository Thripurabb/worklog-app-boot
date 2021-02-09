package com.worklog

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class EmployeeDetailsApplication {

	static void main(String[] args) {
		SpringApplication.run(EmployeeDetailsApplication, args)
	}

}
