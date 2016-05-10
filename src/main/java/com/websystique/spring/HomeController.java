package com.websystique.spring;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.websystique.spring.model.Chauffeur;
import com.websystique.spring.model.Etablissement;
import com.websystique.spring.model.Etudiant;
import com.websystique.spring.model.Vehicule;
import com.websystique.spring.service.ITransportService;





@Controller
public class HomeController {
	
	@Autowired
	ITransportService service;
	
	@RequestMapping("/")
	public String index() {
		return "index";
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
	

	
	@RequestMapping("/GestionEtudiants")
	public String gestionetablissement(Model model){
			
	
		model.addAttribute("etudiants",service.getAllEtudiants());
	
		
		return "AcceuilEtudiants";
	}
		

	@RequestMapping(value="/ModifierEtudiantInfo", method = RequestMethod.POST)
	public String ModifierEtablissement(@RequestParam(value="n_etudiant")int id,
			@RequestParam(value="longitude")Double longitude,
			@RequestParam(value="latitude")Double latitude,Model model){
		System.out.println("vvvv"+id);
		Etudiant etudiant = service.findEtudById(id);
		etudiant.setLatitude(latitude);
		etudiant.setLongitude(longitude);
		service.updateEtudiant(etudiant);
		 return "redirect:/GestionEtudiants";
	}

	@RequestMapping(value="/supprimerEtablissement")
	public String supprimerEtablissement(@RequestParam(value="id_etab") int id,Model model){	
		//this.service.deleteEtablissement(id);
		return "redirect:/GestionEtablissements";
	}
	
	@RequestMapping("/AjouterVehicule")
	public String AjouterVehicule(Model model){
		Vehicule vehicule = new Vehicule();
		model.addAttribute("vehicule", vehicule);	
		model.addAttribute("message",false);
		return "AddVehicule";
	}
	

	
	@RequestMapping(value="/Ajouter", method = RequestMethod.POST)
	public String ajouter(@ModelAttribute("vehicule") Vehicule v,Model model){
		service.AjouterVehicule(v);
		model.addAttribute("message",true);
	    return "AddVehicule";	
	}
    
	@RequestMapping(value="/verifierEtatVehicule", method = RequestMethod.POST)
	public @ResponseBody Vehicule getEtatVehicule(@RequestParam(value="EID") int id,Model model){
		System.out.println("voila : "+id);
	    Vehicule v = service.findById(id);
	    return v;

	}
	
	
	@RequestMapping(value="/ModifierVehicule", method = RequestMethod.POST)
	public @ResponseBody Vehicule modifierVehicule(@RequestParam(value="EID") int id,Model model){
		System.out.println("voila : "+id);
	    Vehicule v = service.findById(id);
	    return v;

	}
	
	
	
	@RequestMapping(value="/Modifier", method = RequestMethod.POST)
	public String modifier(@ModelAttribute("vehicule") Vehicule v,Model model){
			this.service.updateVehicule(v);
		     return "redirect:/GestionVehicules";
	}
	

	@RequestMapping(value="/SupprimerVehicule")
	public String SupprimerVehicule(@RequestParam(value="id_vehicule") int id,Model model){
			this.service.deleteVehicule(id);
		   return "redirect:/GestionVehicules";
	}

	  @RequestMapping("/chercherVehicule")
	  public String search(Model model){
	    return "searchVehicule";
	  }
	  
	  @RequestMapping(value="/chargervehicule",method = RequestMethod.POST)
	  public String chercher(@RequestParam(value="numImmatriculation") int numImmatriculation,Model model) {
		  System.out.println("voilaaa"+numImmatriculation);
		Vehicule v = service.findByNumImm(numImmatriculation);
		 System.out.println("voilaaa"+v.getRemarques());
		model.addAttribute("vehicule",v);
	    return "searchVehicule";
	  }

	  @RequestMapping("/GestionChauffeurs")
	  public String gestionChauffeur(Model model){
		model.addAttribute("chauffeurs",service.getAllchauffeurs());
	    return "AcceuilChauffeurs";
	  }
	  

	 
		@RequestMapping(value="/affectationVehicule", method = RequestMethod.POST)
		public @ResponseBody List<Vehicule> afficherVehiculeModal(@RequestParam(value="EID") int id,Model model){
			System.out.println("pk  : "+id);
			List<Vehicule> liste = service.getAllVehiculesChauffeurs();
		    return liste;

		}
            
		@RequestMapping(value="/AffecterVehicule", method = RequestMethod.POST)
		public String affecterAction(@RequestParam(value="numImmatriculation") int numImmatriculation,
				@RequestParam(value="n_fonc") int id){
				
				Vehicule vehicule = service.findByNumImm(numImmatriculation);
				Chauffeur chauffeur = service.findChauffeurById(id);
				System.out.println("chauffeur name "+chauffeur.getNom_fonc());
                 vehicule.setChauffeur(chauffeur);
                 service.updateVehicule(vehicule);
                 
			    return "redirect:/GestionChauffeurs";
		}

		@RequestMapping(value="/test")
		public String test(){
			return "test";
		}
		
		
		@RequestMapping(value="/GestionArrets")
		public String gestionarrets(){
			
			return "AcceuilArrets";
		}
		
		
		
}
