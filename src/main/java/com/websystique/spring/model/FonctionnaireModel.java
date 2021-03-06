package com.websystique.spring.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import com.websystique.entities.Avances;
import com.websystique.entities.Banque;
import com.websystique.entities.BulletinPaie;
import com.websystique.entities.Conge;
import com.websystique.entities.Contrat;
import com.websystique.entities.Fonctionnaire;
import com.websystique.entities.Prets;
import com.websystique.entities.Profession;
import com.websystique.entities.TypeContrat;

public class FonctionnaireModel {
	
	private String nom_fonc;
	private String prenom_fonc;
	private String nom_fonc_ara;
	private String prenom_fonc_ara;
	private int matricule;
	private String nationalite;
	private String cin;
	@DateTimeFormat(pattern="yy-M-d")
	private Date date_naissance;
	private String lieu_naissance;
	private String sexe;
	private String situation_familiale;
	private int nbr_enfants;
	private String adresse;
	private String ville;
	private String telephone;
	private String email;
	private String photo_fonc;
	private Date date_situation_familiale;
	private int compteBancaire;
	private String agenceBancaire;
	private String login;
	private String pass;
	private String carte_sejour;
	//cnss
	private int numCnss;
	//cimr
	private int numCimr;
	
	//mutuelle
	
    private int numMutuelle;
	//contrat
    @DateTimeFormat(pattern="yy-M-d")
	private Date dateEntree;
	@DateTimeFormat(pattern="yy-M-d")
	private Date dateSortie;
	private Double salaireBase;
	private String modeRegelemnt;
	private Profession profession;
	private int idTypeContrat;
	private int idProfession;//profession en contrat
	//banque
	private int idbanque;
	private String numero_de_permis;
	//fonction
	//exoneration 
	
	private String cnss, ir,amo;

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

	
	public Date getDate_situation_familiale() {
		return date_situation_familiale;
	}

	public void setDate_situation_familiale(Date date_situation_familiale) {
		this.date_situation_familiale = date_situation_familiale;
	}

	public int getCompteBancaire() {
		return compteBancaire;
	}

	public void setCompteBancaire(int compteBancaire) {
		this.compteBancaire = compteBancaire;
	}

	public String getAgenceBancaire() {
		return agenceBancaire;
	}

	public void setAgenceBancaire(String agenceBancaire) {
		this.agenceBancaire = agenceBancaire;
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

	public int getNumCnss() {
		return numCnss;
	}

	public void setNumCnss(int numCnss) {
		this.numCnss = numCnss;
	}

	public int getNumCimr() {
		return numCimr;
	}

	public void setNumCimr(int numCimr) {
		this.numCimr = numCimr;
	}

	public int getNumMutuelle() {
		return numMutuelle;
	}

	public void setNumMutuelle(int numMutuelle) {
		this.numMutuelle = numMutuelle;
	}

	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public Double getSalaireBase() {
		return salaireBase;
	}

	public void setSalaireBase(Double salaireBase) {
		this.salaireBase = salaireBase;
	}

	public String getModeRegelemnt() {
		return modeRegelemnt;
	}

	public void setModeRegelemnt(String modeRegelemnt) {
		this.modeRegelemnt = modeRegelemnt;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}



	public int getIdTypeContrat() {
		return idTypeContrat;
	}

	public void setIdTypeContrat(int idTypeContrat) {
		this.idTypeContrat = idTypeContrat;
	}

	public int getIdProfession() {
		return idProfession;
	}

	public void setIdProfession(int idProfession) {
		this.idProfession = idProfession;
	}

	public int getIdbanque() {
		return idbanque;
	}

	public void setIdbanque(int idbanque) {
		this.idbanque = idbanque;
	}

	public String getNumero_de_permis() {
		return numero_de_permis;
	}

	public void setNumero_de_permis(String numero_de_permis) {
		this.numero_de_permis = numero_de_permis;
	}

	public String getCnss() {
		return cnss;
	}

	public void setCnss(String cnss) {
		this.cnss = cnss;
	}

	public String getIr() {
		return ir;
	}

	public void setIr(String ir) {
		this.ir = ir;
	}

	public String getAmo() {
		return amo;
	}

	public void setAmo(String amo) {
		this.amo = amo;
	}

	public String getCarte_sejour() {
		return carte_sejour;
	}

	public void setCarte_sejour(String carte_sejour) {
		this.carte_sejour = carte_sejour;
	}

	
	
	
	
	
}
