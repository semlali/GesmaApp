package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="prets")
public class Prets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPret;
	private Double valeurTotale;
	private Double retenueMensuelle;
	private Date dateAffectation;
	
	@ManyToOne
	private Fonctionnaire fonctionnaire;
	
	public Fonctionnaire getFonctionnaire() {
		return fonctionnaire;
	}
	public void setFonctionnaire(Fonctionnaire fonctionnaire) {
		this.fonctionnaire = fonctionnaire;
	}
	public Prets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prets(Double valeurTotale, Double retenueMensuelle,
			Date dateAffectation) {
		super();
		this.valeurTotale = valeurTotale;
		this.retenueMensuelle = retenueMensuelle;
		this.dateAffectation = dateAffectation;
	}
	public Long getIdPret() {
		return idPret;
	}
	public void setIdPret(Long idPret) {
		this.idPret = idPret;
	}
	public Double getValeurTotale() {
		return valeurTotale;
	}
	public void setValeurTotale(Double valeurTotale) {
		this.valeurTotale = valeurTotale;
	}
	public Double getRetenueMensuelle() {
		return retenueMensuelle;
	}
	public void setRetenueMensuelle(Double retenueMensuelle) {
		this.retenueMensuelle = retenueMensuelle;
	}
	public Date getDateAffectation() {
		return dateAffectation;
	}
	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}
	public Fonctionnaire getFonctionaire() {
		return fonctionnaire;
	}
	public void setFonctionaire(Fonctionnaire fonctionnaire) {
		this.fonctionnaire = fonctionnaire;
	}
	
	
}
