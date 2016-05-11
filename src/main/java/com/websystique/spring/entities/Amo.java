package com.websystique.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="amo")
public class Amo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  idAmo;
	private double tauxAmoSalarial, tauxAmoPatronale, tauxParticipation;
	
	
	public Amo(double tauxAmoSalarial, double tauxAmoPatronale,
			double tauxParticipation) {
		super();
		this.tauxAmoSalarial = tauxAmoSalarial;
		this.tauxAmoPatronale = tauxAmoPatronale;
		this.tauxParticipation = tauxParticipation;
	}
	
	public Amo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdAmo() {
		return idAmo;
	}
	public void setIdAmo(int idAmo) {
		this.idAmo = idAmo;
	}
	public double getTauxAmoSalarial() {
		return tauxAmoSalarial;
	}
	public void setTauxAmoSalarial(double tauxAmoSalarial) {
		this.tauxAmoSalarial = tauxAmoSalarial;
	}
	public double getTauxAmoPatronale() {
		return tauxAmoPatronale;
	}
	public void setTauxAmoPatronale(double tauxAmoPatronale) {
		this.tauxAmoPatronale = tauxAmoPatronale;
	}
	public double getTauxParticipation() {
		return tauxParticipation;
	}
	public void setTauxParticipation(double tauxParticipation) {
		this.tauxParticipation = tauxParticipation;
	}
	
	
}
