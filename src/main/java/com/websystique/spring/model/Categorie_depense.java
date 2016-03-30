package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CATEGORIE_DEPENSE")
public class Categorie_depense implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id_categorie;
	private String nom_categorie;
	private String detail;
	
	
	public Categorie_depense() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie_depense(String nom_categorie, String detail) {
		super();
		this.nom_categorie = nom_categorie;
		this.detail = detail;
	}
	public String getNom_categorie() {
		return nom_categorie;
	}
	public void setNom_categorie(String nom_categorie) {
		this.nom_categorie = nom_categorie;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	
}
