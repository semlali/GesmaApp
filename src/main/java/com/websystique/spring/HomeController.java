package com.websystique.spring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mysql.fabric.xmlrpc.base.Array;
import com.websystique.spring.entities.*;
import com.websystique.spring.model.*;
import com.websystique.spring.service.PaieService;


@Controller
@SessionAttributes("profession")

public class HomeController {

	@Autowired
	private PaieService service;
	
	@RequestMapping("/")
	public String index() {
		return "home";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	/*
	@RequestMapping("/")
	public String index() {
		return "index";
	}*/
   
	//salarie
	@RequestMapping("/formSalarie")
	public String Salarie(Model model) {
	   // model.addAttribute("message", false);
        model.addAttribute("listeProfession",service.afficherProfession());
		model.addAttribute("listeTypeContrat",service.afficherTypeContrat());
        model.addAttribute("listeBanque",service.afficherBanque());
	    model.addAttribute("salarieModel",new FonctionnaireModel());
		return "salarie";
	}
	//
	
	@RequestMapping("/updateSalarie")
	public String updateSalarie( Model model) {
		
		model.addAttribute("listeProfession",service.afficherProfession());
	    model.addAttribute("var", false) ;
		model.addAttribute("modelSalarie", new FonctionnaireModel());


		return "updateSalarie";
	}
		
	
	//update salarie
		@RequestMapping("/updateSalarieProfesseur")
		public String updateSalarieProfesseur(FonctionnaireModel fm,Model model) {
			
			
		      model.addAttribute("listeProfession",service.afficherProfession());
		      model.addAttribute("modelSalarie", fm);
			  model.addAttribute("upsuccess",true);
			  Boolean cnss = false, amo=false,ir=false;

			    Banque b= service.getBanqueById(fm.getIdbanque());
				
				TypeContrat typeContrat= service.getTypeContratById(fm.getIdTypeContrat());
				
				Profession p= service.getProfessionById(fm.getIdProfession());
				
				Contrat c= new Contrat(fm.getDateEntree(),fm.getDateSortie(),fm.getSalaireBase(),fm.getModeRegelemnt(),p,typeContrat);
					
				if(fm.getExoAmo()!= null){
				 amo=true;
				}
				else if(fm.getExoCnss()!= null){
					
				 cnss=true;
				}
				else if( fm.getExoIr()!=null){
				 ir=true;
				}
				Professeur prof =new Professeur(
						fm.getNom_fonc(),fm.getPrenom_fonc(),fm.getNom_fonc_ara(),fm.getPrenom_fonc_ara(),
						fm.getMatricule(),fm.getNationalite(),fm.getCin(),fm.getCarte_sejour(),
						fm.getDate_naissance(),fm.getLieu_naissance(),fm.getSexe(),fm.getSituation_familiale(),
						fm.getNbr_enfants(),fm.getAdresse(),fm.getVille(),fm.getTelephone(),fm.getEmail(),
						fm.getDateEntree(),fm.getDateSortie(),fm.getCompteBancaire(),fm.getAgenceBancaire(),
						fm.getLogin(),fm.getPass(),cnss,ir,amo,fm.getNumCnss(),
						fm.getNumCimr(),fm.getNumMutuelle(),b,c,fm.getSalaireBase(),fm.getFrais_professionnels(),p,fm.getModeRegelement(),fm.getEchel());

			  service.updateSalarieProf(prof);
			  
	        return "updateSalarie";
		}
	//update salarie
	@RequestMapping("/updateSalarieChauffeur")
	public String updateSalarieChauffeur(FonctionnaireModel fm,Model model) {
		
		
	      model.addAttribute("listeProfession",service.afficherProfession());
	      model.addAttribute("modelSalarie", fm);
		  model.addAttribute("upsuccess",true);
		  
		  System.out.println("on est a updaaaaaaaaaaate+++++++++++");
		  System.out.println("nom du chauffeur"+fm.getNom_fonc());
		  System.out.println("preneom du chauffeur"+fm.getPrenom_fonc());
		  System.out.println("id du chauffeur"+fm.getN_fonc());
		  System.out.println("id du chauffeur"+fm.getN_fonc());
		  System.out.println(" date naissance du chauffeur"+fm.getDate_naissance());

		    Boolean cnss = false, amo=false,ir=false;

		    Banque b= service.getBanqueById(fm.getIdbanque());
			
			TypeContrat typeContrat= service.getTypeContratById(fm.getIdTypeContrat());
			
			Profession p= service.getProfessionById(fm.getIdProfession());
			
			Contrat c= new Contrat(fm.getDateEntree(),fm.getDateSortie(),fm.getSalaireBase(),fm.getModeRegelemnt(),p,typeContrat);
				
			if(fm.getExoAmo()!= null){
			 amo=true;
			}
			else if(fm.getExoCnss()!= null){
				
			 cnss=true;
			}
			else if( fm.getExoIr()!=null){
			 ir=true;
			}
		  Chauffeur chauffeur =new Chauffeur(
					fm.getNom_fonc(),fm.getPrenom_fonc(),fm.getNom_fonc_ara(),fm.getPrenom_fonc_ara(),
					fm.getMatricule(),fm.getNationalite(),fm.getCin(),fm.getCarte_sejour(),
					fm.getDate_naissance(),fm.getLieu_naissance(),fm.getSexe(),fm.getSituation_familiale(),
					fm.getNbr_enfants(),fm.getAdresse(),fm.getVille(),fm.getTelephone(),fm.getEmail(),
					fm.getDateEntree(),fm.getDateSortie(),fm.getCompteBancaire(),fm.getAgenceBancaire(),
					fm.getLogin(),fm.getPass(),cnss,ir,amo,fm.getNumCnss(),
					fm.getNumCimr(),fm.getNumMutuelle(),b,c,fm.getSalaireBase(),fm.getFrais_professionnels(),p,fm.getModeRegelement(),fm.getNumero_de_permis());
		
		   this.service.updateSalarieChauffeur(chauffeur,fm.getN_fonc());
		  
        return "updateSalarie";
	}
	
	
	//en update salarie
	
	//chercher un employe to up 
	@RequestMapping("/chercherSalarie")
	public String chercherSalarie(FonctionnaireModel fm,Model model, @RequestParam String nom, @RequestParam String prenom ,@RequestParam String profession) {
		
		    model.addAttribute("var", true) ;
			model.addAttribute("upsuccess",false);
            model.addAttribute("listeProfession",service.afficherProfession());
			model.addAttribute("listeTypeContrat",service.afficherTypeContrat());
	        model.addAttribute("listeBanque",service.afficherBanque());
		 if( profession.equals("chauffeur")){
				model.addAttribute("salarieToUpC", service.chercherChauffeurByName(nom, prenom)) ;
		  }
		  else if(profession.equals("professeur")){
				model.addAttribute("salarieToUpP", service.chercherProfesseurByName(nom, prenom)) ;

			  }
	     else {
	 		model.addAttribute("salarieToUpF", service.chercherSalarieByName(nom, prenom)) ;

		  }

		return "updateSalarie";
	}
	@RequestMapping("/ajoutSalarie")
	public String ajoutSalarie(FonctionnaireModel fm,Model model) {
		  
	       model.addAttribute("message", true);

		   model.addAttribute("salarieModel", fm);
		   
			Banque b= service.getBanqueById(fm.getIdbanque());
			
			TypeContrat typeContrat= service.getTypeContratById(fm.getIdTypeContrat());
			
			Profession p= service.getProfessionById(fm.getIdProfession());
			
			Contrat c= new Contrat(fm.getDateEntree(),fm.getDateSortie(),fm.getSalaireBase(),fm.getModeRegelemnt(),p,typeContrat);
				

			Boolean cnss = false, amo=false,ir=false;

			if(fm.getExoAmo()!= null){
			 amo=true;
			}
			else if(fm.getExoCnss()!= null){
				
			 cnss=true;
			}
			else if( fm.getExoIr()!=null){
			 ir=true;
			}
			
			System.out.println("on est avant fonctionaire ");
			Fonctionnaire f= new Fonctionnaire(
			fm.getNom_fonc(),fm.getPrenom_fonc(),fm.getNom_fonc_ara(),fm.getPrenom_fonc_ara(),
			fm.getMatricule(),fm.getNationalite(),fm.getCin(),fm.getCarte_sejour(),
			fm.getDate_naissance(),fm.getLieu_naissance(),fm.getSexe(),fm.getSituation_familiale(),
			fm.getNbr_enfants(),fm.getAdresse(),fm.getVille(),fm.getTelephone(),fm.getEmail(),
			fm.getDateEntree(),fm.getDateSortie(),fm.getCompteBancaire(),fm.getAgenceBancaire(),
			fm.getLogin(),fm.getPass(),cnss,ir,amo,fm.getNumCnss(),
			fm.getNumCimr(),fm.getNumMutuelle(),b,c,fm.getSalaireBase(),fm.getFrais_professionnels(),p,fm.getModeRegelement());
			
			
			
			
			if(fm.getNumero_de_permis()!=null){
				System.out.println("on est a persistance chauffeur");
				Chauffeur chauffeur =new Chauffeur(
						fm.getNom_fonc(),fm.getPrenom_fonc(),fm.getNom_fonc_ara(),fm.getPrenom_fonc_ara(),
						fm.getMatricule(),fm.getNationalite(),fm.getCin(),fm.getCarte_sejour(),
						fm.getDate_naissance(),fm.getLieu_naissance(),fm.getSexe(),fm.getSituation_familiale(),
						fm.getNbr_enfants(),fm.getAdresse(),fm.getVille(),fm.getTelephone(),fm.getEmail(),
						fm.getDateEntree(),fm.getDateSortie(),fm.getCompteBancaire(),fm.getAgenceBancaire(),
						fm.getLogin(),fm.getPass(),cnss,ir,amo,fm.getNumCnss(),
						fm.getNumCimr(),fm.getNumMutuelle(),b,c,fm.getSalaireBase(),fm.getFrais_professionnels(),p,fm.getModeRegelement(),fm.getNumero_de_permis());
						 
						System.out.println("on est a ajouter chauffeur date = "+fm.getDateEntree());
				service.ajouterChauffeur(chauffeur);
			}
			else if(fm.getEchel()!=null){
				System.out.println("on est a persistance professeur");

				Professeur prof =new Professeur(
						fm.getNom_fonc(),fm.getPrenom_fonc(),fm.getNom_fonc_ara(),fm.getPrenom_fonc_ara(),
						fm.getMatricule(),fm.getNationalite(),fm.getCin(),fm.getCarte_sejour(),
						fm.getDate_naissance(),fm.getLieu_naissance(),fm.getSexe(),fm.getSituation_familiale(),
						fm.getNbr_enfants(),fm.getAdresse(),fm.getVille(),fm.getTelephone(),fm.getEmail(),
						fm.getDateEntree(),fm.getDateSortie(),fm.getCompteBancaire(),fm.getAgenceBancaire(),
						fm.getLogin(),fm.getPass(),cnss,ir,amo,fm.getNumCnss(),
						fm.getNumCimr(),fm.getNumMutuelle(),b,c,fm.getSalaireBase(),fm.getFrais_professionnels(),p,fm.getModeRegelement(),fm.getEchel());

				service.ajouterProfesseur(prof);
			}
			else {

			service.ajouterFonctionnaire(f);
			}
			return "redirect:formSalarie";
	}
	
	
	
	//fonction:
	@RequestMapping("/formFonction")
	public String fonction(Model model) {
	     model.addAttribute("message", false);

		return "profession";
	}
	
	
	@RequestMapping("/AjouteFonction")
	public String AjouteFonction (Model model, @RequestParam String nomProfession, @RequestParam String nomProfession_arabe, @RequestParam int codeProfession) {
		Profession p = new Profession(nomProfession,nomProfession_arabe,codeProfession);
		service.ajouterProfession(p);
	     model.addAttribute("message", true);

		return "profession";
	}
	
	@RequestMapping("/formBanque")
	public String formBanque(Model model) {
		model.addAttribute("banqueModel", new BanqueModel());
		model.addAttribute("message", false);

		return "banque";
	}
	
	
	@RequestMapping("/AjouterBanque")
	public String AjourBanque (BanqueModel bm,Model model) {
		System.out.println("on est a ajout ");

		model.addAttribute("banqueModel", bm);
		System.out.println(bm.getTelBanque());
		Banque b= new Banque();
		b.setAdresseBanque(bm.getAdresseBanque());
		b.setFaxeBanque(bm.getFaxeBanque());
		b.setNomBanque(bm.getNomBanque());
		b.setTelBanque(bm.getTelBanque());
		service.ajouterBanque(b);
		
		model.addAttribute("message", true);
		return "banque";
	}
	
	
	
	
	//Anciennete 
	@RequestMapping("/formAnciennete")
	public String Ancienete (Model model) {
		

		model.addAttribute("anciennete", service.afficheAnciennte());
		
		return "anciennete";
	}
	
	 @RequestMapping(value = "/SupprimerAnciennete", method = RequestMethod.GET)
	    public String SupprimerAnciennete(Model model,@RequestParam("getIdToDelete") int getIdToDelete) {
		    Igr(model);
			 service.supprimerAnciennete(getIdToDelete);

	        return "redirect:formAnciennete";
	    }
	
   /* @RequestMapping(value = "/updateAnciennete", method = RequestMethod.GET)
    public String updateAnciennete(Model model,@RequestParam("getId") int getId) {
    	Ancienete(model);
		model.addAttribute("ancienneteToUpdate", service.getAncienneteById(getId));
		model.addAttribute("ancienneteModel", new Anciennete  ());

        return "anciennete";
    }*/
	 
	 @RequestMapping(value = "/validerUpdateAnciennete", method = RequestMethod.GET)
	    public String validerUpdateAnciennete( AncienneteModel au, Model model)		
	    {
		 model.addAttribute("ancienneteModel", au);
		 
	      Anciennete a = new Anciennete(au.getDebutTranche(),au.getFinTranche(),au.getTauxAnciennete());
        
	      System.out.println("on est au controlleur valeur de l'id: "+ au.getIdAnciennete() );
		  service.updateAnciennete(au.getIdAnciennete(), a);
			Ancienete(model);
			return "anciennete";

	    }
	 
	
			@RequestMapping(value = "/updateAnciennete",method = RequestMethod.POST )
		    public @ResponseBody Anciennete updateAnciennete(@RequestParam("getId") int getId) {
			   System.out.println("on est a update ID= "+getId);
			   Anciennete anciennete=new Anciennete();
			//	model.addAttribute("igrModel", new IGR  ());
				anciennete.setDebutTranche(service.getAncienneteById(getId).getDebutTranche());
				anciennete.setFinTranche(service.getAncienneteById(getId).getFinTranche());
				anciennete.setIdAnciennete(service.getAncienneteById(getId).getIdAnciennete());
				anciennete.setTauxAnciennete(service.getAncienneteById(getId).getTauxAnciennete());
				
				System.out.println(" on est a anciennete "+anciennete.getDebutTranche());
		        return anciennete;
		    }
		    
			
			 @RequestMapping(value = "/ajouterAnciennete", method = RequestMethod.POST)
			    public String ajouterAnciennete(Model model,
			    		@RequestParam("debutTranche") int debutTranche,
			    		@RequestParam("finTranche") int finTranche,@RequestParam("taux") int taux
			    		) {
				    
			    	Anciennete a= new Anciennete(debutTranche,finTranche,taux);
					 service.ajouterAnciennete(a);

			        return "redirect:formAnciennete";
			    }
			
	 
	 //IR
	 
	 @RequestMapping("/formIR")
		public String Igr (Model model) {
			

			model.addAttribute("ir", service.afficheIGR());
			
			return "igr";
		}
		
		
	    @RequestMapping(value = "/updateIGR",method = RequestMethod.GET )
	    public @ResponseBody IGR updateIGR(Model model,@RequestParam("getId") int getId) {
		  System.out.println("on est a update ID= "+getId);
		  IGR igr= new IGR();
		  igr.setDebutTranche(service.getIGRById(getId).getDebutTranche());
		  igr.setFinTranche(service.getIGRById(getId).getFinTranche());
		  igr.setIdIgr(service.getIGRById(getId).getIdIgr());
		  igr.setSommeADeduire(service.getIGRById(getId).getSommeADeduire());
		  igr.setTaux(service.getIGRById(getId).getTaux());
		//	model.addAttribute("igrModel", new IGR  ());
			System.out.println("debut tranche : ++++"+igr.getDebutTranche());
            
	        return igr ;
	    }
	    
	    
	    @RequestMapping(value = "/ajouterIGR", method = RequestMethod.POST)
	    public String ajouterIGR(Model model,@RequestParam("sommeADeduire") int sommeADeduire ,
	    		@RequestParam("debutTranche") int debutTranche,
	    		@RequestParam("finTranche") int finTranche,@RequestParam("taux") int taux
	    		) {
		    
	    	IGR igr= new IGR(debutTranche,finTranche,sommeADeduire,taux);
			 service.ajouterIgr(igr);

	        return "redirect:formIR";
	    }
	  @RequestMapping(value = "/SupprimerIGR", method = RequestMethod.GET)
	    public String SupprimerIGR(Model model,@RequestParam("getIdToDelete") int getIdToDelete) {
		    Igr(model);
			 service.supprimerIgr(getIdToDelete);

	        return "redirect:formIR";
	    }
	  
	  
	  
	  @RequestMapping(value = "/validerUpdateIGR", method = RequestMethod.POST)
	    public String validerUpdateIGR( IGRmodel i, Model model)		
	    {
		 model.addAttribute("igrModel", i);
		 IGR igr = new IGR(i.getDebutTranche(),i.getFinTranche(),i.getSommeADeduire(),i.getTaux());
         service.updateIGR(i.getIdIgr(), igr);
		 Igr(model);
	   	System.out.println("on est au controlleur"+i.getIdIgr()+" "+i.getDebutTranche()+""+i.getFinTranche()+""+i.getSommeADeduire()+" "+i.getTaux());  
			return "igr";

	    }
	  
	  //fiche de paie
	  
	  
	  @RequestMapping("/formFichePaie")
		public String fichePaie (Model model) {
			
			model.addAttribute("listeSalaries",service.afficherSalaries());

			
			return "fichePaie";
		}
	  
	  @RequestMapping(value = "/calculerFichePaie", method = RequestMethod.GET)
	    public String calculerFichePaie(Model model, Map <String,Double > map,@RequestParam("salarieSelectionner") int getId) {
		  
            
		    
		    Fonctionnaire f=  service.getSalarieById(getId);
		    //salaire de base
		    map.put("base",  f.getSalaireBase());
		    
		  //allocations famillailes
		    Double primesValue=(double) 0;
            Double allocationsFamilialesSalarial=(double) 0;

		    int j=0;
		   for(int i=0; i< f.getNbr_enfants();i++){
			   if(j<=3){
				   allocationsFamilialesSalarial+=200;
			   j++;
			   }
			   else {
				   allocationsFamilialesSalarial+=36;
				   j++;
			   }
		   }
		   
		    map.put("allocationsFamilialesSalariale", allocationsFamilialesSalarial);
		    
		    //primes value

		    for(int i=0; i<f.getPrimesv().size(); i++)
		    {
		    	primesValue+=f.getPrimesv().iterator().next().getValeur();
		    }
		    map.put("primesValue",  primesValue);
		    
		    // primes Anciennete
		    

		    Double nombreHeureFerierMatin = f.getNombreHeureFerierMatin();
		    Double nombreHeureFerierSoir  =  f.getNombreHeureFerierSoir();
		    Double nombreHeureNormalMatin = f.getNombreHeureNormalMatin();
		    Double nombreHeureNormalSoir =  f.getNombreHeureNormalSoir();
		    
		     Profession profession  = f.getProfession();
		   
		   Double prixJourFerierMatin= profession.getPrixJourFerierMatin();
		   Double prixJourFerierSoir =prixJourFerierSoir= profession.getPrixJourFerierSoir();
		   Double prixJourNormalMatin = profession.getPrixJourNormalMatin();
		   Double prixJourNormalSoir = profession.getPrixJourNormalSoir();
		   
		   Double anciennteValue =   (nombreHeureFerierMatin*prixJourFerierMatin)+
							   (nombreHeureFerierSoir*prixJourFerierSoir)+
							   (nombreHeureNormalMatin*prixJourNormalMatin)+
							   (nombreHeureNormalSoir*prixJourNormalSoir);
		    map.put("primesAnciennete",  anciennteValue);
               /*
		    
		    // calcule amo 
		    
		   Double SalaireBrut = anciennteValue+f.getSalaireBase()+primesValue+(f.getFrais_professionnels()*f.getSalaireBase());// faut encore ajouter frais pro
		   
		   Double  valueAmoSalarial=SalaireBrut*0.2;
		   Double  valueAmoPatronal=SalaireBrut*0.35;

		   if(valueAmoSalarial>6000){
			   valueAmoSalarial=(double)6000;
			    map.put("amoSalarial",  valueAmoSalarial);

		   }
		   if(valueAmoPatronal>6000){
			   valueAmoPatronal=(double)6000;
			    map.put("amoPatronal",  valueAmoPatronal);

		   }
		   else {
			    map.put("amoSalarial",  valueAmoSalarial);
			    map.put("amoPatronal",  valueAmoPatronal);

		   }
		

		    //Allocation familliales partie patronal
            Double allocationsFamilialesPatronal=(double) 0;

		    allocationsFamilialesPatronal=SalaireBrut*0.64;
		    map.put("allocationsFamilialesPatronale", allocationsFamilialesPatronal);

		    // CNSS 
		    
		    Double cnssSalarial = SalaireBrut*0.429;
		    map.put("cnssSalarial", cnssSalarial);
             
		    Double cnssPatronal = SalaireBrut*0.86;
		    map.put("cnssPatronal", cnssPatronal);
              
		    // IR
		    Double salaireBruteIposable = SalaireBrut-f.getExonerations();
		    Double salaireNetImposable = salaireBruteIposable-cnssSalarial;
		     Double sommeADeduire=(double)0 , taux=(double)0;

		    for(int i=0; i<service.afficheIGR().size(); i++){
		     IGR igr = new IGR();
		    	igr=service.getIGRById(i);
		    	Double a= igr.getDebutTranche();
		    	Double b= igr.getFinTranche();
		    	if( a<=SalaireBrut&&SalaireBrut<=b){
		    		sommeADeduire=igr.getSommeADeduire();
		    		taux=igr.getTaux();
		    		break ;
		    	}

		    }
		    Double IRBrut = (salaireNetImposable*taux)-sommeADeduire;
		    Double deductionsParChargesFamiliales=(double)0;
		    int nombrePersonneEnFamille = (f.getNbr_enfants()+1);
		    if(nombrePersonneEnFamille<6){
		    	deductionsParChargesFamiliales=(double) (nombrePersonneEnFamille*30);
		    }
		    else {
		    	deductionsParChargesFamiliales=(double) (6*30);

		    }
		   
            Double IRNet= IRBrut-deductionsParChargesFamiliales;
            model.addAttribute("ir", IRNet);
            
            // Total 
            
            Double totalGainSalarial=(double)0, totalRetenueSalarial=(double)0, totalPartPatronal=(double)0;
         
            totalGainSalarial =f.getSalaireBase()+primesValue;
            totalRetenueSalarial=cnssSalarial+IRNet+valueAmoSalarial;
            totalPartPatronal=cnssPatronal+valueAmoPatronal;
            model.addAttribute("totalGainSalarial", totalGainSalarial);
            model.addAttribute("totalRetenueSalarial", totalRetenueSalarial);
            model.addAttribute("totalPartPatronal", totalPartPatronal);
               
            //salaire Net
            Double salaireNet= totalGainSalarial-totalRetenueSalarial;
            model.addAttribute("salaireNet", salaireNet);
               
               */
		    fichePaie(model);
		    return "fichePaie";
	    }
	  
	  //primes et heures suplementaires 
	  
     @RequestMapping(value = "/formPrimes")
	    public String formPrimes (Model model) {
    	 model.addAttribute("listeProfession", service.afficherProfession());
    	 model.addAttribute("salaries", service.afficherSalaries());
		  return "primes";
	    }
     
     //update prims heures sup for chauque salarie 

     
       @RequestMapping(value = "/updatePrimesHeuresSup", method = RequestMethod.GET  )
	    public  @ResponseBody Fonctionnaire updatePrimesHeuresSup (Model model, @RequestParam("getId") int getId) {

    	   Fonctionnaire f= new Fonctionnaire();
    	
    	 f.setPrimesv(service.getSalarieById(getId).getPrimesv());
    	 f.setNom_fonc(service.getSalarieById(getId).getNom_fonc());
    	 f.setPrenom_fonc(service.getSalarieById(getId).getPrenom_fonc());
    	 f.setNombreHeureFerierMatin(service.getSalarieById(getId).getNombreHeureFerierMatin());
    	 f.setNombreHeureFerierSoir(service.getSalarieById(getId).getNombreHeureFerierSoir());
    	 f.setNombreHeureNormalMatin(service.getSalarieById(getId).getNombreHeureNormalMatin());
    	 f.setNombreHeureNormalSoir(service.getSalarieById(getId).getNombreHeureNormalSoir());
    	 f.setN_fonc(service.getSalarieById(getId).getN_fonc());
    	 System.out.println("on est a updatePrimesHeuresSup id ="+f.getN_fonc());
    	 System.out.println("la taille de prims collection :"+service.getSalarieById(getId).getPrimesv().size());
    	 System.out.println("le contenu de la collection++++"+f.getPrimesv().iterator().next().getNomPrimeVariable());
    	 return f;
	    }
     
     @RequestMapping(value = "/chercherPrimes")
	    public String chercherPrimes (Model model,@RequestParam(value="profession", required=false) int profession) {
 	     
    	 model.addAttribute("listeProfession", service.afficherProfession());

    	 Profession p=service.getProfessionById(profession);
    	 String nomProfession = p.getNomProfession();
		  model.addAttribute("professionChoisie",nomProfession );

		  model.addAttribute("professionChoisie", p.getNomProfession());
		  
    	 if(p.getNomProfession().equals("chauffeur")){
    		 model.addAttribute("modelSalarie", service.afficherListeChauffeur());

    		 
    	 }
    	 else if(p.getNomProfession().equals("professeur")){
    		 model.addAttribute("modelSalarie", service.afficherListeProfesseur());

    	 }
    	 else {
    		 model.addAttribute("modelSalarie",  service.chercherSalarieByProfession(profession));
    		 
    	 }
    	 model.addAttribute("listePrimes", service.afficherPrimes());


		  return "primes";
	    }
     
     //parametrages heures sup 
     @RequestMapping(value = "/formHeuresSupParam")
	    public  String  formHeuresSupParam (Model model) {
    	 
      model.addAttribute("profession", service.afficherProfession());
     
      
	    return "parametresHeuresSup";
	    }
     
     @RequestMapping(value = "/SupprimerHeuresSup", method = RequestMethod.GET)
	    public String SupprimerHeuresSup(Model model,@RequestParam("getIdToDelete") int getIdToDelete) {
		    
			 service.supprimerHeuresSupPara(getIdToDelete);

	        return "redirect:formHeuresSupParam";
	    }
	  
     
     @RequestMapping(value = "/updateHeuresSupPara",method = RequestMethod.POST )
	    public @ResponseBody Profession updateHeuresSupPara(Model model,@RequestParam("getId") int getId) {
		  
	      Profession p= new Profession ();
	      p.setNomProfession(service.getProfessionById(getId).getNomProfession());
	      p.setIdProfession(service.getProfessionById(getId).getIdProfession());
          System.out.println("on est au controlleur updateHeuresSupPara ++++++"+p.getNomProfession());
          System.out.println("on est au controlleur updateHeuresSupPara ++++++"+p.getIdProfession());

     	  
		  p.setPrixJourFerierMatin(service.getProfessionById(getId).getPrixJourFerierMatin());
		  p.setPrixJourFerierSoir(service.getProfessionById(getId).getPrixJourFerierSoir());
          p.setPrixJourNormalMatin(service.getProfessionById(getId).getPrixJourNormalMatin());
	      p.setPrixJourNormalSoir(service.getProfessionById(getId).getPrixJourNormalSoir()); 
      
	     
	   
	      return p ;
	    }
     
     @RequestMapping(value = "validerUpdateHeuresSupParam", method = RequestMethod.POST)
	    public String validerUpdateHeuresSupParam(Model model, @ModelAttribute(value="modelHeuresSupPara")Profession hs)
	    {
	      
    	 
    	 Profession p= service.getProfessionById(hs.getIdProfession().intValue());
		  p.setPrixJourFerierMatin(hs.getPrixJourFerierMatin());
		  p.setPrixJourFerierSoir(hs.getPrixJourFerierSoir());
          p.setPrixJourNormalMatin(hs.getPrixJourNormalMatin());
	      p.setPrixJourNormalSoir(hs.getPrixJourNormalSoir()); 
        
          
		  service.updateProfession(p);
		
		 
	   	   return "redirect:formHeuresSupParam";
	    }
     //parametrages des primes 
     
     @RequestMapping(value = "/formPrimesParam")
	    public  String  formPrimesParam (Model model) {
         model.addAttribute("primesParam", service.afficherPrimesParam());
         model.addAttribute("modelPrimesPara", new PrimesVariablesModel());
         model.addAttribute("validationModel", new PrimesVariablesModel());

         
         
 	
 	    return "parametresPrimes";
	    }
     @RequestMapping(value = "/SupprimerPrimesParam", method = RequestMethod.GET)
	    public String SupprimerPrimesParam(Model model,@RequestParam("getIdToDelete") int getIdToDelete) {
		    
			 service.supprimerPrimesPara(getIdToDelete);

	        return "redirect:formPrimesParam";
	    }
	  
 	
	    @RequestMapping(value = "/updatePrimesPara",method = RequestMethod.GET )
	    public @ResponseBody PrimesVariables updatePrimesPara(Model model,@RequestParam("getId") int getId) {
		  System.out.println("on est a update ID= "+getId);
		  PrimesVariables p= new PrimesVariables();
		  p.setIdPrimeVariable(service.getPrimesVariablesById(getId).getIdPrimeVariable());
		  p.setNomPrimeVariable(service.getPrimesVariablesById(getId).getNomPrimeVariable());
		  p.setAvantagesNature(service.getPrimesVariablesById(getId).getAvantagesNature());
          p.setBaseAnciennete(service.getPrimesVariablesById(getId).getBaseAnciennete());
          p.setImposableCNSS(service.getPrimesVariablesById(getId).getImposableCNSS());
          p.setImposableIR(service.getPrimesVariablesById(getId).getImposableIR());
          p.setValeur(service.getPrimesVariablesById(getId).getValeur());
          System.out.println("on est form update id ="+service.getPrimesVariablesById(getId).getIdPrimeVariable());
	        return p ;
	    }
	    
	    @RequestMapping(value = "ajouterPrimesPara", method = RequestMethod.POST)
	    public String ajouterPrimesPara(Model model,PrimesVariablesModel pv) {
		    
	    	
	     model.addAttribute("modelPrimesPara", pv);
	     Boolean imposableCNSS=false, baseAnciennete=false,avantagesNature=false, imposableIR=false;
		    if( pv.getImposableCNSS()!= null ){ imposableCNSS=true;}
		    if (pv.getImposableIR() != null){ imposableIR=true; }
		    if ( pv.getBaseAnciennete() != null){baseAnciennete=true; }
		    if ( pv.getAvantagesNature() != null){avantagesNature=true;}

		    PrimesVariables p = new PrimesVariables(pv.getNomPrimeVariable(),baseAnciennete,imposableCNSS,imposableIR,avantagesNature, pv.getValeurPrimeVariable());
			
		    service.ajouterPrimes(p);
	        return "redirect:formPrimesParam";
	    }
	    
	    @RequestMapping(value = "validerUpdatePrimesParam", method = RequestMethod.POST)
	    public String validerUpdatePrimesParam(Model model,PrimesVariablesModel pv) {
		 model.addAttribute("validationModel", pv);
		 
		  Boolean imposableCNSS=false, baseAnciennete=false,avantagesNature=false, imposableIR=false;
		    if( pv.getImposableCNSS()!= null ){ imposableCNSS=true;}
		    if (pv.getImposableIR() != null){ imposableIR=true; }
		    if ( pv.getBaseAnciennete() != null){baseAnciennete=true; }
		    if ( pv.getAvantagesNature() != null){avantagesNature=true;}

		    PrimesVariables p = new PrimesVariables(pv.getNomPrimeVariable(),baseAnciennete,imposableCNSS,imposableIR,avantagesNature,pv.getValeurPrimeVariable());
			
		    System.out.println("on est a controlleur id=="+pv.getIdPrimeVariable());
            service.updatePrimesVariables(p, pv.getIdPrimeVariable());
		 
	   	   return "redirect:formPrimesParam";
	    }
	    
	    
	    @RequestMapping(value = "/validerUpdatePrimesSalarie",method = RequestMethod.POST )
	    public  String validerUpdatePrimesSalarie(Model model, @RequestParam(value="primesv[]", required=false) int[] primesv, 
	    		@RequestParam (value="nombreHeureFerierMatin" ,required=false) int  nombreHeureFerierMatin,
	    		@RequestParam (value="nombreHeureFerierSoir" ,required=false) int  nombreHeureFerierSoir,
	    		@RequestParam (value="nombreHeureNormalMatin" ,required=false) int  nombreHeureNormalMatin,
	    		@RequestParam (value="nombreHeureNormalSoir" ,required=false) int  nombreHeureNormalSoir,
	            @RequestParam ("id") Long  id) {
		
	    	
	             Fonctionnaire f =service.getSalarieById(id.intValue());
	             
	             f.setNombreHeureFerierMatin((double)nombreHeureFerierMatin);
	         	 f.setNombreHeureFerierSoir((double)nombreHeureFerierSoir);
	       	     f.setNombreHeureNormalMatin((double)nombreHeureNormalMatin);
	       	     f.setNombreHeureNormalSoir((double)nombreHeureNormalSoir);
		    	 List <PrimesVariables> listeDesPrimes= new ArrayList<PrimesVariables>();
		    	for(int i=0; i<primesv.length;i++)
		    	{
		    		 
		    		  PrimesVariables pv= service.getPrimesVariablesById(primesv[i]);
		    		  listeDesPrimes.add(pv);
		    			
		    	}
		    	
		    	f.setPrimesv(listeDesPrimes);
	    	    System.out.println("le size de la collection ++++++"+f.getPrimesv().size());

	    	    System.out.println("le contenu de la collection+++++ ");

		    
		    	    
		    	Iterator<PrimesVariables> it = f.getPrimesv().iterator();
		    	while (it.hasNext()) // tant que j'ai un element String non parcouru
		    	{
		    	  PrimesVariables s = it.next();
		    	  System.out.println("on es a la boucle "+s.getNomPrimeVariable());
		    
		    	}
		    
		    	 
		         service.updateSalarieHeuresSupPrimes( f );
	           
		         chercherPrimes(model, f.getProfession().getIdProfession().intValue());
	    	
		         return "primes";
	    }
	    

	    
	    @RequestMapping(value = "/listePrimes", method = RequestMethod.GET)
	    public @ResponseBody List<PrimesVariables> listePrimes () {
 	          
	    	List<PrimesVariables> liste=  service.afficherPrimes();

              System.out.println("on es a listes primes ++++++++++++++++++++++++++++++");
		  return liste;
	    }
		
}
