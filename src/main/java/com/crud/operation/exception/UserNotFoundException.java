package com.crud.operation.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -145510545447572047L;

	public UserNotFoundException(String message) {
		super(message);
	}
}
