package com.websystique.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Classe {

	@Id
	@GeneratedValue
	private int  id_classe;
	private String nom_classe;
	private String abreviation;
	private String abreviationfr;
	
	@ManyToOne
	@JoinColumn
	private Branche branche;

	public int getId_classe() {
		return id_classe;
	}

	public void setId_classe(int id_classe) {
		this.id_classe = id_classe;
	}

	public String getNom_classe() {
		return nom_classe;
	}

	public void setNom_classe(String nom_classe) {
		this.nom_classe = nom_classe;
	}

	public String getAbreviation() {
		return abreviation;
	}

	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}

	public String getAbreviationfr() {
		return abreviationfr;
	}

	public void setAbreviationfr(String abreviationfr) {
		this.abreviationfr = abreviationfr;
	}

	public Branche getBranche() {
		return branche;
	}

	public void setBranche(Branche branche) {
		this.branche = branche;
	}
	
}
