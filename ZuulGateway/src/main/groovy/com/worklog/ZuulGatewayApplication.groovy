package com.worklog

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

import groovy.util.logging.Slf4j

@Slf4j
@SpringBootApplication
@EnableZuulProxy
class ZuulGatewayApplication {

	static void main(String[] args) {
		log.info("ZuulGateway application started")
		SpringApplication.run(ZuulGatewayApplication, args)
	}

}
