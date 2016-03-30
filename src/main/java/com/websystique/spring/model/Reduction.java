package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="reduction_paiement")
public class Reduction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_reduction;
	
	

	public int getId_reduction() {
		return id_reduction;
	}

	public void setId_reduction(int id_reduction) {
		this.id_reduction = id_reduction;
	}
    
	@Column(name = "nom", unique=true, nullable = false)
	private String nom;
	private String value;
	
	
	public Reduction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Reduction(String nom,String value) {
		super();
		this.nom = nom;
		this.setValue(value);
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
