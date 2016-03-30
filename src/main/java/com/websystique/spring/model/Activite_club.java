package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Activite_club implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id_activiteClub;
	
	private String nom_activite;
	private String description;
	private Date date_activite;
	
	@ManyToOne
	@JoinColumn
	private Club club;

	
	public Activite_club() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Activite_club(String nom_activite, String description,
			Date date_activite) {
		super();
		this.nom_activite = nom_activite;
		this.description = description;
		this.date_activite = date_activite;
	}

	public String getNom_activite() {
		return nom_activite;
	}

	public void setNom_activite(String nom_activite) {
		this.nom_activite = nom_activite;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate_activite() {
		return date_activite;
	}

	public void setDate_activite(Date date_activite) {
		this.date_activite = date_activite;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}
	

}
