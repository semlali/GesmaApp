package com.websystique.spring.modelMVC;
import com.websystique.spring.model.Facture;

public class FactureForm {
	
	private String numFacture;
	private Facture facture;
	
	public String getNumFacture() {
		return numFacture;
	}
	public void setNumFacture(String numFacture) {
		this.numFacture = numFacture;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	

}
