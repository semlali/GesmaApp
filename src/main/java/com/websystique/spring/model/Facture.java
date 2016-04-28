package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="FACTURE_PAIEMENT")
public class Facture implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id_facture;
	
	private String typePaiement;
	private Date date_facture;
	private boolean etat;
	
	@ManyToOne
	@JoinColumn
	private CategoriePaiement categorie;
		
	@ManyToOne
	@JoinColumn
	private Etudiant etudiant;
	
	@ManyToOne
	@JoinColumn
	private Caisse caisse;
	
	
	
	
	
	
	private Double avance;
	private double prix;
	
	private String numFacture;
	
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	public Facture(String numFacture, Date date_facture, boolean etat, Double avance) {
		super();
		this.numFacture=numFacture;
		this.date_facture = date_facture;
		this.etat = etat;
		this.avance = avance;
	}



	public int getId_facture() {
		return id_facture;
	}

	public void setId_facture(int id_facture) {
		this.id_facture = id_facture;
	}

	public Date getDate_facture() {
		return date_facture;
	}

	public void setDate_facture(Date date_facture) {
		this.date_facture = date_facture;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Caisse getCaisse() {
		return caisse;
	}

	public void setCaisse(Caisse caisse) {
		this.caisse = caisse;
	}

    public Double getAvance() {
		return avance;
	}

	public void setAvance(Double avance) {
		this.avance = avance;
	}



	public double getPrix() {
		return prix;
	}



	public void setPrix(double prix) {
		this.prix = prix;
	}



	public String getNumFacture() {
		return numFacture;
	}



	public void setNumFacture(String numFacture) {
		this.numFacture = numFacture;
	}





	public String getTypePaiement() {
		return typePaiement;
	}





	public void setTypePaiement(String typePaiement) {
		this.typePaiement = typePaiement;
	}





	public CategoriePaiement getCategorie() {
		return categorie;
	}





	public void setCategorie(CategoriePaiement categorie) {
		this.categorie = categorie;
	}





	
	
	
	
	

}
