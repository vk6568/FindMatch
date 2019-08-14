package com.findMatch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findMatch.Response.ApiResponse;
import com.findMatch.dto.LoginDto;
import com.findMatch.entity.User;
import com.findMatch.repository.UserRepository;



@Service
public class UserServicImpl implements  UserService  {
	
	@Autowired
	private UserRepository userrepository;

	@Override
	public ApiResponse Login(LoginDto logindto) {
		// TODO Auto-generated method stub
		User user = userrepository.findByphoneno(logindto.getPhoneno());
		  if(user == null) {
			  
			throw new RuntimeException("User doesn't exist.");
			
			  
			
		}
		if(!user.getPassword().equals(logindto.getPassword())){
			
			throw new RuntimeException("Password mismatch");	
			
		}
	    return new ApiResponse(200, "Login Sucess", null);
	}

	

}
