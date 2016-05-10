package com.websystique.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Branche {
	
	@Id
	@GeneratedValue
	private int id_branche;
	private String nom_branche;
	private int code_branche;
	private String nom_branche_fr;
	private String abreviation_ara;
	private String abreviation_fr;
	private String code_branche_statistique;
	private int active;
	private int technique;
	
	@ManyToOne
	@JoinColumn
	private Niveau niveau;

	public String getNom_branche() {
		return nom_branche;
	}

	public void setNom_branche(String nom_branche) {
		this.nom_branche = nom_branche;
	}

	public int getCode_branche() {
		return code_branche;
	}

	public void setCode_branche(int code_branche) {
		this.code_branche = code_branche;
	}

	public String getNom_branche_fr() {
		return nom_branche_fr;
	}

	public void setNom_branche_fr(String nom_branche_fr) {
		this.nom_branche_fr = nom_branche_fr;
	}

	public String getAbreviation_ara() {
		return abreviation_ara;
	}

	public void setAbreviation_ara(String abreviation_ara) {
		this.abreviation_ara = abreviation_ara;
	}

	public String getAbreviation_fr() {
		return abreviation_fr;
	}

	public void setAbreviation_fr(String abreviation_fr) {
		this.abreviation_fr = abreviation_fr;
	}

	public String getCode_branche_statistique() {
		return code_branche_statistique;
	}

	public void setCode_branche_statistique(String code_branche_statistique) {
		this.code_branche_statistique = code_branche_statistique;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getTechnique() {
		return technique;
	}

	public void setTechnique(int technique) {
		this.technique = technique;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

}
