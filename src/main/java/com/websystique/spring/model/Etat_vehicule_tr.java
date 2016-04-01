package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Etat_vehicule_tr")
public class Etat_vehicule_tr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_etat_vehicule_tr;
    private String roue;
    private String vitre;
    private String siege;
    private String carosserie;
   
    
   @OneToMany(mappedBy="etat")
   private Collection<Vehicule> vehicules;
    
	
	public Collection<Vehicule> getVehicules() {
	return vehicules;
}
public void setVehicules(Collection<Vehicule> vehicules) {
	this.vehicules = vehicules;
}
	public int getId_etat_vehicule_tr() {
		return id_etat_vehicule_tr;
	}
	public void setId_etat_vehicule_tr(int id_etat_vehicule_tr) {
		this.id_etat_vehicule_tr = id_etat_vehicule_tr;
	}
	public String getRoue() {
		return roue;
	}
	public void setRoue(String roue) {
		this.roue = roue;
	}
	public String getVitre() {
		return vitre;
	}
	public void setVitre(String vitre) {
		this.vitre = vitre;
	}
	public String getSiege() {
		return siege;
	}
	public void setSiege(String siege) {
		this.siege = siege;
	}
	public String getCarosserie() {
		return carosserie;
	}
	public void setCarosserie(String carosserie) {
		this.carosserie = carosserie;
	}
	
	

}

