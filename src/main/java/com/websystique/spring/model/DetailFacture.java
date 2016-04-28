package com.websystique.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class DetailFacture {
  
	@Id
	@GeneratedValue
	private int idDetail;
	
	@ManyToOne
	@JoinColumn
	private Facture facture;
	
	@ManyToOne
	@JoinColumn
	private Frais_Niveau fn;
	
	
	public int getIdDetail() {
		return idDetail;
	}
	public void setIdDetail(int idDetail) {
		this.idDetail = idDetail;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public Frais_Niveau getFn() {
		return fn;
	}
	public void setFn(Frais_Niveau fn) {
		this.fn = fn;
	}
	
	
}
