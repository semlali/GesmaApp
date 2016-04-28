package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="FRAIS_NIVEAU_PAIEMENT")
public class Frais_Niveau implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id_frais_niveau;
	
	@ManyToOne
	@JoinColumn
	private Frais frais;
	
	@ManyToOne
	@JoinColumn
	private Niveau niveau;
	
	@ManyToOne
	@JoinColumn
	private CategoriePaiement categoriepaiement;
	
    public CategoriePaiement getCategoriepaiement() {
		return categoriepaiement;
	}

	public void setCategoriepaiement(CategoriePaiement categoriepaiement) {
		this.categoriepaiement = categoriepaiement;
	}

	private Double prix;
	
	private String reduction;

	public Frais_Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Frais_Niveau(Double prix) {
		super();
		this.prix = prix;
	}

	public Frais getFrais() {
		return frais;
	}

	public void setFrais(Frais frais) {
		this.frais = frais;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
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

	public int getId_frais_niveau() {
		return id_frais_niveau;
	}

	public void setId_frais_niveau(int id_frais_niveau) {
		this.id_frais_niveau = id_frais_niveau;
	}

	

}