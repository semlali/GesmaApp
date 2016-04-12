package com.websystique.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="primes_variables")
public class PrimesVariables implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrimeVariable;
	private String nomPrimeVariable;
	private int code;
	private Double valeur;
	private String type;
	private Date dateAffectation;
	private boolean axoneree;
	
	@ManyToMany
	@JoinTable(name="primes_variables_par_fonctionaires")
	private Collection<Fonctionnaire> fonctionnaires;
	
	public PrimesVariables() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PrimesVariables(String nomPrimeVariable, int code, Double valeur,
			String type, Date dateAffectation, boolean axoneree) {
		super();
		this.nomPrimeVariable = nomPrimeVariable;
		this.code = code;
		this.valeur = valeur;
		this.type = type;
		this.dateAffectation = dateAffectation;
		this.axoneree = axoneree;
	}
	public Long getIdPrimeVariable() {
		return idPrimeVariable;
	}
	public void setIdPrimeVariable(Long idPrimeVariable) {
		this.idPrimeVariable = idPrimeVariable;
	}
	public String getNomPrimeVariable() {
		return nomPrimeVariable;
	}
	public void setNomPrimeVariable(String nomPrimeVariable) {
		this.nomPrimeVariable = nomPrimeVariable;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Double getValeur() {
		return valeur;
	}
	public void setValeur(Double valeur) {
		this.valeur = valeur;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateAffectation() {
		return dateAffectation;
	}
	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}
	public boolean isAxoneree() {
		return axoneree;
	}
	public void setAxoneree(boolean axoneree) {
		this.axoneree = axoneree;
	}
	public Collection<Fonctionnaire> getFonctionnaires() {
		return fonctionnaires;
	}
	public void setFonctionnaires(Collection<Fonctionnaire> fonctionnaires) {
		this.fonctionnaires = fonctionnaires;
	}
	
	
	
}
