package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="compte_bancaire")
public class Compte implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id          //id string donc il est fournit par l'utilisateur
	private String codeCompte;
	private Date dateCreation;
	private double solde;
	
	
	
	@ManyToOne
	@JoinColumn(name="CODE_FONCTIONNAIRE")
	private Fonctionnaire fonctionnaire;
	
	
	@OneToMany(mappedBy="compte")
	private Collection<Operation> operations;
	
	
	public Compte() {
		
	}
	public Compte(String codeCompte, Date dateCreation, double solde) {
		super();
		this.codeCompte = codeCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
	}
	public String getCodeCompte() {
		return codeCompte;
	}
	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Fonctionnaire getFonctionnaire() {
		return fonctionnaire;
	}
	public void setFonctionnaire(Fonctionnaire fonctionnaire) {
		this.fonctionnaire = fonctionnaire;
	}
	public Collection<Operation> getOperations() {
		return operations;
	}
	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}
	
	

}
