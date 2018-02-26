package com.udemy.backendninja.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.component.ExampleComponent;
import com.udemy.backendninja.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String EXAMPLE_VIEW = "example";
	
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;
	
	//Primera forma
	//@RequestMapping(value="/exampleString", method=RequestMethod.GET) //Antigua Version
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		exampleComponent.sayHellow();
		model.addAttribute("person", new Person("John", 23));
		model.addAttribute("people", getPeople());
		
		return EXAMPLE_VIEW;
	}
	//Segunda Forma
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV()//MAV = ModelAndView
	{
		ModelAndView mov = new ModelAndView(EXAMPLE_VIEW);
		mov.addObject("person", new Person("Mikel", 30));
		mov.addObject("people", getPeople());
		return mov;
	}
	private List<Person> getPeople(){
		List<Person> people = new ArrayList<>();
		people.add(new Person("John",23));
		people.add(new Person("Mikel",30));
		people.add(new Person("Eva",43));
		people.add(new Person("Peter",18));
		return people;
	}
	
}
