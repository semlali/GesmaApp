package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="vehicule_tr")
public class Vehicule implements Serializable {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Vehicule(Date dateMiseEnService, int nbreAnneeService, Double poids_total) {
	
		DateMiseEnService = dateMiseEnService;
		this.nbreAnneeService = nbreAnneeService;
		this.poids_total = poids_total;
		
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int numImmatriculation;	
	private Date DateMiseEnService ;
	private int nbreAnneeService;
	private Double poids_total;

	
	@ManyToOne
	@JoinColumn
	private Etat_vehicule_tr etat;
	
	@ManyToOne
	@JoinColumn
	private Chauffeur_tr chauffeur;
	
	@ManyToOne
	@JoinColumn
	private Horaire horaire;
	
	public int getNumImmatriculation() {
		return numImmatriculation;
	}


	public void setNumImmatriculation(int numImmatriculation) {
		this.numImmatriculation = numImmatriculation;
	}


	public Date getDateMiseEnService() {
		return DateMiseEnService;
	}


	public void setDateMiseEnService(Date dateMiseEnService) {
		DateMiseEnService = dateMiseEnService;
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

	
}
