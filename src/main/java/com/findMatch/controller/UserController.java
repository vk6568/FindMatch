package com.findMatch.controller;

import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.findMatch.dto.LoginDto;
import com.findMatch.dto.UserDto;
import com.findMatch.entity.User;
import com.findMatch.response.ApiResponse;
import com.findMatch.service.IUserService;



@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RestController
@RequestMapping("/findmatch")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	IUserService userService;
	
	@PostMapping("/registration")
	public ResponseEntity<String> registration(@RequestBody UserDto userDto) throws ParseException{
		logger.info("Eneterd into user registration");
		return new ResponseEntity<String>(userService.registration(userDto),HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ApiResponse login(@RequestBody LoginDto logindto) {
		
     logger.info("controller classs");
		
		return userService.login(logindto);
			
	}
	
	@GetMapping("/viewprofile/{id}")
	public ResponseEntity<User> getProfileDetails(@PathVariable Long id) {
		return new ResponseEntity<User>(userService.getProfileDetails(id), HttpStatus.OK);
	}
	
	
}
