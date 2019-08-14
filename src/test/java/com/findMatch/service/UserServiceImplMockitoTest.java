package com.findMatch.service;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.stereotype.Service;

import com.findMatch.Response.ApiResponse;
import com.findMatch.dto.LoginDto;
import com.findMatch.entity.User;
import com.findMatch.repository.UserRepository;

import antlr.collections.List;

@Transactional
@Service
@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplMockitoTest {
	
	 @Mock
	 UserRepository userrepository;
	
	@InjectMocks
	private UserServicImpl userservic;
	
	LoginDto logindto ;
	
	
	
	public LoginDto getLoginDto() {
		
		LoginDto logindto = new LoginDto();
		logindto.setPhoneno(8787656543l);
		logindto.setPassword("vk@123");
		return logindto;	
	}
	private Long profileId;
	private String name;
	private int age;
	private String city;
	private String dob;
	private String gender;
	private String caste;
	private String height;
	private String language;
	private String occupation;
	private String state;
	private String password;
	private  Long phoneno;
	
	@Test
	public void testLoginUser() {
		User userentity=new  User();
		userentity.setAge(24);;
		userentity.setCaste("gupta");
		userentity.setName("vikash");;
		userentity.setCity("bangalore");
		userentity.setDob("01/10/1991");;
		userentity.setGender("male");
		userentity.setHeight("5.3");;
		userentity.setLanguage("hiondi");;
		userentity.setOccupation("private");
		userentity.setState("bangalore");
		userentity.setPassword("ok");
		userentity.setPhoneno(8792441259l);
		userentity.setProfileCreatedBy("father");
		userentity.setProfileId(12345l);
		userentity.setReligion("hindu");
		
		LoginDto logindto = new LoginDto();
		logindto.setPhoneno(8792441259l);
		logindto.setPassword("ok");
		Mockito.when(userrepository.findByphoneno(Mockito.anyLong())).thenReturn(userentity);
		ApiResponse ApiResponse= userservic.Login(logindto);
		assertEquals(200,ApiResponse.getStatus());
	}
	

	
	

}
