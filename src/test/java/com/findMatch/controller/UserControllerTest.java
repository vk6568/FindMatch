package com.findMatch.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;

import com.findMatch.dto.UserDto;
import com.findMatch.entity.User;
import com.findMatch.service.UserServiceImpl;

@RunWith(MockitoJUnitRunner.Silent.class)
public class UserControllerTest {
	
	@InjectMocks
	UserController userController;
	
	@Mock
	UserServiceImpl userServiceImpl;
	
	
	UserDto user = null;
	@Before
	public void setUp() {
		//user.setAge(29);
		user.setCaste("BC");
		user.setCity("Bangalore");
		//user.setCreatedDate(new Date());
		user.setDob("1989/08/08");
		user.setEmailId("mahi@gmail.com");
		user.setGender("male");
		user.setHeight("5.7");
		user.setLanguage("telugu");
		user.setName("mahesh");
		user.setOccupation("private");
		user.setPassword("mahesh");
		user.setPhoneno(9701307810L);
		user.setProfileCreatedBy("self");
		user.setReligion("hindu");
		user.setState("andhra");
	}
	
	@Test
	public void testRegistration() throws ParseException {
		
		User use = new User();
		BeanUtils.copyProperties(user, use);
		Mockito.when(userServiceImpl.registration(user)).thenReturn("successfully Registered");
		 ResponseEntity<String> s = userController.registration(user);
		 String m=s.toString();
		  assertNotNull(s);
		  assertEquals("<200 OK OK,[]>", m);
	}
	
	
	

}
