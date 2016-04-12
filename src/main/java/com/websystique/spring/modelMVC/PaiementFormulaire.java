package com.websystique.spring.modelMVC;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.websystique.spring.model.Frais_Niveau;

public class PaiementFormulaire {
	
	private int n_etudiant;
	private int id_fraisNiveau;
	private Frais_Niveau fraisNiveau;
	private double avance;
	private String typePaiement;
	
	@DateTimeFormat(pattern="yy-M-d")
	private Date datePaiement;
	private int id_caisse;
	

	public int getN_etudiant() {
		return n_etudiant;
	}

	public void setN_etudiant(int n_etudiant) {
		this.n_etudiant = n_etudiant;
	}

	public Frais_Niveau getFraisNiveau() {
		return fraisNiveau;
	}

	public void setFraisNiveau(Frais_Niveau fraisNiveau) {
		this.fraisNiveau = fraisNiveau;
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


	public int getId_fraisNiveau() {
		return id_fraisNiveau;
	}

	public void setId_fraisNiveau(int id_fraisNiveau) {
		this.id_fraisNiveau = id_fraisNiveau;
	}

	public String getTypePaiement() {
		return typePaiement;
	}

	public void setTypePaiement(String typePaiement) {
		this.typePaiement = typePaiement;
	}
	
	

}
