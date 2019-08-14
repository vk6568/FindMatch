package com.findMatch.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findMatch.dto.LoginDto;
import com.findMatch.dto.UserDto;
import com.findMatch.entity.User;
import com.findMatch.repository.IUserRepository;
import com.findMatch.response.ApiResponse;



@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	IUserRepository userRepository;
	
	@Override
	public String registration(UserDto userDto) throws ParseException {
		int num = 100000 + new Random().nextInt(900000);
		Long profileId = Long.valueOf(num);
		String s = userDto.getDob();
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		  Date d = sdf.parse(s);
		  Calendar c = Calendar.getInstance();
		  c.setTime(d);
		  int year = Calendar.getInstance().get(Calendar.YEAR);
		  int age = year-c.get(Calendar.YEAR);
		  
		  User user = new User();
		  user.setProfileId(profileId);
		  user.setAge(age);
		  user.setCreatedDate(new Date());
		  BeanUtils.copyProperties(userDto, user);
		if(userRepository.save(user)!=null) {
			return "registration sunccessfully";
		}else {
			return "Please try again...";
		}
		
	}
	
	@Override
	public ApiResponse login(LoginDto logindto) {
		User user = userRepository.findByphoneno(logindto.getPhoneno());
		  if(user == null) {
			  
			throw new RuntimeException("User doesn't exist.");	  
			
		}
		if(!user.getPassword().equals(logindto.getPassword())){
			
			throw new RuntimeException("Password mismatch");	
			
		}
	    return  new ApiResponse(200, "Login Sucess", null);
	}

	@Override
	public User getProfileDetails(Long id) {
		return userRepository.findByprofileId(id);
	}

}
