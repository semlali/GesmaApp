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
@Table(name="conge")

public class Conge implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConge;
	private int dureeConge; 
	private Date dateDebut;
	
	@ManyToOne
	private Fonctionnaire fonctionnaire;
	
	@ManyToOne
	private TypeConge typeConge;
	public Conge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Conge(int dureeConge, Date dateDebut) {
		super();
		this.dureeConge = dureeConge;
		this.dateDebut = dateDebut;
	}
	public Long getIdConge() {
		return idConge;
	}
	public void setIdConge(Long idConge) {
		this.idConge = idConge;
	}
	public int getDureeConge() {
		return dureeConge;
	}
	public void setDureeConge(int dureeConge) {
		this.dureeConge = dureeConge;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Fonctionnaire getFonctionnaire() {
		return fonctionnaire;
	}
	public void setFonctionnaire(Fonctionnaire fonctionnaire) {
		this.fonctionnaire = fonctionnaire;
	}
	public TypeConge getTypeConge() {
		return typeConge;
	}
	public void setTypeConge(TypeConge typeConge) {
		this.typeConge = typeConge;
	}
	
	
	
}
