package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="horaire_tr")
public class Horaire implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id_horaire;
	
	private int heure1;
	private int heur2;
	private int heure3;
	private int heure4;
	
	public int getId_horaire() {
		return id_horaire;
	}
	public void setId_horaire(int id_horaire) {
		this.id_horaire = id_horaire;
	}
	public int getHeure1() {
		return heure1;
	}
	public void setHeure1(int heure1) {
		this.heure1 = heure1;
	}
	public int getHeur2() {
		return heur2;
	}
	public void setHeur2(int heur2) {
		this.heur2 = heur2;
	}
	public int getHeure3() {
		return heure3;
	}
	public void setHeure3(int heure3) {
		this.heure3 = heure3;
	}
	public int getHeure4() {
		return heure4;
	}
	public void setHeure4(int heure4) {
		this.heure4 = heure4;
	}
	
	
	

}

