package com.websystique.spring.modelMVC;

import com.websystique.spring.model.Fonctionnaire;

public class CaisseFormulaire {
	private int idcaisse;
	private String nom;
	private int n_fonc;
	private Fonctionnaire fonctionnaire;
	
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public Fonctionnaire getFonctionnaire() {
			return fonctionnaire;
		}
		public void setFonctionnaire(Fonctionnaire fonctionnaire) {
			this.fonctionnaire = fonctionnaire;
		}
		public int getN_fonc() {
			return n_fonc;
		}
		public void setN_fonc(int n_fonc) {
			this.n_fonc = n_fonc;
		}
		public int getIdcaisse() {
			return idcaisse;
		}
		public void setIdcaisse(int idcaisse) {
			this.idcaisse = idcaisse;
		}
		

		
}
