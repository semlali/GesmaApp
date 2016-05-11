package com.websystique.spring.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="primes_fixes")
public class PrimesFixes implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrime;
	private String typePrime;
	private int codePrime;
	private String nomPrime;
	private Double valeurPrime;
	private boolean exoneree;
	
	@ManyToMany
	@JoinTable(name="primes_fixes_par_fonctionaires")
	private Collection<Fonctionnaire> fonctionnaires;
	
	public PrimesFixes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PrimesFixes(String typePrime, int codePrime, String nomPrime,
			Double valeurPrime, boolean exoneree) {
		super();
		this.typePrime = typePrime;
		this.codePrime = codePrime;
		this.nomPrime = nomPrime;
		this.valeurPrime = valeurPrime;
		this.exoneree = exoneree;
	}


	public Long getIdPrime() {
		return idPrime;
	}
	public void setIdPrime(Long idPrime) {
		this.idPrime = idPrime;
	}
	public String getTypePrime() {
		return typePrime;
	}
	public void setTypePrime(String typePrime) {
		this.typePrime = typePrime;
	}
	public int getCodePrime() {
		return codePrime;
	}
	public void setCodePrime(int codePrime) {
		this.codePrime = codePrime;
	}
	public String getNomPrime() {
		return nomPrime;
	}
	public void setNomPrime(String nomPrime) {
		this.nomPrime = nomPrime;
	}
	public Double getValeurPrime() {
		return valeurPrime;
	}
	public void setValeurPrime(Double valeurPrime) {
		this.valeurPrime = valeurPrime;
	}
	public boolean isExoneree() {
		return exoneree;
	}
	public void setExoneree(boolean exoneree) {
		this.exoneree = exoneree;
	}


	public Collection<Fonctionnaire> getFonctionnaires() {
		return fonctionnaires;
	}


	public void setFonctionnaires(Collection<Fonctionnaire> fonctionnaires) {
		this.fonctionnaires = fonctionnaires;
	}

	

}
