package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String EXAMPLE_VIEW = "example";
	
	//Primera forma
	//@RequestMapping(value="/exampleString", method=RequestMethod.GET) //Antigua Version
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		model.addAttribute("person", new Person("John", 23));
		
		return EXAMPLE_VIEW;
	}
	//Segunda Forma
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV()//MAV = ModelAndView
	{
		ModelAndView mov = new ModelAndView(EXAMPLE_VIEW);
		mov.addObject("person", new Person("Mikel", 30));
		return mov;
	}
	
}
