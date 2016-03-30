package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Fonctionnaire implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int n_fonc;
	
	private String nom_fonc;
	private String prenom_fonc;
	private String nom_fonc_ara;
	private String prenom_fonc_ara;
	private int matricule;
	private String nationalite;
	private String cin;
	private Date date_naissance;
	private String lieu_naissance;
	private String sexe;
	private int echelon;
	private Date date_echelon;
	private String cadre_actuel;
	private Date date_domination_etab;
	private String situation_familiale;
	private int nbr_enfants;
	private String adresse;
	private String ville;
	private String telephone;
	private String email;
	private String photo_fonc;
	private Date date_travail;
	private String login;
	private String pass;
	private String code_fonctionaire;
	private Date date_titularisation;
	private Date date_cadre;
	private Date date_echel;
	private String type_acces_echel;
	private String enciennete_echel;
	private Date date_tache;
	private Date date_nomination_delegation;
	private Date date_nomination_academie;
	private String type_fonc;
	private Date date_situation_familiale;
	private String echel;
	private String mode_affectation;
	private int annee_scolaire;
	private int id_matiere;
	private int id_conjoint;
	private int id_tache;
	private int id_cycle;
	private int activation; 
	private int id_ecole;
	public String getNom_fonc() {
		return nom_fonc;
	}
	public void setNom_fonc(String nom_fonc) {
		this.nom_fonc = nom_fonc;
	}
	public String getPrenom_fonc() {
		return prenom_fonc;
	}
	public void setPrenom_fonc(String prenom_fonc) {
		this.prenom_fonc = prenom_fonc;
	}
	public String getNom_fonc_ara() {
		return nom_fonc_ara;
	}
	public void setNom_fonc_ara(String nom_fonc_ara) {
		this.nom_fonc_ara = nom_fonc_ara;
	}
	public String getPrenom_fonc_ara() {
		return prenom_fonc_ara;
	}
	public void setPrenom_fonc_ara(String prenom_fonc_ara) {
		this.prenom_fonc_ara = prenom_fonc_ara;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getLieu_naissance() {
		return lieu_naissance;
	}
	public void setLieu_naissance(String lieu_naissance) {
		this.lieu_naissance = lieu_naissance;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public int getEchelon() {
		return echelon;
	}
	public void setEchelon(int echelon) {
		this.echelon = echelon;
	}
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
	public String getSituation_familiale() {
		return situation_familiale;
	}
	public void setSituation_familiale(String situation_familiale) {
		this.situation_familiale = situation_familiale;
	}
	public int getNbr_enfants() {
		return nbr_enfants;
	}
	public void setNbr_enfants(int nbr_enfants) {
		this.nbr_enfants = nbr_enfants;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto_fonc() {
		return photo_fonc;
	}
	public void setPhoto_fonc(String photo_fonc) {
		this.photo_fonc = photo_fonc;
	}
	public Date getDate_travail() {
		return date_travail;
	}
	public void setDate_travail(Date date_travail) {
		this.date_travail = date_travail;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
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
	public Date getDate_situation_familiale() {
		return date_situation_familiale;
	}
	public void setDate_situation_familiale(Date date_situation_familiale) {
		this.date_situation_familiale = date_situation_familiale;
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
	public int getActivation() {
		return activation;
	}
	public void setActivation(int activation) {
		this.activation = activation;
	}
	public int getId_ecole() {
		return id_ecole;
	}
	public void setId_ecole(int id_ecole) {
		this.id_ecole = id_ecole;
	}
	
	
	//constructeur sans para
	
	
	public Fonctionnaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructeur avec para
	public Fonctionnaire(String nom_fonc, String prenom_fonc, String nom_fonc_ara, String prenom_fonc_ara,
			int matricule, String nationalite, String cin, Date date_naissance, String lieu_naissance, String sexe,
			int echelon, Date date_echelon, String cadre_actuel, Date date_domination_etab, String situation_familiale,
			int nbr_enfants, String adresse, String ville, String telephone, String email, String photo_fonc,
			Date date_travail, String login, String pass, String code_fonctionaire, Date date_titularisation,
			Date date_cadre, Date date_echel, String type_acces_echel, String enciennete_echel, Date date_tache,
			Date date_nomination_delegation, Date date_nomination_academie, String type_fonc,
			Date date_situation_familiale, String echel, String mode_affectation, int annee_scolaire, int id_matiere,
			int id_conjoint, int id_tache, int id_cycle, int activation, int id_ecole) {
		super();
		this.nom_fonc = nom_fonc;
		this.prenom_fonc = prenom_fonc;
		this.nom_fonc_ara = nom_fonc_ara;
		this.prenom_fonc_ara = prenom_fonc_ara;
		this.matricule = matricule;
		this.nationalite = nationalite;
		this.cin = cin;
		this.date_naissance = date_naissance;
		this.lieu_naissance = lieu_naissance;
		this.sexe = sexe;
		this.echelon = echelon;
		this.date_echelon = date_echelon;
		this.cadre_actuel = cadre_actuel;
		this.date_domination_etab = date_domination_etab;
		this.situation_familiale = situation_familiale;
		this.nbr_enfants = nbr_enfants;
		this.adresse = adresse;
		this.ville = ville;
		this.telephone = telephone;
		this.email = email;
		this.photo_fonc = photo_fonc;
		this.date_travail = date_travail;
		this.login = login;
		this.pass = pass;
		this.code_fonctionaire = code_fonctionaire;
		this.date_titularisation = date_titularisation;
		this.date_cadre = date_cadre;
		this.date_echel = date_echel;
		this.type_acces_echel = type_acces_echel;
		this.enciennete_echel = enciennete_echel;
		this.date_tache = date_tache;
		this.date_nomination_delegation = date_nomination_delegation;
		this.date_nomination_academie = date_nomination_academie;
		this.type_fonc = type_fonc;
		this.date_situation_familiale = date_situation_familiale;
		this.echel = echel;
		this.mode_affectation = mode_affectation;
		this.annee_scolaire = annee_scolaire;
		this.id_matiere = id_matiere;
		this.id_conjoint = id_conjoint;
		this.id_tache = id_tache;
		this.id_cycle = id_cycle;
		this.activation = activation;
		this.id_ecole = id_ecole;
	}
	
	
	
	
	

}
