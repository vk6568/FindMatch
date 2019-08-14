package com.findMatch.service;

import java.text.ParseException;

import com.findMatch.dto.LoginDto;
import com.findMatch.dto.UserDto;
import com.findMatch.entity.User;
import com.findMatch.response.ApiResponse;



public interface IUserService {

	String registration(UserDto userDto) throws ParseException;

	ApiResponse login(LoginDto logindto);

	User getProfileDetails(Long id);

}
