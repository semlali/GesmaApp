package com.websystique.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="parametres_societe")
public class ParametresSociete implements  Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int idParametres;
	private double nbrHeureJour, nbrJourMois,tauxTravailMinimum;
	
	
	public ParametresSociete(double nbrHeureJour, double nbrJourMois,
			double tauxTravailMinimum) {
		super();
		this.nbrHeureJour = nbrHeureJour;
		this.nbrJourMois = nbrJourMois;
		this.tauxTravailMinimum = tauxTravailMinimum;
	}
	public ParametresSociete() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdParametres() {
		return idParametres;
	}
	public void setIdParametres(int idParametres) {
		this.idParametres = idParametres;
	}
	public double getNbrHeureJour() {
		return nbrHeureJour;
	}
	public void setNbrHeureJour(double nbrHeureJour) {
		this.nbrHeureJour = nbrHeureJour;
	}
	public double getNbrJourMois() {
		return nbrJourMois;
	}
	public void setNbrJourMois(double nbrJourMois) {
		this.nbrJourMois = nbrJourMois;
	}
	public double getTauxTravailMinimum() {
		return tauxTravailMinimum;
	}
	public void setTauxTravailMinimum(double tauxTravailMinimum) {
		this.tauxTravailMinimum = tauxTravailMinimum;
	}
	
}
