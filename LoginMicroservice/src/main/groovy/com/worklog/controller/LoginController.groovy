package com.worklog.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

import com.worklog.model.User
import com.worklog.service.LoginServiceImpl

import groovy.util.logging.Slf4j

@Slf4j
@RestController
@CrossOrigin(origins="http://localhost:3000")
class LoginController {
	
	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@PostMapping("/login")
	public String login(@RequestBody User user)
	{
		//println ("*******"+user.getUserId()+"-"+user.getUname()+"-"+user.getUpassword())
		log.info("At login request");
		return loginServiceImpl.login(user);
	}
	
	@Value("{welcome.message}")
	String welcomeMsg
	@GetMapping("/configmsg")
	public String configMsg()
	{
		log.info("At config server method from LoginApplication")
		return welcomeMsg
	}
}
