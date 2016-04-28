package com.websystique.spring.modelMVC;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.websystique.spring.model.Frais_Niveau;

public class PaiementFormulaire {
	
	private int n_etudiant;
	private double avance;
	private String typePaiement;
	
	@DateTimeFormat(pattern="yy-M-d")
	private Date datePaiement;
	private int id_caisse;
	
	private int categorie;
	
	private String niveau;
	
	private String frais1;
	private String frais2;
	
	private String reduction;
	

	public String getFrais1() {
		return frais1;
	}

	public void setFrais1(String frais1) {
		this.frais1 = frais1;
	}

	public String getFrais2() {
		return frais2;
	}

	public void setFrais2(String frais2) {
		this.frais2 = frais2;
	}

	public int getN_etudiant() {
		return n_etudiant;
	}

	public void setN_etudiant(int n_etudiant) {
		this.n_etudiant = n_etudiant;
	}

	

	public double getAvance() {
		return avance;
	}

	public void setAvance(double avance) {
		this.avance = avance;
	}

	public Date getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}

	public int getId_caisse() {
		return id_caisse;
	}

	public void setId_caisse(int id_caisse) {
		this.id_caisse = id_caisse;
	}


	

	public String getTypePaiement() {
		return typePaiement;
	}

	public void setTypePaiement(String typePaiement) {
		this.typePaiement = typePaiement;
	}

	

	public int getCategorie() {
		return categorie;
	}

	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}

	public String getReduction() {
		return reduction;
	}

	public void setReduction(String reduction) {
		this.reduction = reduction;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
	

}
