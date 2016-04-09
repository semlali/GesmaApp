package com.websystique.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.websystique.spring.model.Chauffeur_tr;
import com.websystique.spring.model.Etat_vehicule_tr;
import com.websystique.spring.model.Horaire;
import com.websystique.spring.model.Vehicule;
import com.websystique.spring.service.ITransportService;
import com.websystique.spring.service.TransportServiceImpl;




@Controller
public class HomeController {
	
	@Autowired
	ITransportService service;
	
	@RequestMapping("/")
	public String index() {
		return "home";
	}

	@RequestMapping("/AcceuilTransport")
	public String AcceuilTransport() {
		return "AcceuilTransport";
	}
	
	@RequestMapping("/GestionVehicules")
	public String gestionvehicules(Model model){
		model.addAttribute("vehicules",service.getAllVehicules());
		return "AcceuilVehicules";
		
	}
	
	@RequestMapping("/AjouterVehicule")
	public String AjouterVehicule(Model model){
		Vehicule vehicule = new Vehicule();
		model.addAttribute("vehicule", vehicule);	
		return "AddVehicule";
	}
	

	
	@RequestMapping(value="/Ajouter", method = RequestMethod.POST)
	public String ajouter(@ModelAttribute("vehicule") Vehicule v,Model model){
		service.AjouterVehicule(v);
		model.addAttribute("vehicules",service.getAllVehicules());
	    return "AcceuilVehicules";
		
	}
	
	
	

	
	
}
