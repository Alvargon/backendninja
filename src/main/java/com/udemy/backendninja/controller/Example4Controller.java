package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/error")
public class Example4Controller {
	private static final String ERROR_VIEW_404 = "404";
//	private static final String ERROR_VIEW_500 = "500";
	
	@GetMapping("/404")
	public String error404() {		
		return ERROR_VIEW_404;
	}
//	@GetMapping("/500")
//	public String error500() {		
//		return ERROR_VIEW_500;
//	}
	
	
}
