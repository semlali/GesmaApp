package com.websystique.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="avances")
public class Avances implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAvance;
	private Double valeurAvance;
	private Date dateAffectation;
	
	@ManyToOne
	private Fonctionnaire fonctionnaire;
	public Avances() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Avances(Double valeurAvance, Date dateAffectation) {
		super();
		this.valeurAvance = valeurAvance;
		this.dateAffectation = dateAffectation;
	}

	public Long getIdAvance() {
		return idAvance;
	}
	public void setIdAvance(Long idAvance) {
		this.idAvance = idAvance;
	}
	public Double getValeurAvance() {
		return valeurAvance;
	}
	public void setValeurAvance(Double valeurAvance) {
		this.valeurAvance = valeurAvance;
	}
	public Date getDateAffectation() {
		return dateAffectation;
	}
	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}

	public Fonctionnaire getFonctionnaire() {
		return fonctionnaire;
	}

	public void setFonctionnaire(Fonctionnaire fonctionnaire) {
		this.fonctionnaire = fonctionnaire;
	}
	
	

}
