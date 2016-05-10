package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity 
@DiscriminatorValue("professeur")
@Table(name="professeur")

public class Professeur extends  Fonctionnaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date date_echelon;
	private String cadre_actuel;
	private Date date_domination_etab;
	private String code_fonctionaire;
	private Date date_titularisation;
	private Date date_cadre;
	private Date date_echel;
	private String echel;
	private String mode_affectation;
	private int annee_scolaire;
	private int id_matiere;
	private int id_conjoint;
	private int id_tache;
	private int id_cycle;
	private String type_acces_echel;
	private String enciennete_echel;
	private Date date_tache;
	private Date date_nomination_delegation;
	private Date date_nomination_academie;
	private String type_fonc;
	
	
	
	
	public Date getDate_echelon() {
		return date_echelon;
	}
	public void setDate_echelon(Date date_echelon) {
		this.date_echelon = date_echelon;
	}
	public String getCadre_actuel() {
		return cadre_actuel;
	}
	public void setCadre_actuel(String cadre_actuel) {
		this.cadre_actuel = cadre_actuel;
	}
	public Date getDate_domination_etab() {
		return date_domination_etab;
	}
	public void setDate_domination_etab(Date date_domination_etab) {
		this.date_domination_etab = date_domination_etab;
	}
	public String getCode_fonctionaire() {
		return code_fonctionaire;
	}
	public void setCode_fonctionaire(String code_fonctionaire) {
		this.code_fonctionaire = code_fonctionaire;
	}
	public Date getDate_titularisation() {
		return date_titularisation;
	}
	public void setDate_titularisation(Date date_titularisation) {
		this.date_titularisation = date_titularisation;
	}
	public Date getDate_cadre() {
		return date_cadre;
	}
	public void setDate_cadre(Date date_cadre) {
		this.date_cadre = date_cadre;
	}
	public Date getDate_echel() {
		return date_echel;
	}
	public void setDate_echel(Date date_echel) {
		this.date_echel = date_echel;
	}
	public String getEchel() {
		return echel;
	}
	public void setEchel(String echel) {
		this.echel = echel;
	}
	public String getMode_affectation() {
		return mode_affectation;
	}
	public void setMode_affectation(String mode_affectation) {
		this.mode_affectation = mode_affectation;
	}
	public int getAnnee_scolaire() {
		return annee_scolaire;
	}
	public void setAnnee_scolaire(int annee_scolaire) {
		this.annee_scolaire = annee_scolaire;
	}
	public int getId_matiere() {
		return id_matiere;
	}
	public void setId_matiere(int id_matiere) {
		this.id_matiere = id_matiere;
	}
	public int getId_conjoint() {
		return id_conjoint;
	}
	public void setId_conjoint(int id_conjoint) {
		this.id_conjoint = id_conjoint;
	}
	public int getId_tache() {
		return id_tache;
	}
	public void setId_tache(int id_tache) {
		this.id_tache = id_tache;
	}
	public int getId_cycle() {
		return id_cycle;
	}
	public void setId_cycle(int id_cycle) {
		this.id_cycle = id_cycle;
	}
	public String getType_acces_echel() {
		return type_acces_echel;
	}
	public void setType_acces_echel(String type_acces_echel) {
		this.type_acces_echel = type_acces_echel;
	}
	public String getEnciennete_echel() {
		return enciennete_echel;
	}
	public void setEnciennete_echel(String enciennete_echel) {
		this.enciennete_echel = enciennete_echel;
	}
	public Date getDate_tache() {
		return date_tache;
	}
	public void setDate_tache(Date date_tache) {
		this.date_tache = date_tache;
	}
	public Date getDate_nomination_delegation() {
		return date_nomination_delegation;
	}
	public void setDate_nomination_delegation(Date date_nomination_delegation) {
		this.date_nomination_delegation = date_nomination_delegation;
	}
	public Date getDate_nomination_academie() {
		return date_nomination_academie;
	}
	public void setDate_nomination_academie(Date date_nomination_academie) {
		this.date_nomination_academie = date_nomination_academie;
	}
	public String getType_fonc() {
		return type_fonc;
	}
	public void setType_fonc(String type_fonc) {
		this.type_fonc = type_fonc;
	}

	
	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professeur(String nom_fonc, String prenom_fonc, String nom_fonc_ara,
			String prenom_fonc_ara, int matricule, String nationalite,
			String cin, String carte_sejour, Date date_naissance,
			String lieu_naissance, String sexe, String situation_familiale,
			int nbr_enfants, String adresse, String ville, String telephone,
			String email, Date date_travail, Date sortieTravail,
			int compteBancaire, String agenceBancaire, String login,
			String pass, Boolean cnss, Boolean ir, Boolean amo, int numCnss,
			int numCimr, int numMutuelle, Banque banque, Contrat contrat,
			Double salaireBase, Double frais_professionnels,Profession profession,String modeRegelement ,String echel) {
		super(nom_fonc, prenom_fonc, nom_fonc_ara, prenom_fonc_ara, matricule,
				nationalite, cin, carte_sejour, date_naissance, lieu_naissance,
				sexe, situation_familiale, nbr_enfants, adresse, ville,
				telephone, email, date_travail, sortieTravail, compteBancaire,
				agenceBancaire, login, pass, cnss, ir, amo, numCnss, numCimr,
				numMutuelle, banque, contrat, salaireBase, frais_professionnels,profession, modeRegelement );
		this.echel = echel;
	}
	public Professeur(String nom_fonc, String prenom_fonc, String nom_fonc_ara,
			String prenom_fonc_ara, int matricule, String nationalite,
			String cin, String carte_sejour, Date date_naissance,
			String lieu_naissance, String sexe, String situation_familiale,
			int nbr_enfants, String adresse, String ville, String telephone,
			String email, Date date_travail, Date sortieTravail,
			int compteBancaire, String agenceBancaire, String login,
			String pass, Boolean ExoCnss, Boolean ExoIr, Boolean ExoAmo,
			int numCnss, int numCimr, int numMutuelle, Banque banque,
			Contrat contrat, Double salaireBase, Double frais_professionnels,
			Profession profession, String modeRegelement,
			PrimesVariables primesv,int heureSuplementaire, String echel) {
		super(nom_fonc, prenom_fonc, nom_fonc_ara, prenom_fonc_ara, matricule,
				nationalite, cin, carte_sejour, date_naissance, lieu_naissance,
				sexe, situation_familiale, nbr_enfants, adresse, ville,
				telephone, email, date_travail, sortieTravail, compteBancaire,
				agenceBancaire, login, pass, ExoCnss, ExoIr, ExoAmo, numCnss,
				numCimr, numMutuelle, banque, contrat, salaireBase,
				frais_professionnels, profession, modeRegelement, primesv, heureSuplementaire);
		this.echel = echel;
	}

	
	
	
}
