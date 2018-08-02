package com.shori.TechnologySchool.controller.Exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.shori.TechnologySchool.controller.UserNotFoundException;
//no need of this , will overcomplicate things


@ControllerAdvice
@RestController
public class CustomisedExceptionHandler extends ResponseEntityExceptionHandler{
	
@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) 
			 {
		Exceptions exp = new  Exceptions(new Date(),ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(exp,HttpStatus.INTERNAL_SERVER_ERROR);
}



@ExceptionHandler(UserNotFoundException.class)
public final ResponseEntity<Object> handleUserNotException(UserNotFoundException ex, WebRequest request) 
		 {
	Exceptions exp = new  Exceptions(new Date(),ex.getMessage(), request.getDescription(false));
	return new ResponseEntity(exp,HttpStatus.INTERNAL_SERVER_ERROR);
}
}
