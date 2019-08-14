package com.findMatch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.findMatch.entity.InterestedProfile;
import com.findMatch.service.InterestedProfileServiceImpl;


@RestController
@RequestMapping("/matrimony")
@CrossOrigin(origins = { "*", "*/" }, allowedHeaders = { "*", "*/" })
public class InterestedProfileController {
	/*
	 * private static final Logger logger =
	 * LoggerFactory.getLogger(InterestedProfileController.class);
	 * 
	 * 
	 * 
	 * @Autowired InterestedProfileServiceImpl interested;
	 * 
	 * @PutMapping("/approval/{requestedId},{accepectedId},{status}") public
	 * ResponseEntity<String> approveOrReject(@PathVariable long
	 * requestedId, @PathVariable long accepectedId,
	 * 
	 * @PathVariable String status) { logger.info("inside this method"); String ip =
	 * interested.acceptedOrRejected(requestedId, accepectedId, status);
	 * 
	 * return new ResponseEntity<String>(ip, HttpStatus.ACCEPTED);
	 * 
	 * }
	 */

}
