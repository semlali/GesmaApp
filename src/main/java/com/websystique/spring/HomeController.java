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

import com.websystique.spring.model.Branche;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Frais;
import com.websystique.spring.model.Frais_Niveau;
import com.websystique.spring.model.Niveau;
import com.websystique.spring.modelMVC.FactureForm;
import com.websystique.spring.modelMVC.FraisNiveau;
import com.websystique.spring.service.PaiementService;


@Controller
public class HomeController {

	@Autowired
	private PaiementService service;
	
	
	@RequestMapping("/")
	public String index() {
		return "home";
	}
	
	
	
	@RequestMapping("/paiementModule")
	public String paiement() {
		return "paiementModule";
	}
	
	
	@RequestMapping("/factureForm")
	public String facture(Model model) {
		model.addAttribute("factureFormulaire", new FactureForm());
		return "factureForm";
	}
	
	@RequestMapping("/ChargerFacture")
	public String chargerFacture(FactureForm f,Model model) {
		Facture facture=service.consulterFacture(f.getNumFacture());
		f.setFacture(facture);
		model.addAttribute("factureFormulaire",f);
		model.addAttribute("etudiant", facture.getEtudiant());
		model.addAttribute("caisse", facture.getCaisse());
		model.addAttribute("reduction", facture.getReduction());
		model.addAttribute("niveau", facture.getFrais_niveau().getNiveau());
		model.addAttribute("frais", facture.getFrais_niveau().getFrais());
		return "factureForm";
	}
	
	@RequestMapping("/paiementForm")
	public String creerfacture(Model model) {
		List<Niveau> niveaux=service.getAllNiveau();
		model.addAttribute("niveaux", niveaux);
		List<Branche> branches=service.getAllBranche();
		model.addAttribute("branches", branches);
		return "paiementForm";
	}
	
	@RequestMapping("/GestionFrais")
	public String getAllFraisNiveau(Model model) {
		List<Frais> frais=service.getAllFrais();
		model.addAttribute("frais", frais);
		List<Niveau> niveaux=service.getAllNiveau();
		model.addAttribute("niveaux", niveaux);
		
		model.addAttribute("GestionFraisFormulaire", new FraisNiveau());
		
		List<Frais_Niveau> niveauFrais=service.getAllNiveauFrais();
		model.addAttribute("niveauFrais",niveauFrais);
		
		return "GestionFrais";
	}
	
	
	@RequestMapping("/addFrais")
	public String gestionFrais(FraisNiveau fn,Model model) {
		
		List<Frais> frais=service.getAllFrais();
		model.addAttribute("frais", frais);
		List<Niveau> niveaux=service.getAllNiveau();
		model.addAttribute("niveaux", niveaux);
		
		model.addAttribute("GestionFraisFormulaire",fn);
		
		System.out.println(fn.getFrais());
		Frais f=service.getFraisById(fn.getFrais());
		fn.setFrai(f);
		
		System.out.println(fn.getNiveau());
		Niveau n=service.getNiveauById(fn.getNiveau());
		fn.setNiv(n);
		
		
		System.out.println(fn.getPrix());
		System.out.println(fn.getReduction());
		
	  //service.setFrais_Niveau(fn.getNiveau(), fn.getFrais(), fn.getPrix(), fn.getReduction());
	  //service.setFrais_Niveau(FraisNiveau);  envoyer un objet au lieu des variables
		
		Frais_Niveau ff=new Frais_Niveau();
		ff.setFrais(f);
		ff.setNiveau(n);
		ff.setPrix(fn.getPrix());
		ff.setReduction(fn.getReduction());
		service.AddFrais_Niveau(ff);
		
		List<Frais_Niveau> niveauFrais=service.getAllNiveauFrais();
		model.addAttribute("niveauFrais",niveauFrais);
		
		
		return "GestionFrais";
		
		
	}
	
	
	
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
    public String updateFrais(Model model,@RequestParam("getId") int getId,FraisNiveau fn) {
		
		model.addAttribute("updateFraisFormulaire",fn);
		
		List<Frais> frais=service.getAllFrais();
		model.addAttribute("frais", frais);
		List<Niveau> niveaux=service.getAllNiveau();
		model.addAttribute("niveaux", niveaux);
		List<Frais_Niveau> niveauFrais=service.getAllNiveauFrais();
		model.addAttribute("niveauFrais",niveauFrais);
		
       
       model.addAttribute("frais_to_update", service.getNiveauFraisById(getId));
		
        System.out.println("id de niveau_frais : "+getId); //here's when I want to see the param
        return "GestionFrais";
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteFrais(Model model,@RequestParam("getId") int getId) {
		
		service.deleteFraisById(getId);
		
		getAllFraisNiveau(model);
		
       
        System.out.println("supprimer frais num : "+getId); //here's when I want to see the param
        
        return "GestionFrais";
    }
	
	
	
	
	@RequestMapping("/updateFrais")
	public String updateFrais(FraisNiveau fn,Model model) {
		
		List<Frais> frais=service.getAllFrais();
		model.addAttribute("frais", frais);
		List<Niveau> niveaux=service.getAllNiveau();
		model.addAttribute("niveaux", niveaux);
		
		model.addAttribute("updateFraisFormulaire",fn);
		
		System.out.println("id frais to update"+fn.getFrais());
		Frais f=service.getFraisById(fn.getFrais());
		fn.setFrai(f);
		
		System.out.println("id niveau to update"+fn.getNiveau());
		Niveau n=service.getNiveauById(fn.getNiveau());
		fn.setNiv(n);
		
     System.out.println("prix ::::"+fn.getPrix());
     System.out.println("reduction ::: "+fn.getReduction());
		
	  service.setFrais_Niveau(fn.getNiveau(), fn.getFrais(), fn.getPrix(), fn.getReduction());
	    
		
		
		
		List<Frais_Niveau> niveauFrais=service.getAllNiveauFrais();
		model.addAttribute("niveauFrais",niveauFrais);
		
		
		return "GestionFrais";
		
		
	}
	
}
