package com.websystique.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="fonctionnaire")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn(name="type_fonction")

public class Fonctionnaire implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	private String situation_familiale;
	private int nbr_enfants;
	private String adresse;
	private String ville;
	private String telephone;
	private String email;
	private String photo_fonc;
	private Date date_travail;
	public Date sortieTravail;
	private Date date_situation_familiale;
	private int activation; 
	private int id_ecole;
	private int compteBancaire;
	private String agenceBancaire;
	private String login;
	private String pass;
	private Boolean cnss, ir,amo;
	private String carte_sejour;
	
	@Column(name = "num_cnss")
	private int numCnss;
	@Column(name = "num_cimr")
	private int numCimr;
	
	@Column(name = "num_mutuelle")
    private int numMutuelle;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn
	private Contrat contrat;
	
	@OneToMany(mappedBy="fonctionnaire")
	private Collection<Conge> conge;
	
	@ManyToOne 
	@JoinColumn
	private Banque banque;
	
	@OneToMany(mappedBy="fonctionnaire")
	private Collection<BulletinPaie> bulletinPaies;
	
	@OneToMany(mappedBy="fonctionnaire")
	private Collection<Avances> avances;
	@OneToMany(mappedBy="fonctionnaire")
	private Collection<Prets> prets;
	
	
	
	
	public Fonctionnaire() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public Date getDate_travail() {
		return date_travail;
	}
	public void setDate_travail(Date date_travail) {
		this.date_travail = date_travail;
	}

	public Date getDate_situation_familiale() {
		return date_situation_familiale;
	}
	public void setDate_situation_familiale(Date date_situation_familiale) {
		this.date_situation_familiale = date_situation_familiale;
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

	public int getN_fonc() {
		return n_fonc;
	}
	public void setN_fonc(int n_fonc) {
		this.n_fonc = n_fonc;
	}
	public int getCompteBancaire() {
		return compteBancaire;
	}
	public void setCompteBancaire(int compteBancaire) {
		this.compteBancaire = compteBancaire;
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
	public Collection<Conge> getConge() {
		return conge;
	}
	public void setConge(Collection<Conge> conge) {
		this.conge = conge;
	}
	public Banque getBanque() {
		return banque;
	}
	public void setBanque(Banque banque) {
		this.banque = banque;
	}
	public Collection<BulletinPaie> getBulletinPaies() {
		return bulletinPaies;
	}
	public void setBulletinPaies(Collection<BulletinPaie> bulletinPaies) {
		this.bulletinPaies = bulletinPaies;
	}
	public Collection<Avances> getAvances() {
		return avances;
	}
	public void setAvances(Collection<Avances> avances) {
		this.avances = avances;
	}
	public Collection<Prets> getPrets() {
		return prets;
	}
	public void setPrets(Collection<Prets> prets) {
		this.prets = prets;
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
	public Boolean getCnss() {
		return cnss;
	}
	public void setCnss(Boolean cnss) {
		this.cnss = cnss;
	}
	public Boolean getIr() {
		return ir;
	}
	public void setIr(Boolean ir) {
		this.ir = ir;
	}
	public Boolean getAmo() {
		return amo;
	}
	public void setAmo(Boolean amo) {
		this.amo = amo;
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	
	public String getCarte_sejour() {
		return carte_sejour;
	}
	public void setCarte_sejour(String carte_sejour) {
		this.carte_sejour = carte_sejour;
	}
	
	
	public Date getSortieTravail() {
		return sortieTravail;
	}
	public void setSortieTravail(Date sortieTravail) {
		this.sortieTravail = sortieTravail;
	}
	
 
	public Fonctionnaire( String nom_fonc, String prenom_fonc,
			String nom_fonc_ara, String prenom_fonc_ara, int matricule,
			String nationalite, String cin, String carte_sejour, Date date_naissance,
			String lieu_naissance, String sexe, String situation_familiale,
			int nbr_enfants, String adresse, String ville, String telephone,
			String email,  Date date_travail, Date sortieTravail, 
			int compteBancaire, String agenceBancaire, String login,
			String pass, Boolean cnss, Boolean ir, Boolean amo, int numCnss,
			int numCimr, int numMutuelle,  Banque banque, Contrat contrat) {
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
		this.situation_familiale = situation_familiale;
		this.nbr_enfants = nbr_enfants;
		this.adresse = adresse;
		this.ville = ville;
		this.telephone = telephone;
		this.email = email;
		//this.photo_fonc = photo_fonc;
		this.date_travail = date_travail;
		//this.date_situation_familiale = date_situation_familiale;
		//this.activation = activation;
		//this.id_ecole = id_ecole;
		this.compteBancaire = compteBancaire;
		this.agenceBancaire = agenceBancaire;
		this.login = login;
		this.pass = pass;
		this.cnss = cnss;
		this.ir = ir;
		this.amo = amo;
		this.numCnss = numCnss;
		this.numCimr = numCimr;
		this.numMutuelle = numMutuelle;
	//	this.conge = conge;
		this.banque = banque;
		//this.bulletinPaies = bulletinPaies;
		//this.avances = avances;
		//this.prets = prets;
		this.carte_sejour=carte_sejour;
		this.sortieTravail=sortieTravail;
		this.contrat=contrat;
	}
	
	
}
