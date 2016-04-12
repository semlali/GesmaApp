package com.websystique.spring;



import java.util.Collection;
import java.util.Date;

import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.websystique.entities.*;
import com.websystique.spring.model.*;
import com.websystique.spring.service.PaieService;


@Controller
public class HomeController {

	@Autowired
	private PaieService service;
	
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	//salarie
	@RequestMapping("/formSalarie")
	public String Salarie(Model model) {
		model.addAttribute("listeProfession",service.afficherProfession());
		model.addAttribute("listeTypeContrat",service.afficherTypeContrat());
        model.addAttribute("listeBanque",service.afficherBanque());
		model.addAttribute("salarie",new FonctionnaireModel());
		
		
		return "salarie";
	}
	
	@RequestMapping("/ajouterSalarie")
	public String ajouterSalarie (FonctionnaireModel fm , Model model) {
		Boolean cnss = false, amo=false,ir=false;
		model.addAttribute("salarie", fm);
		Banque b= service.getBanqueById(fm.getIdbanque());
		TypeContrat type_c= service.getTypeContratById(fm.getIdTypeContrat());
		Profession p= service.getProfessionById(fm.getIdProfession());
		System.out.println("profession :"+p.getNomProfession()+"id: "+p.getIdProfession());
		Contrat c= new Contrat(fm.getDateEntree(),fm.getDateSortie(),fm.getSalaireBase(),fm.getModeRegelemnt(),p,type_c);
		System.out.println("on est a contrat "+c.getDateEntree()+" "+c.getDateSortie()+""+c.getSalaireBase()+" "+c.getModeRegelemnt()+" "+c.getProfession().getNomProfession()+""+c.getTypecontrat());
				
				
				if(fm.getAmo()!= null){
		 amo=true;
		}
		else if(fm.getCnss()!= null){
			
		 cnss=true;
		}
		else if( fm.getIr()!=null){
		 ir=true;
		}
		
		Fonctionnaire f= new Fonctionnaire(
		fm.getNom_fonc(),fm.getPrenom_fonc(),fm.getNom_fonc_ara(),fm.getPrenom_fonc_ara(),
		fm.getMatricule(),fm.getNationalite(),fm.getCin(),fm.getCarte_sejour(),
		fm.getDate_naissance(),fm.getLieu_naissance(),fm.getSexe(),fm.getSituation_familiale(),
		fm.getNbr_enfants(),fm.getAdresse(),fm.getVille(),fm.getTelephone(),fm.getEmail(),
		fm.getDateEntree(),fm.getDateSortie(),fm.getCompteBancaire(),fm.getAgenceBancaire(),
		fm.getLogin(),fm.getPass(),cnss,ir,amo,fm.getNumCnss(),
		fm.getNumCimr(),fm.getNumMutuelle(),c,b);
		
		System.out.println("on est a fonctionnaire"+f.getNom_fonc());
		
		
		//service.ajouterFonctionnaire(f);
	
					
					
		return "index";
	}
	
	//fonction:
	@RequestMapping("/formFonction")
	public String fonction() {
		return "profession";
	}
	
	
	@RequestMapping("/ajoutSalarie")
	public String AjoutSalarie(Model model, 
			
    @RequestParam String nomProfession) {
		return "index";
	}
	@RequestMapping("/formBanque")
	public String index(Model model) {
		model.addAttribute("banqueModel", new BanqueModel());
		return "banque";
	}
	
	
	@RequestMapping("/AjouterBanque")
	public String AjourBanque (BanqueModel bm,Model model) {
		System.out.println("on est a ajout ");

		model.addAttribute("banqueModel", bm);
		Banque b= new Banque();
		b.setAdresseBanque(bm.getAdresseBanque());
		b.setFaxeBanque(bm.getFaxeBanque());
		b.setNomBanque(bm.getNomBanque());
		b.setTelBanque(bm.getTelBanque());
		service.ajouterBanque(b);
		
		return "index";
	}
	
	
	
	@RequestMapping("/AjouteFonction")
	public String AjouteFonction (Model model, @RequestParam String nomProfession) {
		Profession p = new Profession(nomProfession);

		service.ajouterProfession(p);
		
		return "index";
	}
	//Anciennete 
	@RequestMapping("/formAncienete")
	public String Ancienete (Model model) {
		

		model.addAttribute("anciennete", service.afficheAnciennte());
		
		return "anciennete";
	}
	
	
	
    @RequestMapping(value = "/updateAnciennete", method = RequestMethod.GET)
    public String updateAnciennete(Model model,@RequestParam("getId") int getId) {
    	Ancienete(model);
		model.addAttribute("ancienneteToUpdate", service.getAncienneteById(getId));
		model.addAttribute("ancienneteModel", new Anciennete  ());

        return "anciennete";
    }
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
	 
	 //IR
	 
	 @RequestMapping("/formIR")
		public String Igr (Model model) {
			

			model.addAttribute("ir", service.afficheIGR());
			
			return "igr";
		}
		
	  @RequestMapping(value = "/updateIGR", method = RequestMethod.GET)
	    public String updateIGR(Model model,@RequestParam("getId") int getId) {
		    Igr(model);
			model.addAttribute("igrToUpdate", service.getIGRById(getId));
			model.addAttribute("igrModel", new IGR  ());

	        return "igr";
	    }
	  
	  
	  
	  @RequestMapping(value = "/validerUpdateIGR", method = RequestMethod.GET)
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
			

			
			return "fichePaie";
		}
}
