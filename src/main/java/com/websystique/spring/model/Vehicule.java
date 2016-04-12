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
    private String etat_roue;
    private String etat_vitre;
    private String etat_siege;
    private String etat_carosserie;
    private String remarques;
	
	
	
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



	public String getEtat_roue() {
		return etat_roue;
	}



	public void setEtat_roue(String etat_roue) {
		this.etat_roue = etat_roue;
	}



	public String getEtat_vitre() {
		return etat_vitre;
	}



	public void setEtat_vitre(String etat_vitre) {
		this.etat_vitre = etat_vitre;
	}



	public String getEtat_siege() {
		return etat_siege;
	}



	public void setEtat_siege(String etat_siege) {
		this.etat_siege = etat_siege;
	}



	public String getEtat_carosserie() {
		return etat_carosserie;
	}



	public void setEtat_carosserie(String etat_carosserie) {
		this.etat_carosserie = etat_carosserie;
	}



	public String getRemarques() {
		return remarques;
	}



	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}

	

}
