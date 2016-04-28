package com.websystique.spring;


import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import com.websystique.spring.model.CategoriePaiement;
import com.websystique.spring.model.Classe;
import com.websystique.spring.model.Compte;
import com.websystique.spring.model.DetailFacture;
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
import com.websystique.spring.modelMVC.PaiementFormulaire;
import com.websystique.spring.service.PaiementService;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 



@Controller
public class HomeController {

	@Autowired
	private PaiementService service;
	
	
	@RequestMapping("/")
	public String index() {
		return "home";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	
	
	@RequestMapping("/paiementModule")
	public String paiement() {
		return "paiementModule";
	}
	
	
	@RequestMapping("/SearchFacture")
	public String facture(Model model) {
		model.addAttribute("factureFormulaire", new FactureForm());
		return "SearchFacture";
	}
	
	@RequestMapping("/ChargerFacture")
	public String chargerFacture(FactureForm f,Model model) {
		Facture facture=service.consulterFacture(f.getNumFacture());
		f.setFacture(facture);
		model.addAttribute("factureFormulaire",f);
		model.addAttribute("etudiant", facture.getEtudiant());
		model.addAttribute("caisse", facture.getCaisse());
		//model.addAttribute("reduction", facture.getReduction());
		//model.addAttribute("niveau", facture.getFrais_niveau().getNiveau());
		//model.addAttribute("frais", facture.getFrais_niveau().getFrais());
		return "SearchFacture";
	}
	
	@RequestMapping("/PaiementFormulaire")
	public String creerfacture(Model model) {
		List<Niveau> niveaux=service.getAllNiveau();
		model.addAttribute("niveaux", niveaux);
		List<Branche> branches=service.getAllBranche();
		model.addAttribute("branches", branches);
		model.addAttribute("caisses", service.getAllCaisse());
		
		model.addAttribute("paiementFormulaire", new PaiementFormulaire());
		return "PaiementFormulaire";
	}
	
	@RequestMapping("/paiementAdd")
	public String addfacture(Model model,PaiementFormulaire pf) {
	
		
		model.addAttribute("test", true);
		creerfacture(model);
		model.addAttribute("paiementFormulaire", pf);
		//System.out.println("id frais niveau "+pf.getId_fraisNiveau());
		
		Etudiant etudiant=service.getEtudiantById(pf.getN_etudiant());
		Caisse caisse=service.getCaisseById(pf.getId_caisse());
		CategoriePaiement cp=service.getCategorieById(pf.getCategorie());
		//Frais_Niveau fraisNiveau=service.getNiveauFraisById(pf.getId_fraisNiveau());
		
		
		Facture facture=new Facture();
		facture.setAvance(pf.getAvance());
		facture.setCaisse(caisse);
		facture.setDate_facture(pf.getDatePaiement());
		facture.setEtat(true);
	    facture.setEtudiant(etudiant);
	    facture.setTypePaiement(pf.getTypePaiement());
		facture.setCategorie(cp);
		
		//facture.setFrais_niveau(fraisNiveau);
		//facture.setReduction(pf.getReduction());
		//facture.setPrix(fraisNiveau.getPrix());
		model.addAttribute("facture", facture);
		service.addFacture(facture);
		
		if(pf.getFrais1()!=null && pf.getFrais2()==null){
		DetailFacture df1=new DetailFacture();
		Frais fraisId1=service.getFraisByName(pf.getFrais1());
		System.out.println("1er frais: "+fraisId1.getId_frais());
		System.out.println("niveau: "+pf.getCategorie());
		Frais_Niveau fn1= service.getPrixForFraisNiveau(fraisId1.getId_frais(),pf.getNiveau(),pf.getCategorie());
		df1.setFn(fn1);
		df1.setFacture(facture);
		service.addDetailFacture(df1);
		service.updateEtatTransportEtudiant(etudiant,"payé");
		model.addAttribute("detailfacture1", df1);
		}
		
		if(pf.getFrais2()!=null && pf.getFrais1()==null){
		DetailFacture df2=new DetailFacture();
		Frais fraisId2=service.getFraisByName(pf.getFrais2());
		Frais_Niveau fn2= service.getPrixForFraisNiveau(fraisId2.getId_frais(),pf.getNiveau(),pf.getCategorie());
		df2.setFn(fn2);
		df2.setFacture(facture);
		service.addDetailFacture(df2);
		service.updateEtatInscriptionEtudiant(etudiant,"payé");
		model.addAttribute("detailfacture2", df2);
		}
		
		if(pf.getFrais2()!=null && pf.getFrais1()!=null){
			DetailFacture df1=new DetailFacture();
			Frais fraisId1=service.getFraisByName(pf.getFrais1());
			System.out.println("1er frais: "+fraisId1.getId_frais());
			System.out.println("niveau: "+pf.getCategorie());
			Frais_Niveau fn1= service.getPrixForFraisNiveau(fraisId1.getId_frais(),pf.getNiveau(),pf.getCategorie());
			df1.setFn(fn1);
			df1.setFacture(facture);
			service.addDetailFacture(df1);	
			service.updateEtatTransportEtudiant(etudiant,"payé");
			model.addAttribute("detailfacture1", df1);
			
			DetailFacture df2=new DetailFacture();
			Frais fraisId2=service.getFraisByName(pf.getFrais2());
			Frais_Niveau fn2= service.getPrixForFraisNiveau(fraisId2.getId_frais(),pf.getNiveau(),pf.getCategorie());
			df2.setFn(fn2);
			df2.setFacture(facture);
			service.addDetailFacture(df2);
			service.updateEtatInscriptionEtudiant(etudiant,"payé");
			model.addAttribute("detailfacture2", df2);
		}

		
		
		
		
		
		return "PaiementFormulaire";
	}
	
	@RequestMapping("/prestationsGestion")
	public String getAllFraisNiveau(Model model) {
		List<Frais> frais=service.getAllFrais();
		model.addAttribute("frais", frais);
		List<Niveau> niveaux=service.getAllNiveau();
		model.addAttribute("niveaux", niveaux);
		
		
		List<CategoriePaiement> categories=service.getAllcategories();
		model.addAttribute("categories", categories);
		
		model.addAttribute("GestionFraisFormulaire", new FraisNiveau());
		
		List<Frais_Niveau> niveauFrais=service.getAllNiveauFrais();
		model.addAttribute("niveauFrais",niveauFrais);
		
		return "prestationsGestion";
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
		
		System.out.println(fn.getCategorie());
		CategoriePaiement cp=service.getCategorieById(fn.getCategorie());
		fn.setCategoriepaiement(cp);
		
		System.out.println(fn.getPrix());
		System.out.println(fn.getReduction());
		
	  //service.setFrais_Niveau(fn.getNiveau(), fn.getFrais(), fn.getPrix(), fn.getReduction());
	  //service.setFrais_Niveau(FraisNiveau);  envoyer un objet au lieu des variables
		
		Frais_Niveau ff=new Frais_Niveau();
		ff.setFrais(f);
		ff.setNiveau(n);
		ff.setCategoriepaiement(cp);
		ff.setPrix(fn.getPrix());
		ff.setReduction(fn.getReduction());
		service.AddFrais_Niveau(ff);
		
		List<Frais_Niveau> niveauFrais=service.getAllNiveauFrais();
		model.addAttribute("niveauFrais",niveauFrais);
		
		
		return "prestationsGestion";
		
		
	}
	
	

	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public @ResponseBody
	Frais_Niveau updateFrais(Model model,@RequestParam("getId") int getId,FraisNiveau fn) {
		
		System.out.println("id modifier : "+getId); //here's when I want to see the param
		
		
		model.addAttribute("updateFraisFormulaire",fn);
		
		List<Frais> frais=service.getAllFrais();
		model.addAttribute("frais", frais);
		List<Niveau> niveaux=service.getAllNiveau();
		model.addAttribute("niveaux", niveaux);
		List<Frais_Niveau> niveauFrais=service.getAllNiveauFrais();
		model.addAttribute("niveauFrais",niveauFrais);
		
       
       model.addAttribute("frais_to_update", service.getNiveauFraisById(getId));
		
       return service.getNiveauFraisById(getId);
      
        //return "GestionFrais";
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteFrais(Model model,@RequestParam("getId") int getId) throws DataIntegrityViolationException {
		
		service.deleteFraisById(getId);
		
		getAllFraisNiveau(model);
		
       
        System.out.println("supprimer frais num : "+getId); //here's when I want to see the param
        
        return "prestationsGestion";
    }
	
	@ExceptionHandler({DataIntegrityViolationException.class})
    public ModelAndView  handleIOException(Exception ex) {
		ModelAndView model = new ModelAndView("prestationsGestion");
		
		
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
		
		
		return "prestationsGestion";
		
		
	}
	
	@RequestMapping("/gestionDesCaisses")
	public String GestionCaisse(Model model) {
	
		List<Caisse> caisses=service.getAllCaisse();
		model.addAttribute("caisses", caisses);
		
		List<Fonctionnaire> fonctionnaire=service.getAllFontionnaire();
		model.addAttribute("fonctionnaires", fonctionnaire);
		
		model.addAttribute("GestionCaisseFormulaire", new CaisseFormulaire());
		
		return "gestionDesCaisses";
		
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
		
		return "gestionDesCaisses";
		
	}
	
	@RequestMapping(value = "/deleteCaisse", method = RequestMethod.GET)
    public String deleteCaisse(Model model,@RequestParam("getId") int getId) throws DataIntegrityViolationException{
		
		service.deleteCaisseById(getId);
		
		GestionCaisse(model);
		
       
        System.out.println("supprimer caisse num : "+getId); //here's when I want to see the param
        
        return "gestionDesCaisses";
    }
	
	@RequestMapping(value = "/updateCaisse", method = RequestMethod.GET)
    public @ResponseBody
    Caisse updateCaisse(Model model,@RequestParam("getId") int getId,CaisseFormulaire cf) {
		
		
		System.out.println("id update "+getId);
		GestionCaisse(model);
		//model.addAttribute("caisse_to_update", service.getCaisseById(getId));
		
        System.out.println("id de caisse modifié : "+service.getCaisseById(getId).getNom_caisse()); //here's when I want to see the param
        
        return service.getCaisseById(getId);
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
        
        return "gestionDesCaisses";
    }
	
	@RequestMapping("/CreationCompteBanque")
	public String creationCompte(Model model) {
		
		model.addAttribute("comptes", service.getAllCompte());
		model.addAttribute("addCompteFormulaire", new CompteFormulaire());
		
		return "CreationCompteBanque";
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
		
		return "CreationCompteBanque";
		
	}
	
	@RequestMapping(value = "/deleteCompte", method = RequestMethod.GET)
    public String deleteCompte(Model model,@RequestParam("getId") String getId) {
		
		service.deleteCompteByCodeCompte(getId);
		
		creationCompte(model);
		
       
        System.out.println("supprimer compte num : "+getId); //here's when I want to see the param
        
        return "CreationCompteBanque";
    }
	
	
	@RequestMapping(value = "/updateCompte", method = RequestMethod.POST)
    public @ResponseBody
    Compte updateCompte(@RequestParam("getId") String getId) {
		
	    System.out.println("date de compte to update : "+service.getCompteByCode(getId).getDateCreation()); //here's when I want to see the param
        service.getCompteByCode(getId);
        Compte compte=new Compte();
        
        compte.setCodeCompte(service.getCompteByCode(getId).getCodeCompte());
        compte.setDateCreation(service.getCompteByCode(getId).getDateCreation());
        compte.setSolde(service.getCompteByCode(getId).getSolde());
        
        return compte;
    }
	
	@RequestMapping(value = "/updateCompteFormulaire")
    public String updatecompte(Model model,CompteFormulaire cf) {
		
          System.out.println("date compte : "+cf.getCodeCompte());
		
		Compte compte =new Compte();
		compte.setCodeCompte(cf.getCodeCompte());
		compte.setDateCreation(cf.getDateCreation());
		compte.setSolde(cf.getSolde());
		
		
		Fonctionnaire fonc=service.getFonctionnaireById(1);
		compte.setFonctionnaire(fonc);
		
		service.updateCompteByCode(compte);
		
		creationCompte(model);
		
	
	return "CreationCompteBanque";
	
	}
	
	@RequestMapping("/SearchEtudiantFacture")
	public String factureEtudiant(Model model) {
		model.addAttribute("factureEtudiantFormulaire", new FactureEtudiantForm());
		model.addAttribute("etudiants", service.getAllEtudiant());
		return "SearchEtudiantFacture";
	}
	
	
	
	@RequestMapping("/listefactureEtudiant")
	public String listefactureEtudiant(Model model, FactureEtudiantForm f) {
		factureEtudiant(model);
		System.out.println("id etudiant "+f.getN_etudiant());
		model.addAttribute("factures", service.getAllFactureForOneEtudiant(f.getN_etudiant()));
		return "SearchEtudiantFacture";
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
	
	@RequestMapping(value = "/frais", method = RequestMethod.GET)
	public @ResponseBody
	List<Frais> findAllFais() {
		System.out.println("finding all frais");
		return service.getAllFrais();	}
	
	@RequestMapping(value = "/categorie", method = RequestMethod.GET)
	public @ResponseBody
	List<CategoriePaiement> findAllcategorie() {
		System.out.println("finding all categories");
		return service.getAllcategories();	}
	
	
	@RequestMapping(value = "/fraisNiveau", method = RequestMethod.GET)
	public @ResponseBody
	Frais_Niveau findPrixForFraisNiveau(Model model,
			@RequestParam(value = "fraisId", required = true) int fraisId,@RequestParam(value = "stateId", required = true) String niveauName,@RequestParam(value = "categorieId", required = true) int categorieId) {
		//System.out.println("iiiiii :::: "+inscription);
		//System.out.println("tttttt :::: "+transport);
		
		System.out.println("id niveau :::: "+niveauName);
		Set<Frais_Niveau> set =  new HashSet<Frais_Niveau>() ;
		
		Frais_Niveau fn= service.getPrixForFraisNiveau(fraisId,niveauName,categorieId);
		System.out.println("le prix "+fn.getPrix());
		
		set.add(fn);
		
		return fn;	}
	
	   
	@RequestMapping(value = "/findType", method = RequestMethod.GET)
	public @ResponseBody
	Frais_Niveau findType(@RequestParam(value = "getId") int getId,@RequestParam(value = "stateId", required = true) String niveauName,@RequestParam(value = "categorieId", required = true) int categorieId)
			{
		 
		 System.out.println("hello from nothing");
         System.out.println("hello "+getId);
         
         Frais_Niveau fn;
         
         
         
          fn= service.getPrixForFraisNiveau(getId,niveauName,categorieId); 
        
         
        		 
         return fn; 
        
			}
	
	@RequestMapping("/SearchImpaye")
	public String gestionImpaye(Model model) {
		
		
		model.addAttribute("frais",service.getAllFrais());
		model.addAttribute("classes", service.getAllClasse());
		
		return "SearchImpaye";
	}
	
	@RequestMapping("/SearchClasseImpaye")
	public String gestionClasseImpaye(Model model) {
		
		
		model.addAttribute("frais",service.getAllFrais());
		model.addAttribute("classes", service.getAllClasse());
		
		return "SearchClasseImpaye";
	}
	
	@RequestMapping("/impayeAction")
	public String impayeAction(Model model,@RequestParam("classe") int classe,@RequestParam("branche") String branche) {
		
		gestionImpaye(model);
		System.out.println("classe kkkk: "+classe);
		System.out.println("branche: "+branche);
		
		
		
		if(classe!=0) {
			
		model.addAttribute("Etudiant",service.getAllImpaye(classe));
		model.addAttribute("Classe",service.getClasseById(classe));
		
		}else {
			model.addAttribute("Branche",branche);
			System.out.println(branche);
			model.addAttribute("Etudiant",service.getEtatEtudiantByBranche(branche));
		}
			
		System.out.println("whaaat: "+service.getEtatEtudiantByBranche(branche).get(1).getNom_etudiant());
		return "SearchClasseImpaye";
	}
	
	@RequestMapping("/rechercheParEtudiant")
	public String rechercheParEtudiant(Model model,@RequestParam("nomEtu") String nomEtu,@RequestParam("prenomEtu") String prenomEtu) {
		
		
		model.addAttribute("EtudiantOne",service.getEtatEtudiantParNom(nomEtu,prenomEtu));
		
		return "SearchImpaye";
	}
	
	@RequestMapping(value ="/imprimerFacture", method = RequestMethod.GET)
	public String imprimer(Model model,@RequestParam("getId") int getId) {
		
		Facture facture=service.getFactureById(getId);
		List<DetailFacture> list=service.getAllDetailFactureForFacture(facture);
		
		
		
		Document document = new Document(PageSize.A4);
		String string="Samia";
		try {
		
		PdfWriter.getInstance(document,new FileOutputStream("e:/samia.pdf"));
		
		document.open();
		
		document.add(new Paragraph("Date de la facture "+facture.getDate_facture()));
		document.add(new Paragraph("Numéro de la facture "+facture.getNumFacture()));
		document.add(new Paragraph("Nom de l'étudiant "+facture.getEtudiant().getNom_etudiant()+" "+facture.getEtudiant().getPrenom_etudiant()));
		document.add(new Paragraph("Catégorie de paiement: "+facture.getCategorie().getCategorie()));
		document.add(new Paragraph("Type de paiement: "+facture.getTypePaiement()));
		document.add(new Paragraph("Object : Facture de Paiement"));
		
		double total=0.0;
		for(int i=0;i<list.size();i++) {
			
		document.add(new Paragraph(list.get(i).getFn().getFrais().getNom()+" "+list.get(i).getFn().getPrix()));
		total=total+list.get(i).getFn().getPrix();
		}
		document.add(new Paragraph("Total        "+total));
		
		
		} catch (DocumentException de) {
		
		      de.printStackTrace();
	
		} catch (IOException ioe) {
		
		       ioe.printStackTrace();
		
		}
		
		document.close();

		return "home";
	}
	
	@RequestMapping(value = "/ShowModalEmailSms", method = RequestMethod.GET)
	public @ResponseBody
	Etudiant ShowModal(
			@RequestParam(value = "getId", required = true) int getId) {
		
		System.out.println("id de l'étudiant " + getId);
		//System.out.println("branche pour niveau 5eme: "+service.findBrancheForNiveauName("5eme").get(0).getNom_branche());
		return service.getEtudiantById(getId);
	}
	
	@RequestMapping(value = "/envoyerEmail", method = RequestMethod.GET)
	public String envoyerEmail(@RequestParam(value = "idEtudiant", required = true) int idEtudiant,@RequestParam(value = "iradio", required = true) String iradio){
		System.out.println("choix etudiant: "+iradio);
		
		Etudiant etudiant=service.getEtudiantById(idEtudiant);
		if(iradio.equals("email")){
			System.out.println("send email to semlali");
			service.sendFromGMail(etudiant.getEmail());
		  	
		}
		
		return "SearchImpaye";
	}
	
	@RequestMapping(value = "/ShowModalEmailSmsForClasse", method = RequestMethod.GET)
	public @ResponseBody
	String ShowModalForClasse(
			@RequestParam(value = "getId", required = true) String getId) {
		
		System.out.println("classe obtenu " + getId);
		//System.out.println("branche pour niveau 5eme: "+service.findBrancheForNiveauName("5eme").get(0).getNom_branche());
		return getId;
	}
	
	@RequestMapping(value = "/envoyerEmailClass", method = RequestMethod.GET)
	public String envoyerEmailClass(@RequestParam(value = "inputClasse", required = true) String inputClasse,@RequestParam(value = "iradio", required = true) String iradio){
		System.out.println("choix Classe: "+inputClasse);
		
		
		if(iradio.equals("email")){
			System.out.println("send email to classe");
			
		  	List<Etudiant> list = service.findEtudiantForClasseName(inputClasse);
		  	for(int i=0;i<list.size();i++){
		  		service.sendFromGMail(list.get(i).getEmail());
		  	}
		}
		
		return "SearchClasseImpaye";
	}

	@RequestMapping(value = "/ShowModalEmailSmsForBranche", method = RequestMethod.GET)
	public @ResponseBody
	String ShowModalEmailSmsForBranche(
			@RequestParam(value = "getId", required = true) String getId) {
		
		System.out.println("branche obtenu " + getId);
		//System.out.println("branche pour niveau 5eme: "+service.findBrancheForNiveauName("5eme").get(0).getNom_branche());
		return getId;
	}
	
	
	@RequestMapping(value = "/envoyerEmailBranche", method = RequestMethod.GET)
	public String envoyerEmailBranche(@RequestParam(value = "inputBranche", required = true) String inputBranche,@RequestParam(value = "iradio", required = true) String iradio){
		System.out.println("choix Branche: "+inputBranche);
		
		
		if(iradio.equals("email")){
			System.out.println("send email to classe");
			
		  	List<Etudiant> list = service.getEtatEtudiantByBranche(inputBranche);
		  	for(int i=0;i<list.size();i++){
		  		service.sendFromGMail(list.get(i).getEmail());
		  	}
		}
		
		return "SearchClasseImpaye";
	}
	
	
}



