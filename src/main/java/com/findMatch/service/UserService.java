package com.findMatch.service;

import com.findMatch.Response.ApiResponse;
import com.findMatch.dto.LoginDto;
import com.findMatch.entity.User;


public interface UserService {
	
	
	ApiResponse Login(LoginDto logindto);

}

