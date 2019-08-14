package com.findMatch.controller;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.findMatch.Response.ApiResponse;
import com.findMatch.dto.LoginDto;
import com.findMatch.service.UserServicImpl;


@RestController
@RequestMapping("/")
@CrossOrigin(allowedHeaders = {"*","*/"},origins = {"*","*/"})
public class UserController {
	
	
	@Autowired
	private UserServicImpl userserviceimpl;
	
	@PostMapping("/login")
	public ApiResponse Login(@RequestBody LoginDto logindto) {
		
//       logger.info("controller classs");
		
		return userserviceimpl.Login(logindto);
		
		
	}

	

}
