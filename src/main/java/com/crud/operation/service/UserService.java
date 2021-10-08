package com.crud.operation.service;

import java.util.List;

import com.crud.operation.dto.UserDto;

public interface UserService {

	UserDto findbyName(String Name);
	UserDto findById(long id);
	List<UserDto> getUsers();
	
	String saveUser(UserDto user);
}
