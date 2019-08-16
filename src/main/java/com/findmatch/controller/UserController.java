package com.findmatch.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.findmatch.entity.InterestedProfile;
import com.findmatch.response.InterestResponse;
import com.findmatch.response.InterestResponseSent;
import com.findmatch.service.InterestedProfileService;


@CrossOrigin(allowedHeaders = { "*" , "*/" } ,origins= {"*" , "*/"})
@RestController
@RequestMapping("/findmatch")
public class UserController {
	@Autowired
	InterestedProfileService interestedProfileService;

	private static final Logger logger =LoggerFactory.getLogger(UserController.class);
			@PostMapping("/sendinterest/{requestorId}/{acceptorId}")
	public ResponseEntity sendRequest(@PathVariable Long requestorId,@PathVariable Long acceptorId) {
				logger.debug("enetered into UserController");
		interestedProfileService.sendRequest(requestorId,acceptorId);    //By saicharan created on 14-08-2019
		return new ResponseEntity<>("request sent successfully",HttpStatus.OK);
		
	}
	@GetMapping("/interests/received/{matrimonalId}")
	public List<InterestResponse> interestsReceived(@PathVariable Long matrimonalId) {
		
		List<InterestResponse> response=new ArrayList<InterestResponse>();//By saicharan created on 14-08-2019
		List<InterestedProfile> interestedProfiles= interestedProfileService.interestReceived(matrimonalId);
		for(InterestedProfile profile:interestedProfiles) {
			InterestResponse response1=new InterestResponse();
			response1.setRequestorId(profile.getRequestorId());
			
			response1.setRequestedDate(profile.getRequestDate());
			response1.setStatus(profile.getStatus());
			response1.setStatusCode(200);
			response1.setStatusMessage("ok");
			response.add(response1);
		}
		return response;
			
		}
	@GetMapping("/interests/sent/{matrimonalId}")
	public List<InterestResponseSent> interestssent(@PathVariable Long matrimonalId) {

		List<InterestResponseSent> response=new ArrayList<InterestResponseSent>();
		InterestResponseSent response1=new InterestResponseSent();
		List<InterestedProfile> interestedProfiles= interestedProfileService.interestsent(matrimonalId);   //By saicharan created on 14-08-2019
		for(InterestedProfile profile:interestedProfiles) {
			response1.setAcceptorId(profile.getAcceptorId());
			response1.setRequestedDate(profile.getRequestDate());
			response1.setStatus(profile.getStatus());
			response1.setStatusCode(200);
			response1.setStatusMessage("ok");
			response.add(response1);
		}
		return response;
			
		}
	
		
		@PutMapping("/approval/{requestorId}/{acceptorId}/{status}")
		public ResponseEntity approval(@PathVariable Long requestorId,@PathVariable Long acceptorId,@PathVariable String status) {
			interestedProfileService.approval(requestorId,acceptorId,status);
			return new ResponseEntity<>("Request processed  successfully",HttpStatus.OK);
		}
		@GetMapping("/getProfiles/{matrimonalId}")
		public ResponseEntity getall(@PathVariable Long matrimonalId)//By saicharan created on 14-08-2019
		{
		List<InterestedProfile>	interestedProfile=interestedProfileService.getall(matrimonalId);
		return new ResponseEntity<>(interestedProfile,HttpStatus.OK); //By saicharan created on 14-08-2019
		}
	
		
	}
	


