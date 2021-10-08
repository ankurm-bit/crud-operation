package com.crud.operation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.operation.dto.UserDto;
import com.crud.operation.service.UserService;

@RestController
public class CrudController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "users")
	public ResponseEntity<?> getUserDetails() {
		return null;
	}

	@PostMapping(value = "/users")
	public ResponseEntity<?> saveUsers(@RequestBody UserDto userDto) {
		try {
			String response = userService.saveUser(userDto);
			return new ResponseEntity<>(response, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
