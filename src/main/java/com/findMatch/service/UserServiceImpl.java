package com.findMatch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findMatch.dto.ResponseDto;
import com.findMatch.entity.User;
import com.findMatch.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepository userRepository;

@Override
public Object getAll(Long id1, Long id2) {
	User user1= userRepository.findByprofileId(id1);
	User user2 = userRepository.findByprofileId(id2);
	ResponseDto userDto=new ResponseDto();
	if(user1.getProfileType().equalsIgnoreCase("gold")){
		return user2;
	}else {
		userDto.setName(user2.getName());
		userDto.setCaste(user2.getCaste());
		userDto.setOccupation(user2.getOccupation());
		userDto.setCity(user2.getCity());
		userDto.setHeight(user2.getHeight());
	 return userDto;
	}
	
}

}
