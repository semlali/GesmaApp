package com.websystique.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.websystique.spring.model.Chauffeur_tr;
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

	@RequestMapping(value="/ModifierVehicule")
	public String ModifierVehicule(@RequestParam(value="id_vehicule") int id,Model model){
	   Vehicule vehicule =service.findById(id); 
	   model.addAttribute("vehicule",vehicule);
	    return "updateV";	
	}
	
	@RequestMapping(value="/Modifier", method = RequestMethod.POST)
	public String modifier(@ModelAttribute("vehicule") Vehicule v,Model model){
		
		if(v.getId_vehicule() == 0){
			//new person, add it
			this.service.AjouterVehicule(v);
		}else{
			//existing person, call update
			this.service.updateVehicule(v);
		}
		
		return "redirect:/GestionVehicules";
	}
	

	@RequestMapping(value="/SupprimerVehicule")
	public String SupprimerVehicule(@RequestParam(value="id_vehicule") int id,Model model){
		
		
			this.service.deleteVehicule(id);
		
		   return "redirect:/GestionVehicules";
	}
	
	@RequestMapping(value="/VerifierEtatVehicule", method = RequestMethod.GET)
	public String getEtatVehicule(@RequestParam(value="id_vehicule") int id,Model model){
	       
		  Vehicule vehicule = this.service.findById(id);
		  model.addAttribute("v",vehicule);
		  System.out.println(vehicule.getEtat_carosserie());
		  return "VerifierEtatVehicule";
	}
	
	@RequestMapping(value="/newfile")
	public String newfilepage(){
		return "NewFile";
	}
	
}
