package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Anciennete implements  Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idAnciennete;
	private double debutTranche, finTranche,tauxAnciennete;
	
	
	
	public Anciennete() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Anciennete(double debutTranche, double finTranche,
			double tauxAnciennete) {
		super();
		this.debutTranche = debutTranche;
		this.finTranche = finTranche;
		this.tauxAnciennete = tauxAnciennete;
	}
	public Long getIdAnciennete() {
		return idAnciennete;
	}
	public void setIdAnciennete(Long idAnciennete) {
		this.idAnciennete = idAnciennete;
	}
	public double getDebutTranche() {
		return debutTranche;
	}
	public void setDebutTranche(double debutTranche) {
		this.debutTranche = debutTranche;
	}
	public double getFinTranche() {
		return finTranche;
	}
	public void setFinTranche(double finTranche) {
		this.finTranche = finTranche;
	}
	public double getTauxAnciennete() {
		return tauxAnciennete;
	}
	public void setTauxAnciennete(double tauxAnciennete) {
		this.tauxAnciennete = tauxAnciennete;
	}
	
}
