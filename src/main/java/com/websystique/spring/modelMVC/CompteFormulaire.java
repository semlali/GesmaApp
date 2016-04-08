package com.websystique.spring.modelMVC;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.websystique.spring.model.Branche;
import com.websystique.spring.model.Classe;
import com.websystique.spring.model.Etudiant;
import com.websystique.spring.model.Niveau;

public class CompteFormulaire {
	
	
	private String codeCompte;
	
	@DateTimeFormat(pattern="yy-M-d")
	private Date dateCreation;
	
	private double solde;
	
	public String getCodeCompte() {
		return codeCompte;
	}
	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}

	
	

}
