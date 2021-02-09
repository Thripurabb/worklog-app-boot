package com.worklog

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableZuulProxy
class ZuulGatewayApplication {

	static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication, args)
	}

}
