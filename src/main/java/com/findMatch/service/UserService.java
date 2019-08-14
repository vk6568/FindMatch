package com.findMatch.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findMatch.dto.UserDto;
import com.findMatch.entity.User;
import com.findMatch.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	public List<UserDto> getSerachData(int age, String occupation, String city)
	{
		logger.info("User Service class getSearchData method called");
		
		
		List<UserDto> allDetails = new ArrayList<UserDto>();
		List<User> userData = userRepository.findAllByAgeAndOccupationAndCity(age, occupation, city);
		for(int i =0;i<userData.size();i++)
		{
			UserDto userDto = new UserDto();
			userDto.setAge(userData.get(i).getAge());
			userDto.setCaste(userData.get(i).getCaste());
			userDto.setReligion(userData.get(i).getReligion());
			userDto.setName(userData.get(i).getName());
			userDto.setOccupation(userData.get(i).getOccupation());
			userDto.setProfileId(userData.get(i).getProfileId());
			allDetails.add(userDto);
		}
		
		return allDetails;
	}
	
	public List<UserDto> getSearch(int age, String religion, String caste, String city, String occupation)
	{
		logger.info("User Service class getSearch method called");
		
		
		List<UserDto> allDetails = new ArrayList<UserDto>();
		List<User> userData = new ArrayList<User>();
		
		/*if(religion.isEmpty() && caste.isEmpty() && city.isEmpty() && occupation.isEmpty() && age == 0)
		{
			userData = userRepository.findAll();
		}else/* if(religion.isEmpty())
		{
			userData = userRepository.findByAgeAndCityAndCasteAndOccupation(age, city, caste, occupation);
		}else if(caste.isEmpty()) {
			userData = userRepository.findByAgeAndCityAndCasteAndOccupation(age, city, caste, occupation);
		}else if(city.isEmpty())
		{
			userData = userRepository.findByAgeAndReligionAndCasteAndOccupation(age, religion, caste, occupation);
		}else if(occupation.isEmpty())
		{
			userData = userRepository.findByAgeAndCityAndReligionAndCaste(age, religion, city, caste);
		}else*//* if(religion.isEmpty() && caste.isEmpty()) {
			userData = userRepository.findAllByAgeAndCityAndCasteAndOccupation(age, city, caste, occupation);
		}else if(age == 0 && religion.isEmpty())
		{
			userData = userRepository.findAllByCityAndCasteAndOccupation(city, caste, occupation);
		}else if(religion.isEmpty() && city.isEmpty())
		{
			userData = userRepository.findAllByAgeAndCasteAndOccupation(age, caste, occupation);
		}else if(religion.isEmpty() && occupation.isEmpty())
		{
			userData = userRepository.findAllByAgeAndCasteAndReligion(age, caste, religion);
		}else if(religion.isEmpty() && caste.isEmpty())
		{
			userData = userRepository.findAllByAgeAndCityAndOccupation(age, city, occupation);
		}else if(caste.isEmpty() && city.isEmpty())
		{
			userData = userRepository.findAllByAgeAndReligionAndOccupation(age, religion, occupation);
		}else if(caste.isEmpty() && occupation.isEmpty())
		{
			userData = userRepository.findAllByAgeAndReligionAndCity(age, religion, city);
		}else if(city == null && occupation == null)
		{
			userData = userRepository.findAllByAgeAndCasteAndReligion(age, caste, religion);
		}
		
		System.out.println("userData "+userData.toString());
		
		for(int i =0;i<userData.size();i++)
		{
			UserDto userDto = new UserDto();
			BeanUtils.copyProperties(userData, userDto);
			allDetails.add(userDto);
		}
		System.out.println(allDetails.toString());*/
		
		return allDetails;
	}

}
