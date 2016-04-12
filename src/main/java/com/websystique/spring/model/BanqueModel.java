package com.websystique.spring.model;
public class BanqueModel {
	private String nomBanque;
    private String adresseBanque;
    private int faxeBanque, telBanque;
    
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
    
 
}
