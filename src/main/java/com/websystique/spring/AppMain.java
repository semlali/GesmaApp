package com.websystique.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.configuration.AppConfig;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Frais;
import com.websystique.spring.service.PaiementService;

public class AppMain {

	public static void main(String args[]) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	

		
	
		
		
		context.close();
	}
}
