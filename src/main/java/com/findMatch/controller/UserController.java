package com.findMatch.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.findMatch.dto.UserDto;
import com.findMatch.service.UserService;

@RestController
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;

	/*@PostMapping("/search")
	public ResponseEntity<List<UserDto>> getBySearch(@RequestParam(required = false) int age, @RequestParam(required = false) String religion, @RequestParam(required = false) String caste, @RequestParam(required = false) String city, @RequestParam(required = false) String occupation)
	{
		logger.info("user controller getBySearch entry and calling getSearch");
		return new ResponseEntity<List<UserDto>>(userService.getSearch(age, religion, caste, city, occupation), HttpStatus.OK);
	}*/
	
	
	@PostMapping("/search")
	public ResponseEntity<List<UserDto>> getBySearch(@RequestParam(required = false) int age, @RequestParam(required = false) String city, @RequestParam(required = false) String occupation)
	{
		logger.info("user controller getBySearch entry and calling getSearch");
		return new ResponseEntity<List<UserDto>>(userService.getSerachData(age, city, occupation), HttpStatus.OK);
	}
	
}
