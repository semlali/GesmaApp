package com.websystique.spring;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.websystique.spring.model.Branche;
import com.websystique.spring.model.Caisse;
import com.websystique.spring.model.Classe;
import com.websystique.spring.model.Compte;
import com.websystique.spring.model.Etudiant;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Fonctionnaire;
import com.websystique.spring.model.Frais;
import com.websystique.spring.model.Frais_Niveau;
import com.websystique.spring.model.Niveau;
import com.websystique.spring.modelMVC.CaisseFormulaire;
import com.websystique.spring.modelMVC.CompteFormulaire;
import com.websystique.spring.modelMVC.FactureEtudiantForm;
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
    public String deleteFrais(Model model,@RequestParam("getId") int getId) throws DataIntegrityViolationException {
		
		service.deleteFraisById(getId);
		
		getAllFraisNiveau(model);
		
       
        System.out.println("supprimer frais num : "+getId); //here's when I want to see the param
        
        return "GestionFrais";
    }
	
	@ExceptionHandler({DataIntegrityViolationException.class})
    public ModelAndView  handleIOException(Exception ex) {
		ModelAndView model = new ModelAndView("GestionFrais");
		
		
		List<Frais> frais =service.getAllFrais();
		model.addObject("frais", frais);
		List<Niveau> niveaux=service.getAllNiveau();
		model.addObject("niveaux", niveaux);
		model.addObject("GestionFraisFormulaire", new FraisNiveau());
		List<Frais_Niveau> niveauFrais=service.getAllNiveauFrais();
		model.addObject("niveauFrais",niveauFrais);
		model.addObject("error", true);
         
        return model;
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
	
	@RequestMapping("/GestionCaisse")
	public String GestionCaisse(Model model) {
	
		List<Caisse> caisses=service.getAllCaisse();
		model.addAttribute("caisses", caisses);
		
		List<Fonctionnaire> fonctionnaire=service.getAllFontionnaire();
		model.addAttribute("fonctionnaires", fonctionnaire);
		
		model.addAttribute("GestionCaisseFormulaire", new CaisseFormulaire());
		
		return "GestionCaisse";
		
	}
	
	@RequestMapping("/addCaisse")
	public String addCaisse(CaisseFormulaire cf,Model model) {
		
		Caisse c=new Caisse();
		c.setNom_caisse(cf.getNom());
		Fonctionnaire fonc=new Fonctionnaire();
		fonc.setN_fonc(cf.getN_fonc());
		c.setFonctionnaire(fonc);
		service.addCaisse(c);
		
		List<Caisse> caisses=service.getAllCaisse();
		model.addAttribute("caisses", caisses);
		
        List<Fonctionnaire> fonctionnaire=service.getAllFontionnaire();
		model.addAttribute("fonctionnaires", fonctionnaire);
		
		model.addAttribute("GestionCaisseFormulaire",cf);
		
		return "GestionCaisse";
		
	}
	
	@RequestMapping(value = "/deleteCaisse", method = RequestMethod.GET)
    public String deleteCaisse(Model model,@RequestParam("getId") int getId) throws DataIntegrityViolationException{
		
		service.deleteCaisseById(getId);
		
		GestionCaisse(model);
		
       
        System.out.println("supprimer caisse num : "+getId); //here's when I want to see the param
        
        return "GestionCaisse";
    }
	
	@RequestMapping(value = "/updateCaisse", method = RequestMethod.GET)
    public String updateCaisse(Model model,@RequestParam("getId") int getId,CaisseFormulaire cf) {
		
		GestionCaisse(model);
		model.addAttribute("caisse_to_update", service.getCaisseById(getId));
		
        System.out.println("id de caisse modifié : "+service.getCaisseById(getId).getNom_caisse()); //here's when I want to see the param
        
        return "GestionCaisse";
    }
	
	@RequestMapping(value = "/updateCaisseForm")
    public String updateCaisseForm(Model model,CaisseFormulaire cf) {
		
		
		model.addAttribute("GestionCaisseFormulaire", cf);
		
        Caisse caisse=new Caisse();
        
        caisse.setNom_caisse(cf.getNom());
        
        Fonctionnaire fonctionnaire=service.getFonctionnaireById(cf.getN_fonc());
        
        caisse.setFonctionnaire(fonctionnaire);
        
        System.out.println("nom fonctionnaire"+fonctionnaire.getNom_fonc());
        
        service.updateCaisse(caisse, cf.getIdcaisse());
        
        GestionCaisse(model);
        
        return "GestionCaisse";
    }
	
	@RequestMapping("/creationCompte")
	public String creationCompte(Model model) {
		
		model.addAttribute("comptes", service.getAllCompte());
		model.addAttribute("addCompteFormulaire", new CompteFormulaire());
		
		return "creationCompte";
	}
	
	@RequestMapping("/addCompte")
	public String addCompte(Model model,CompteFormulaire cf) {
		
		
		System.out.println("date compte : "+cf.getDateCreation());
		
		Compte compte =new Compte();
		compte.setCodeCompte(cf.getCodeCompte());
		compte.setDateCreation(cf.getDateCreation());
		compte.setSolde(cf.getSolde());
		
		
		Fonctionnaire fonc=service.getFonctionnaireById(1);
		compte.setFonctionnaire(fonc);
		
		service.addCompte(compte);
		
		creationCompte(model);
		
		return "creationCompte";
		
	}
	
	@RequestMapping(value = "/deleteCompte", method = RequestMethod.GET)
    public String deleteCompte(Model model,@RequestParam("getId") String getId) {
		
		service.deleteCompteByCodeCompte(getId);
		
		creationCompte(model);
		
       
        System.out.println("supprimer compte num : "+getId); //here's when I want to see the param
        
        return "creationCompte";
    }
	
	
	@RequestMapping(value = "/updateCompte", method = RequestMethod.GET)
    public String updateCompte(Model model,@RequestParam("getId") String getId,CompteFormulaire cf) {
		
		creationCompte(model);
		
       
       model.addAttribute("compte_to_update", service.getCompteByCode(getId));
		
        System.out.println("id de compte : "+getId); //here's when I want to see the param
        return "creationCompte";
    }
	
	@RequestMapping(value = "/updateCompteFormulaire")
    public String updateCompteFormulaire(Model model,CompteFormulaire cf) {
		
		
		Compte compte =new Compte();
		compte.setSolde(cf.getSolde());
		compte.setCodeCompte(cf.getCodeCompte());
		System.out.println("code: "+cf.getCodeCompte());
		
		Fonctionnaire fonc=service.getFonctionnaireById(1);
		compte.setFonctionnaire(fonc);
		
		service.updateCompteByCode(compte);
		
		creationCompte(model);
		
	
	return "creationCompte";
	
	}
	
	@RequestMapping("/factureEtudiant")
	public String factureEtudiant(Model model) {
		model.addAttribute("factureEtudiantFormulaire", new FactureEtudiantForm());
		model.addAttribute("etudiants", service.getAllEtudiant());
		return "factureEtudiant";
	}
	
	
	
	@RequestMapping("/listefactureEtudiant")
	public String listefactureEtudiant(Model model, FactureEtudiantForm f) {
		factureEtudiant(model);
		System.out.println("id etudiant "+f.getN_etudiant());
		model.addAttribute("factures", service.getAllFactureForOneEtudiant(f.getN_etudiant()));
		return "factureEtudiant";
	}
	
	@RequestMapping(value = "/etudiants", method = RequestMethod.GET)
	public @ResponseBody
	List<Etudiant> etudiantForClasse(
			@RequestParam(value = "stateName", required = true) String state) {
		
		System.out.println("finding etudiant for classe " + state);
		//System.out.println("branche pour niveau 5eme: "+service.findBrancheForNiveauName("5eme").get(0).getNom_branche());
		return service.findEtudiantForClasseName(state);
	}
	
	
	@RequestMapping(value = "/classes", method = RequestMethod.GET)
	public @ResponseBody
	List<Classe> classeForBranche(
			@RequestParam(value = "stateName", required = true) String state) {
		
		System.out.println("finding classes for branche " + state);
		//System.out.println("branche pour niveau 5eme: "+service.findBrancheForNiveauName("5eme").get(0).getNom_branche());
		return service.findClasseForBrancheName(state);
	}
	
	@RequestMapping(value = "/cities", method = RequestMethod.GET)
	public @ResponseBody
	List<Branche> citiesForState(
			@RequestParam(value = "stateName", required = true) String state) {
		
		System.out.println("finding branches for niveau " + state);
		System.out.println("branche pour niveau 5eme: "+service.findBrancheForNiveauName("5eme").get(0).getNom_branche());
		return service.findBrancheForNiveauName(state);
	}

	@RequestMapping(value = "/states", method = RequestMethod.GET)
	public @ResponseBody
	List<Niveau> findAllStates(Model model) {
		System.out.println("finding all niveaux");
		return service.getAllNiveau();
		
	}
	
}
