package com.websystique.spring.model;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Chauffeur_tr")
public class Chauffeur_tr extends Fonctionnaire {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="chauffeur")
	private Collection<Vehicule> vehicules;
	
	

	public Collection<Vehicule> getVehicules() {
		return vehicules;
	}

	public void setVehicules(Collection<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}

	private int num_permis;
	public Chauffeur_tr() {
		super();
	
	}


	public Chauffeur_tr(int num_permis) {
		super();
		this.num_permis = num_permis;
	}

	public int getNum_permis() {
		return num_permis;
	}

	public void setNum_permis(int num_permis) {
		this.num_permis = num_permis;
	} 
	
	

}

