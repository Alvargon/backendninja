package com.udemy.backendninja.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class ErrorsController  {

	public static final String ISE_VIEW = "error/500";

	@ExceptionHandler(Exception.class)
	public String ShowInternalServerError() {
		return "ISE_VIEW";
	}
}
