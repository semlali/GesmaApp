package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class CategoriePaiement  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id_categoriePaiement;
	private String categorie;
	public int getId_categoriePaiement() {
		return id_categoriePaiement;
	}
	public void setId_categoriePaiement(int id_categoriePaiement) {
		this.id_categoriePaiement = id_categoriePaiement;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	
	
	

}
