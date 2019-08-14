package com.findMatch.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.findMatch.dto.LoginDto;
import com.findMatch.dto.UserDto;
import com.findMatch.entity.User;
import com.findMatch.repository.IUserRepository;
import com.findMatch.response.ApiResponse;

@RunWith(MockitoJUnitRunner.Silent.class)
public class UserServiceImplTest {

	@Mock
	IUserRepository userRepository;

	@InjectMocks
	UserServiceImpl userServiceImpl;

	@Test
	public void testRegistration() throws ParseException {
		UserDto userentity = new UserDto();
		// userentity.setAge(24);
		userentity.setCaste("gupta");
		userentity.setName("vikash");
		userentity.setCity("bangalore");
		userentity.setDob("01/10/1991");
		userentity.setGender("male");
		userentity.setHeight("5.3");
		userentity.setLanguage("hiondi");
		userentity.setOccupation("private");
		userentity.setState("bangalore");
		userentity.setPassword("ok");
		userentity.setPhoneno(8792441259l);
		userentity.setProfileCreatedBy("father");
		// userentity.setProfileId(12345l);
		userentity.setReligion("hindu");

		userentity.setEmailId("vikas@gmail.com");
		userentity.setProfiletype("gold");

		User user1 = new User();
		user1.setCreatedDate(new Date());
		user1.setProfileId(12345l);
		user1.setAge(28);
		Mockito.when(userRepository.save(Mockito.anyObject())).thenReturn(user1);
		String s = userServiceImpl.registration(userentity);
		assertNotNull(s);
		assertEquals("registration sunccessfully", s);

	}

	LoginDto logindto;

	public LoginDto getLoginDto() {

		LoginDto logindto = new LoginDto();
		logindto.setPhoneno(8787656543l);
		logindto.setPassword("vk@123");
		return logindto;
	}

	@Test
	public void testLogin() {
		User userentity = new User();
		userentity.setAge(24);
		userentity.setCaste("gupta");
		userentity.setName("vikash");
		userentity.setCity("bangalore");
		userentity.setDob("01/10/1991");
		userentity.setGender("male");
		userentity.setHeight("5.3");
		userentity.setLanguage("hiondi");
		userentity.setOccupation("private");
		userentity.setState("bangalore");
		userentity.setPassword("ok");
		userentity.setPhoneno(8792441259l);
		userentity.setProfileCreatedBy("father");
		userentity.setProfileId(12345l);
		userentity.setReligion("hindu");
		userentity.setCreatedDate(new Date());
		userentity.setEmailId("vikas@gmail.com");
		userentity.setProfiletype("gold");

		LoginDto logindto = new LoginDto();
		logindto.setPhoneno(8792441259l);
		logindto.setPassword("ok");
		Mockito.when(userRepository.findByphoneno(Mockito.anyLong())).thenReturn(userentity);
		ApiResponse ApiResponse = userServiceImpl.login(logindto);
		assertEquals(200, ApiResponse.getStatus());

	}

	@Test
	public void testViewProfile() {
		User userentity = new User();
		// userentity.setAge(24);
		userentity.setCaste("gupta");
		userentity.setName("vikash");
		userentity.setCity("bangalore");
		userentity.setDob("01/10/1991");
		userentity.setGender("male");
		userentity.setHeight("5.3");
		userentity.setLanguage("hiondi");
		userentity.setOccupation("private");
		userentity.setState("bangalore");
		userentity.setPassword("ok");
		userentity.setPhoneno(8792441259l);
		userentity.setProfileCreatedBy("father");
		// userentity.setProfileId(12345l);
		userentity.setReligion("hindu");

		userentity.setEmailId("vikas@gmail.com");
		userentity.setProfiletype("gold");

		userentity.setCreatedDate(new Date());
		userentity.setProfileId(12345l);
		userentity.setAge(28);
		Mockito.when(userRepository.findByprofileId(Mockito.anyLong())).thenReturn(userentity);
		User s = userServiceImpl.getProfileDetails(12345l);
		assertNotNull(s);
		assertEquals(userentity.getCity(), s.getCity());
	}

}
