package com.example.SpringBoot_Application.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<String> handleUserNotFound(UserNotFoundException userNotFoundException) {
		return new ResponseEntity<>(userNotFoundException.getMessage(), HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<String> handleGeneralException(Exception exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler
	public ResponseEntity<String> handRoleNotFoundException(RoleNoteFoundException roleNoteFoundException) {
		return new ResponseEntity<>(roleNoteFoundException.getMessage(), HttpStatus.NOT_FOUND);
	}
}
