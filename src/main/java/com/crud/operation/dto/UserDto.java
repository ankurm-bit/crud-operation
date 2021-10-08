package com.crud.operation.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreType
public class UserDto implements Serializable {

	private static final long serialVersionUID = 6882977354428736747L;

	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String mobileNumber;
	private String city;

}
