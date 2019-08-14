package com.findMatch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.findMatch.service.UserService;

@RestController
@RequestMapping("/findmatch")
@CrossOrigin(origins = { "*", "*/" }, allowedHeaders = { "*", "*/" })
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	UserService userServiceImpl;
	@GetMapping("/getAllProfile/{id1}/{id2}")
	public ResponseEntity<Object> getAll(@PathVariable Long id1,@PathVariable Long id2){
		logger.info("inside getAll");
		return new ResponseEntity<Object>(userServiceImpl.getAll(id1, id2),HttpStatus.OK);
	
		
	}

}
