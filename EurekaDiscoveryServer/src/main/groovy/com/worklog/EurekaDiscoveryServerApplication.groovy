package com.worklog

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

import groovy.util.logging.Slf4j

@Slf4j
@SpringBootApplication
@EnableEurekaServer
class EurekaDiscoveryServerApplication {

	static void main(String[] args) {
		log.info("EurekaDiscoveryServer application started")
		SpringApplication.run(EurekaDiscoveryServerApplication, args)
	}

}
