package com.websystique.spring.model;

public class IGRmodel {
	private Long idIgr;
	private double debutTranche, finTranche,sommeADeduire,taux;
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
