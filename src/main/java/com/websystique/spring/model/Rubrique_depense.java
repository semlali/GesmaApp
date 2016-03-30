package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Rubrique_depense implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id_rubrique;
	
	private String nom_rubrique;
	private String detail;
	
	public Rubrique_depense() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rubrique_depense(String nom_rubrique, String detail) {
		super();
		this.nom_rubrique = nom_rubrique;
		this.detail = detail;
	}
	public String getNom_rubrique() {
		return nom_rubrique;
	}
	public void setNom_rubrique(String nom_rubrique) {
		this.nom_rubrique = nom_rubrique;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

}
