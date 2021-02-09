package com.worklog.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

import com.worklog.model.User
import com.worklog.service.LoginServiceImpl

@RestController
@CrossOrigin(origins="http://localhost:3000")
class LoginController {
	
	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@PostMapping("/login")
	public String login(@RequestBody User user)
	{
		//user.setUname("admin")
		//user.setUpassword("admin")
		println ("*******"+user.getUserId()+"-"+user.getUname()+"-"+user.getUpassword())
		return loginServiceImpl.login(user);
	}
}
