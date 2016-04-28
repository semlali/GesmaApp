package com.websystique.spring.modelMVC;

import com.websystique.spring.model.CategoriePaiement;
import com.websystique.spring.model.Frais;
import com.websystique.spring.model.Niveau;

public class FraisNiveau {
	
	private int numFraisNiveau;
	private int niveau;
	private Niveau niv;
	private Frais frai;
	private int frais;
	private Double prix;
	private String reduction;
	private int categorie;
	private CategoriePaiement categoriepaiement;
	
	
	public int getCategorie() {
		return categorie;
	}
	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}
	public CategoriePaiement getCategoriepaiement() {
		return categoriepaiement;
	}
	public void setCategoriepaiement(CategoriePaiement categoriepaiement) {
		this.categoriepaiement = categoriepaiement;
	}
	public int getNumFraisNiveau() {
		return numFraisNiveau;
	}
	public void setNumFraisNiveau(int numFraisNiveau) {
		this.numFraisNiveau = numFraisNiveau;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public int getFrais() {
		return frais;
	}
	public void setFrais(int frais) {
		this.frais = frais;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public String getReduction() {
		return reduction;
	}
	public void setReduction(String reduction) {
		this.reduction = reduction;
	}
	
	public Niveau getNiv() {
		return niv;
	}
	public void setNiv(Niveau niv) {
		this.niv = niv;
	}
	public Frais getFrai() {
		return frai;
	}
	public void setFrai(Frais frai) {
		this.frai = frai;
	}
	
	
	

}
