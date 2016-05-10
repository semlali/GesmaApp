package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@DiscriminatorValue("chauffeur")
@Table(name="chauffeur")
public class Chauffeur extends Fonctionnaire implements Serializable {
   /**
	 * 
	 */
	
private static final long serialVersionUID = 1L;
private int numero_de_permis;


   
public Chauffeur(String nom_fonc, String prenom_fonc, String nom_fonc_ara,
		String prenom_fonc_ara, int matricule, String nationalite, String cin,
		String carte_sejour, Date date_naissance, String lieu_naissance,
		String sexe, String situation_familiale, int nbr_enfants,
		String adresse, String ville, String telephone, String email,
		Date date_travail, Date sortieTravail, int compteBancaire,
		String agenceBancaire, String login, String pass, Boolean cnss,
		Boolean ir, Boolean amo, int numCnss, int numCimr, int numMutuelle,
		Banque banque, Contrat contrat, Double salaireBase,
		Double frais_professionnels,Profession profession,String modeRegelement, int numero_de_permis) {
	super(nom_fonc, prenom_fonc, nom_fonc_ara, prenom_fonc_ara, matricule,
			nationalite, cin, carte_sejour, date_naissance, lieu_naissance,
			sexe, situation_familiale, nbr_enfants, adresse, ville, telephone,
			email, date_travail, sortieTravail, compteBancaire, agenceBancaire,
			login, pass, cnss, ir, amo, numCnss, numCimr, numMutuelle, banque,
			contrat, salaireBase, frais_professionnels, profession, modeRegelement);
	this.numero_de_permis = numero_de_permis;
}



public Chauffeur(String nom_fonc, String prenom_fonc, String nom_fonc_ara,
		String prenom_fonc_ara, int matricule, String nationalite, String cin,
		String carte_sejour, Date date_naissance, String lieu_naissance,
		String sexe, String situation_familiale, int nbr_enfants,
		String adresse, String ville, String telephone, String email,
		Date date_travail, Date sortieTravail, int compteBancaire,
		String agenceBancaire, String login, String pass, Boolean ExoCnss,
		Boolean ExoIr, Boolean ExoAmo, int numCnss, int numCimr,
		int numMutuelle, Banque banque, Contrat contrat, Double salaireBase,
		Double frais_professionnels, Profession profession,
		String modeRegelement, PrimesVariables primesv, int heureSuplementaire,int numero_de_permis) {
	super(nom_fonc, prenom_fonc, nom_fonc_ara, prenom_fonc_ara, matricule,
			nationalite, cin, carte_sejour, date_naissance, lieu_naissance,
			sexe, situation_familiale, nbr_enfants, adresse, ville, telephone,
			email, date_travail, sortieTravail, compteBancaire, agenceBancaire,
			login, pass, ExoCnss, ExoIr, ExoAmo, numCnss, numCimr, numMutuelle,
			banque, contrat, salaireBase, frais_professionnels, profession,
			modeRegelement, primesv,heureSuplementaire);
	this.numero_de_permis = numero_de_permis;
}



public Chauffeur(int numero_de_permis) {
	super();
	this.numero_de_permis = numero_de_permis;
}

public Chauffeur() {
	super();
	// TODO Auto-generated constructor stub
}

public int getNumero_de_permis() {
	return numero_de_permis;
}

public void setNumero_de_permis(int numero_de_permis) {
	this.numero_de_permis = numero_de_permis;
}

   
}
