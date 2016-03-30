package com.websystique.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.configuration.AppConfig;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Frais;
import com.websystique.spring.service.PaiementService;

public class AppMain {

	public static void main(String args[]) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		//EmployeeService service = (EmployeeService) context.getBean("employeeService");

		
		PaiementService servicePaiement = (PaiementService) context.getBean("PaiementService");
		
		/*Facture facture= new Facture();
		facture.setPrix(90000);
		servicePaiement.addFacture(facture, 1, 1);*/
		
		/*facture.setAvance(33.33);
		servicePaiement.updateFacture(facture,3);
		
		servicePaiement.deleteFactureByNum(1);*/
		
		Frais frais=new Frais("frais scolarité","pas obligatoir!");
		servicePaiement.addFrais(frais);
		
		/*Niveau niveau =new Niveau("2eme année bac");
		servicePaiement.addNiveau(niveau);*/
		
		//servicePaiement.setFrais_Niveau(2, 1, 9900000, "5%");

		
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
