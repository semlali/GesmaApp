package com.websystique.spring.modelMVC;

import com.websystique.spring.model.Etudiant;

public class FactureForm {
	
	private String numFacture;
	private Etudiant nomEtudiant;
	
	public String getNumFacture() {
		return numFacture;
	}
	public void setNumFacture(String numFacture) {
		this.numFacture = numFacture;
	}
	public Etudiant getNomEtudiant() {
		return nomEtudiant;
	}
	public void setNomEtudiant(Etudiant nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}

}
