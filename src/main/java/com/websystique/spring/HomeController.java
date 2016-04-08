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
		
    	//model.addAttribute(service.getAllVehicules());
		return "AcceuilVehicules";
		
	}
	
	@RequestMapping("/AjouterVehicule")
	public String AjouterVehicule(Model model){
		Vehicule vehicule = new Vehicule();
		model.addAttribute("vehicule",vehicule);	
		return "AddVehicule";
	}
	

	
	@RequestMapping(value="/Ajouter", method = RequestMethod.POST)
	public String ajouter(@ModelAttribute("vehicule") Vehicule v,Model model){
		System.out.println("loll"+v.getNbreAnneeService()+" "+v.getNumImmatriculation());
		service.AjouterVehicule(v);
		model.addAttribute("success", "Vehicule number : " + v.getNumImmatriculation() + " registered successfully");
	    return "AcceuilVehicules";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	@RequestMapping("/showChauffeurs")
	public String showChauffeurs(Model model) {	
		//model.addAttribute("chauffeurs",service.getAlldrivers());	
		return "showAlldrivers";
	}
	
	@RequestMapping("/ajouterChauffeur")
	public String formChauffeur(Model model) {	
		model.addAttribute("chauffeur",new Chauffeur_tr());
		System.out.println("loliiii");
		return "AjouterChauffeur";
	}
	
	@RequestMapping("/addChauffeur")
	public String saveChauffeur(Chauffeur_tr ch,Model model){
	model.addAttribute("chauffeur",ch);
	
	Chauffeur_tr chauffeur = new Chauffeur_tr();
	chauffeur.setNom_fonc(ch.getNom_fonc());
	chauffeur.setPrenom_fonc(ch.getPrenom_fonc());
	chauffeur.setAdresse(ch.getAdresse());
    chauffeur.setCin(ch.getCin());
    chauffeur.setLieu_naissance(ch.getLieu_naissance());
    chauffeur.setDate_naissance(ch.getDate_naissance()); 
   // service.AjouterChauffeur(ch);
   // model.addAttribute("chauffeurs",service.getAlldrivers());	
	return "showAlldrivers";
	} */
	
	
}
