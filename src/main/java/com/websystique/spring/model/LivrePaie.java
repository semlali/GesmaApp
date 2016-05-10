package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="livre_paie")
public class LivrePaie implements  Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 

	private int idLivrePaie;
	private Date dateSaisie;
	
	
	
	public LivrePaie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LivrePaie(Date dateSaisie) {
		super();
		this.dateSaisie = dateSaisie;
	}
	public int getIdLivrePaie() {
		return idLivrePaie;
	}
	public void setIdLivrePaie(int idLivrePaie) {
		this.idLivrePaie = idLivrePaie;
	}
	public Date getDateSaisie() {
		return dateSaisie;
	}
	public void setDateSaisie(Date dateSaisie) {
		this.dateSaisie = dateSaisie;
	}
	
	
}
