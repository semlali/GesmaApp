package com.websystique.spring.model;

import java.util.Date;

public class PrimesVariablesModel {

	private Long idPrimeVariable;
    private String nomPrimeVariable;
    private Double valeurPrimeVariable;
	private String baseAnciennete,imposableCNSS,imposableIR,avantagesNature;
	public String getNomPrimeVariable() {
		return nomPrimeVariable;
	}
	public void setNomPrimeVariable(String nomPrimeVariable) {
		this.nomPrimeVariable = nomPrimeVariable;
	}
	public String getBaseAnciennete() {
		return baseAnciennete;
	}
	public void setBaseAnciennete(String baseAnciennete) {
		this.baseAnciennete = baseAnciennete;
	}
	public String getImposableCNSS() {
		return imposableCNSS;
	}
	public void setImposableCNSS(String imposableCNSS) {
		this.imposableCNSS = imposableCNSS;
	}
	public String getImposableIR() {
		return imposableIR;
	}
	public void setImposableIR(String imposableIR) {
		this.imposableIR = imposableIR;
	}
	public String getAvantagesNature() {
		return avantagesNature;
	}
	public void setAvantagesNature(String avantagesNature) {
		this.avantagesNature = avantagesNature;
	}
	public Long getIdPrimeVariable() {
		return idPrimeVariable;
	}
	public void setIdPrimeVariable(Long idPrimeVariable) {
		this.idPrimeVariable = idPrimeVariable;
	}
	public Double getValeurPrimeVariable() {
		return valeurPrimeVariable;
	}
	public void setValeurPrimeVariable(Double valeurPrimeVariable) {
		this.valeurPrimeVariable = valeurPrimeVariable;
	}
	
	
}
