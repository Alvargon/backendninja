package com.udemy.backendninja.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;



import com.udemy.backendninja.service.ExampleService;
import com.udemy.backendninja.service.ServiceEjercicio;


@Service("serviceEjercicio")
public class ServiceEjercicioImp implements ServiceEjercicio {
	private static final Log LOG = LogFactory.getLog(ServiceEjercicioImp.class);


	@Override
	public void muestraMensaje() {
		LOG.info("HELLO FROM SERVICE Ejercicio");	
	}
}
