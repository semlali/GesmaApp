package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="quartier_tr")
public class Quartier_tr implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_quartier;
	private String nom_quartier;
	private String adresse;
	
	@ManyToOne
	@JoinColumn
	private Circuit_tr circuit;
	

	
	


	public Quartier_tr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quartier_tr(String nom_quartier, String adresse, Circuit_tr circuit) {
		super();
		this.nom_quartier = nom_quartier;
		this.adresse = adresse;
		this.circuit = circuit;
	}

	public int getId_quartier() {
		return id_quartier;
	}

	public void setId_quartier(int id_quartier) {
		this.id_quartier = id_quartier;
	}

	public String getNom_quartier() {
		return nom_quartier;
	}

	public void setNom_quartier(String nom_quartier) {
		this.nom_quartier = nom_quartier;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Circuit_tr getCircuit() {
		return circuit;
	}

	public void setCircuit(Circuit_tr circuit) {
		this.circuit = circuit;
	}
	

}
