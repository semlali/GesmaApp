package com.websystique.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.configuration.AppConfig;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Fonctionnaire;
import com.websystique.spring.model.Frais;
import com.websystique.spring.model.Frais_Niveau;
import com.websystique.spring.model.Niveau;
import com.websystique.spring.service.PaiementService;

public class AppMain {

	public static void main(String args[]) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		//EmployeeService service = (EmployeeService) context.getBean("employeeService");

		
		PaiementService servicePaiement = (PaiementService) context.getBean("PaiementService");
		
		List<Niveau> f=servicePaiement.getAllNiveauName();
		
		System.out.println(" niveau scolaire: "+f.get(1));
		
		
		//servicePaiement.deleteFraisById(1);
		//System.out.println(servicePaiement.getNiveauFraisById(1).getPrix());
		
		/*Facture facture= new Facture();
		
		facture=servicePaiement.consulterFacture("120");
		System.out.println(facture.getEtudiant().getNom_etudiant());*/
		
		/*facture.setAvance(33.33);
		servicePaiement.updateFacture(facture,3);
		
		servicePaiement.deleteFactureByNum(1);*/
		
		/*Frais frais=new Frais("frais scolarité","pas obligatoir!");
		servicePaiement.addFrais(frais);*/
		
		/*Niveau niveau =new Niveau("2eme année bac");
		servicePaiement.addNiveau(niveau);*/
		
		
		servicePaiement.setFrais_Niveau(1,1,999,"999");

		
		//Reduction red= new Reduction("heho", "1");
		//servicePaiement.addReduction(red);
		
		//Reduction redu = new Reduction("sam","5");
		//servicePaiement.updateReduction(redu,1);
		
		//servicePaiement.deleteReductionByName("sam");
	    
		
		/*Caisse caisse=new Caisse("caisse2");
		servicePaiement.addCaisse(caisse,1);
		servicePaiement.updateCaisse(caisse, 1);
		servicePaiement.deleteCaisseByName("caisse2");*/
		 
		

		
	
		
		
		context.close();
	}
}
