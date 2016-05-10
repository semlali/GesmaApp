package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Banque")
public class Banque implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBanque;
    private String nomBanque;
    private String adresseBanque;
    private int faxeBanque, telBanque;
    @OneToMany(mappedBy="banque")
    private Collection<Fonctionnaire> fonctionnaires;
    
    
	public Banque(String nomBanque, String adresseBanque, int faxeBanque,
			int telBanque) {
		super();
		this.nomBanque = nomBanque;
		this.adresseBanque = adresseBanque;
		this.faxeBanque = faxeBanque;
		this.telBanque = telBanque;
	}
	public Banque() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdBanque() {
		return idBanque;
	}
	public void setIdBanque(Long idBanque) {
		this.idBanque = idBanque;
	}
	public String getNomBanque() {
		return nomBanque;
	}
	public void setNomBanque(String nomBanque) {
		this.nomBanque = nomBanque;
	}
	public String getAdresseBanque() {
		return adresseBanque;
	}
	public void setAdresseBanque(String adresseBanque) {
		this.adresseBanque = adresseBanque;
	}
	public int getFaxeBanque() {
		return faxeBanque;
	}
	public void setFaxeBanque(int faxeBanque) {
		this.faxeBanque = faxeBanque;
	}
	public int getTelBanque() {
		return telBanque;
	}
	public void setTelBanque(int telBanque) {
		this.telBanque = telBanque;
	}
	public Collection<Fonctionnaire> getFonctionnaires() {
		return fonctionnaires;
	}
	public void setFonctionnaires(Collection<Fonctionnaire> fonctionnaires) {
		this.fonctionnaires = fonctionnaires;
	}
    
    
}
