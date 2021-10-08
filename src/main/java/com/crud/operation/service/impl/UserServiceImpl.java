package com.crud.operation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.operation.dto.UserDto;
import com.crud.operation.repository.UserRepository;
import com.crud.operation.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto findbyName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveUser(UserDto user) {
		userRepository.getUserDetailsByMobileName(user., null)
	}

}
