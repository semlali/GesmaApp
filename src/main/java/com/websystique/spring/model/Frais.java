package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="FRAIS_PAIEMENT")
public class Frais implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_frais;
	private String nom;
	private String description;
	
	
	public Frais() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Frais(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
