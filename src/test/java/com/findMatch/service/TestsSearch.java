package com.findMatch.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.findMatch.dto.UserDto;
import com.findMatch.entity.User;
import com.findMatch.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class TestsSearch {

	@InjectMocks
	UserService userService;
	
	@Mock
	UserRepository userRepository;
	
	public User getUser()
	{
		User user = new User();
		user.setAge(23);
		user.setCaste("tigh");
		user.setCity("Bangalore");
		user.setGender("Male");
		user.setLanguage("Kannada");
		user.setName("Sharath");
		user.setOccupation("Software");
		user.setPassword("test@123");
		user.setProfileId(1L);
		user.setReligion("Hindu");
		user.setState("Karnataka");
		return user;
	}
	
	public UserDto getUserDto()
	{
		UserDto user = new UserDto();
		user.setAge(23);
		user.setCaste("tigh");
		user.setCity("Bangalore");
		user.setGender("Male");
		user.setLanguage("Kannada");
		user.setName("Sharath");
		user.setOccupation("Software");
		user.setPassword("test@123");
		user.setProfileId(1L);
		user.setReligion("Hindu");
		user.setState("Karnataka");
		return user;
	}
	
	@Test
	public void getSerachDataTest()
	{
		User user = getUser();
		List<User> userData = new ArrayList<User>();
		userData.add(user);
		List<UserDto> userDataDto = new ArrayList<UserDto>();
		userDataDto.add(getUserDto());
		Mockito.when(userRepository.findAllByAgeAndOccupationAndCity(23, "Software", "Bangalore")).thenReturn(userData);
		List<UserDto> listUserDto = userService.getSerachData(23, "Software", "Bangalore");
		Assert.assertEquals(listUserDto.size(), userDataDto.size());
	}
	
}
