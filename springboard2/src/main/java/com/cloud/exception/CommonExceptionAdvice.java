package com.cloud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class CommonExceptionAdvice {
	
	//오류 코드 등 예외 처리
	@ExceptionHandler(Exception.class)
	public String except(Exception ex, Model model) {
		model.addAttribute("exception", ex);
		return "error_page";
	}
	
	//404 - 페이지 오류
	
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handle404(NoHandlerFoundException ex) {
		return "custom404";
	}
	
	
}
