package com.websystique.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="igr")
public class IGR implements  Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idIgr;
	private double debutTranche, finTranche,sommeADeduire,taux;
	
	
	public IGR() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IGR(double debutTranche, double finTranche, double sommeADeduire,
			double taux) {
		super();
		this.debutTranche = debutTranche;
		this.finTranche = finTranche;
		this.sommeADeduire = sommeADeduire;
		this.taux = taux;
	}



	public Long getIdIgr() {
		return idIgr;
	}
	public void setIdIgr(Long idIgr) {
		this.idIgr = idIgr;
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
	public double getSommeADeduire() {
		return sommeADeduire;
	}
	public void setSommeADeduire(double sommeADeduire) {
		this.sommeADeduire = sommeADeduire;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	

}
