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
@Table
public class Depense implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id_depence;
	private String etat;
	private Date date_depence;
	private double montant;
	private String description;
	private String 	titre;
	private float quantite;
	private Date date_paiement;
	
	@ManyToOne
	@JoinColumn
	private Categorie_depense categorie;
	
	@ManyToOne
	@JoinColumn
	private Rubrique_depense rubrique;
	
	@ManyToOne
	@JoinColumn
	private Fournisseur fournisseur;
	
	
	public Categorie_depense getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie_depense categorie) {
		this.categorie = categorie;
	}
	public Rubrique_depense getRubrique() {
		return rubrique;
	}
	public void setRubrique(Rubrique_depense rubrique) {
		this.rubrique = rubrique;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public Depense() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Depense(String etat, Date date_depence, double montant,
			String description, String titre, float quantite, Date date_paiement) {
		super();
		this.etat = etat;
		this.date_depence = date_depence;
		this.montant = montant;
		this.description = description;
		this.titre = titre;
		this.quantite = quantite;
		this.date_paiement = date_paiement;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Date getDate_depence() {
		return date_depence;
	}
	public void setDate_depence(Date date_depence) {
		this.date_depence = date_depence;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public float getQuantite() {
		return quantite;
	}
	public void setQuantite(float quantite) {
		this.quantite = quantite;
	}
	public Date getDate_paiement() {
		return date_paiement;
	}
	public void setDate_paiement(Date date_paiement) {
		this.date_paiement = date_paiement;
	}
	
	
	

}
