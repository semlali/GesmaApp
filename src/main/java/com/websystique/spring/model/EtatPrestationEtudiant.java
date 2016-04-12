package com.websystique.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EtatPrestationEtudiant {
	
	@Id
	@GeneratedValue
	private int id_etat;
	private String etat_transport;
	private String etat_cantine;
	private String etat_inscription;
	
	
	public int getId_etat() {
		return id_etat;
	}
	public void setId_etat(int id_etat) {
		this.id_etat = id_etat;
	}
	public String getEtat_transport() {
		return etat_transport;
	}
	public void setEtat_transport(String etat_transport) {
		this.etat_transport = etat_transport;
	}
	public String getEtat_cantine() {
		return etat_cantine;
	}
	public void setEtat_cantine(String etat_cantine) {
		this.etat_cantine = etat_cantine;
	}
	public String getEtat_inscription() {
		return etat_inscription;
	}
	public void setEtat_inscription(String etat_inscription) {
		this.etat_inscription = etat_inscription;
	}

	
	
}
