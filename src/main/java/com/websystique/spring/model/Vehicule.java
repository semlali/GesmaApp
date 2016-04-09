package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name="vehicule_tr")
public class Vehicule implements Serializable {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_vehicule;
	private int numImmatriculation;	
	private Date dateMiseEnService;
	private int nbreAnneeService;
	private Double poids_total;

	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="etat_vehicule")
	private Etat_vehicule_tr etat;
	
	@ManyToOne
	@JoinColumn
	private Chauffeur_tr chauffeur;
	
	@ManyToOne
	@JoinColumn
	private Horaire horaire;
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Vehicule(int numImmatriculation, Date dateMiseEnService, int nbreAnneeService, Double poids_total) {
		super();
		this.numImmatriculation = numImmatriculation;
		this.dateMiseEnService = dateMiseEnService;
		this.nbreAnneeService = nbreAnneeService;
		this.poids_total = poids_total;
	
	}


	
	
	public int getNumImmatriculation() {
		return numImmatriculation;
	}


	public void setNumImmatriculation(int numImmatriculation) {
		this.numImmatriculation = numImmatriculation;
	}


	public Date getDateMiseEnService() {
		return dateMiseEnService;
	}


	public void setDateMiseEnService(Date dateMiseEnService) {
		this.dateMiseEnService = dateMiseEnService;
	}


	public int getNbreAnneeService() {
		return nbreAnneeService;
	}


	public void setNbreAnneeService(int nbreAnneeService) {
		this.nbreAnneeService = nbreAnneeService;
	}


	public Double getPoids_total() {
		return poids_total;
	}


	public void setPoids_total(Double poids_total) {
		this.poids_total = poids_total;
	}
    public int getId_vehicule() {
		return id_vehicule;
	}


	public void setId_vehicule(int id_vehicule) {
		this.id_vehicule = id_vehicule;
	}

	
}
