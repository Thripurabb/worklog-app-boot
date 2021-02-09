package com.worklog

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EurekaDiscoveryServerApplication {

	static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryServerApplication, args)
	}

}
