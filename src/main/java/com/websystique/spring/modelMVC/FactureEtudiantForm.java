package com.websystique.spring.modelMVC;

import java.util.List;

import com.websystique.spring.model.Branche;
import com.websystique.spring.model.Classe;
import com.websystique.spring.model.Etudiant;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Niveau;

public class FactureEtudiantForm {

	private int n_etudiant;
	private String nom_etudiant;
	private Facture facture;
	private List<Facture> factures;


	public int getN_etudiant() {
		return n_etudiant;
	}
	public void setN_etudiant(int n_etudiant) {
		this.n_etudiant = n_etudiant;
	}
	public String getNom_etudiant() {
		return nom_etudiant;
	}
	public void setNom_etudiant(String nom_etudiant) {
		this.nom_etudiant = nom_etudiant;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public List<Facture> getFactures() {
		return factures;
	}
	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}
	
	
}
