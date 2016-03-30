package com.websystique.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;

import com.websystique.spring.service.PaiementService;


@Controller
public class HomeController {

	@Autowired
	private PaiementService service;
	
	
	@RequestMapping("/")
	public String index() {
		return "home";
	}
	
	@RequestMapping("/factureForm")
	public String facture() {
		return "factureForm";
	}
	
	@RequestMapping("/paiementModule")
	public String paiement() {
		return "paiementModule";
	}
	
	
}
