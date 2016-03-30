package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NIVEAU_ETUDIANT")
public class Niveau implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id_niveau;
	
	private String niveau_scolaire;

	
	public Niveau(String niveau_scolaire) {
		super();
		this.niveau_scolaire = niveau_scolaire;
	}

	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNiveau_scolaire() {
		return niveau_scolaire;
	}

	public void setNiveau_scolaire(String niveau_scolaire) {
		this.niveau_scolaire = niveau_scolaire;
	}

}
