package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="FORNISSEUR_DEPENSE")
public class Fournisseur implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id_fournisseur;
	private String nom;
	private String prenom;
	private String adress;
	private String tel;
	private String fax;
	private String couriel;
	private String ville;
	private boolean active;
	
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fournisseur(String nom, String prenom, String adress, String tel,
			String fax, String couriel, String ville, boolean active) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.tel = tel;
		this.fax = fax;
		this.couriel = couriel;
		this.ville = ville;
		this.active = active;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getCouriel() {
		return couriel;
	}
	public void setCouriel(String couriel) {
		this.couriel = couriel;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	
}
