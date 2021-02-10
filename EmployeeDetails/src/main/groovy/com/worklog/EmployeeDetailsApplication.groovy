package com.worklog

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

import groovy.util.logging.Slf4j

@Slf4j
@SpringBootApplication
@EnableEurekaClient
@RefreshScope
class EmployeeDetailsApplication {

	static void main(String[] args) {
		log.info("At main method of EmployeeDetails application")
		SpringApplication.run(EmployeeDetailsApplication, args)
	}

}
