package com.websystique.spring.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
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
	@Column(nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private Boolean baseAnciennete,imposableCNSS,imposableIR,avantagesNature;
	private int code;
	private Double valeur;
	private String type;
	private Date dateAffectation;
	private boolean axoneree;
	 @ManyToMany(mappedBy="primesv")
	    private Set<Fonctionnaire> employees = new HashSet<Fonctionnaire>();
	
	public PrimesVariables() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PrimesVariables(String nomPrimeVariable, Boolean baseAnciennete,
			Boolean imposableCNSS, Boolean imposableIR, Boolean avantagesNature,Double valeur ) {
		super();
		this.nomPrimeVariable = nomPrimeVariable;
		this.baseAnciennete = baseAnciennete;
		this.imposableCNSS = imposableCNSS;
		this.imposableIR = imposableIR;
		this.avantagesNature = avantagesNature;
		this.valeur=valeur;
	}


	public PrimesVariables(String nomPrimeVariable, Boolean baseAnciennete,
			Boolean imposableCNSS, Boolean imposableIR,
			Boolean avantagesNature, int code, Double valeur, String type,
			Date dateAffectation, boolean axoneree) {
		super();
		this.nomPrimeVariable = nomPrimeVariable;
		this.baseAnciennete = baseAnciennete;
		this.imposableCNSS = imposableCNSS;
		this.imposableIR = imposableIR;
		this.avantagesNature = avantagesNature;
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
	public Boolean getBaseAnciennete() {
		return baseAnciennete;
	}
	public void setBaseAnciennete(Boolean baseAnciennete) {
		this.baseAnciennete = baseAnciennete;
	}
	public Boolean getImposableCNSS() {
		return imposableCNSS;
	}
	public void setImposableCNSS(Boolean imposableCNSS) {
		this.imposableCNSS = imposableCNSS;
	}
	public Boolean getImposableIR() {
		return imposableIR;
	}
	public void setImposableIR(Boolean imposableIR) {
		this.imposableIR = imposableIR;
	}
	public Boolean getAvantagesNature() {
		return avantagesNature;
	}
	public void setAvantagesNature(Boolean avantagesNature) {
		this.avantagesNature = avantagesNature;
	}

	
	
	
}
