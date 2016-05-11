package com.websystique.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cnss")
public class CNSS implements  Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCNSS;
	private double tauxSalarial, plafondSalarial, tauxPatronal;
	
	public CNSS(double tauxSalarial, double plafondSalarial, double tauxPatronal) {
		super();
		this.tauxSalarial = tauxSalarial;
		this.plafondSalarial = plafondSalarial;
		this.tauxPatronal = tauxPatronal;
	}
	public CNSS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdCNSS() {
		return idCNSS;
	}
	public void setIdCNSS(int idCNSS) {
		this.idCNSS = idCNSS;
	}
	public double getTauxSalarial() {
		return tauxSalarial;
	}
	public void setTauxSalarial(double tauxSalarial) {
		this.tauxSalarial = tauxSalarial;
	}
	public double getPlafondSalarial() {
		return plafondSalarial;
	}
	public void setPlafondSalarial(double plafondSalarial) {
		this.plafondSalarial = plafondSalarial;
	}
	public double getTauxPatronal() {
		return tauxPatronal;
	}
	public void setTauxPatronal(double tauxPatronal) {
		this.tauxPatronal = tauxPatronal;
	}
	
	
	
}
