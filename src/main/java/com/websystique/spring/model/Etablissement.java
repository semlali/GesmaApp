package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="etablissement")
public class Etablissement implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_etablissement;
	private String nom_etablissement;
	private String adresse_etablissement;
	private String ville;
	private String zip_code;
	
	public String getNom_etablissement() {
		return nom_etablissement;
	}
	public void setNom_etablissement(String nom_etablissement) {
		this.nom_etablissement = nom_etablissement;
	}
	
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public int getId_etablissement() {
		return id_etablissement;
	}
	public void setId_etablissement(int id_etablissement) {
		this.id_etablissement = id_etablissement;
	}
	public String getAdresse_etablissement() {
		return adresse_etablissement;
	}
	public void setAdresse_etablissement(String adresse_etablissement) {
		this.adresse_etablissement = adresse_etablissement;
	}


}
