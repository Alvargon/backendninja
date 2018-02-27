package com.udemy.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.udemy.backendninja.component.ExampleComponent;
import com.udemy.backendninja.component.RequestTimeInterceptor;
import com.udemy.backendninja.service.ExampleService;
import com.udemy.backendninja.service.ServiceEjercicio;

@Controller
@RequestMapping("/ejercicio")
public class Practica2Controller {
	private static final Log LOG = LogFactory.getLog(Practica2Controller.class);
	
	@Autowired
	@Qualifier("serviceEjercicio")
	private ServiceEjercicio serviceEjercicio;
	
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;

	@SuppressWarnings("unused")
	private static final String EXERCICE2_1_VIEW = "ejercicio2_1";
	private static final String EXERCICE2_2_VIEW = "ejercicio2_2";
	
//	@GetMapping("/path1")
//	public String showPath1() {		
//		serviceEjercicio.muestraMensaje();
//		return EXERCICE2_1_VIEW;
//	}
	
	@GetMapping("/path1")
	public RedirectView showPath1(){
		return new RedirectView("/ejercicio/path2"); 
	}
	
	@GetMapping("/path2")
	public ModelAndView showPath2() {	
		serviceEjercicio.muestraMensaje();
		ModelAndView mv = new ModelAndView(EXERCICE2_2_VIEW);
		String cadena="mensaje";
		mv.addObject("ms_chain",cadena);
		return mv;
	}
	

}