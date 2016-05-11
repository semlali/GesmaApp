package com.websystique.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="mutuelle")
public class Mutuelle implements  Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int idMutuelle;
	private double tauxSalarial , tauxPatronal;
	public Mutuelle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mutuelle(double tauxSalarial, double tauxPatronal) {
		super();
		this.tauxSalarial = tauxSalarial;
		this.tauxPatronal = tauxPatronal;
	}
	public int getIdMutuelle() {
		return idMutuelle;
	}
	public void setIdMutuelle(int idMutuelle) {
		this.idMutuelle = idMutuelle;
	}
	public double getTauxSalarial() {
		return tauxSalarial;
	}
	public void setTauxSalarial(double tauxSalarial) {
		this.tauxSalarial = tauxSalarial;
	}
	public double getTauxPatronal() {
		return tauxPatronal;
	}
	public void setTauxPatronal(double tauxPatronal) {
		this.tauxPatronal = tauxPatronal;
	}
	
	
}
