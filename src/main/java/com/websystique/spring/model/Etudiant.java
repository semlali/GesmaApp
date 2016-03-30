package com.websystique.spring.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Etudiant implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue
	private int n_etudiant;
	
	
	
	private String nom_etudiant;
	private int tuteur_id_tuteur;
	private String prenom_etudiant;
	private String nom_etudiant_ara;
	private String prenom_etudiant_ara;
	private String 	n_inscription;
	private Date date_inscription;
	private String dispense;
	private Date date_naissance;
	private String lieu_naissance;
	private String 	lieu_naissance_ara;
	private String bourse;
	private String n_bourse;
	private String etat_etudiant;
	private Date date_etat_etudiant;
	private String photo;
	private String sexe;
	private int nbr_annee_primaire;
	private int nbr_annee_college;
	private String n_certificat_depart;
	private Date date_certificat_depart;
	private String n_nationnal;
	private String dossier_scolaire;
	private int arrivee_dossier;
	private Date date_arrivee_dossier;
	private String login;
	private String pass;
	private String hobbies;
	private int nbr_annee_1lycee;
	private int nbr_annee_2lycee;
	private int nbr_annee_3lycee;
	private String cin;
	private double valeur_bourse_debut;
	private double valeur_bourse_fin;
	private String n_inscription_origine;
	private int num_ordre;
	private String codebare;
	private String remarque;
	private double moyenne_reussi_college;
	private String n_national_massar;
	private int attente_attestation_depart;
	private String email;
	private String activation_code;
	private int new_etudiant;
	private int id_langue_etrangere;
	private int id_specialite;
	private Date date_bourse;
	private int annee_scolaire;
	private int etablis_prec;
	private int id_etablissement_destination;
	private int id_branche_precedente;
	private int id_branche_orientation;
	private int id_branche_prochaine;
	private int active;
	private int nbr_annee_1primaire;
	private int nbr_annee_2primaire;
	private int nbr_annee_3primaire;
	private int nbr_annee_4primaire;
	private int nbr_annee_5primaire;
	private String nbr_annee_6primaire;
	private int id_ecole;
	public int getN_etudiant() {
		return n_etudiant;
	}
	public void setN_etudiant(int n_etudiant) {
		this.n_etudiant = n_etudiant;
	}
	public String getNom_etudiant() {
		return nom_etudiant;
	}
	public void setNom_etudiant(String nom_etudiant) {
		this.nom_etudiant = nom_etudiant;
	}
	public int getTuteur_id_tuteur() {
		return tuteur_id_tuteur;
	}
	public void setTuteur_id_tuteur(int tuteur_id_tuteur) {
		this.tuteur_id_tuteur = tuteur_id_tuteur;
	}
	public String getPrenom_etudiant() {
		return prenom_etudiant;
	}
	public void setPrenom_etudiant(String prenom_etudiant) {
		this.prenom_etudiant = prenom_etudiant;
	}
	public String getNom_etudiant_ara() {
		return nom_etudiant_ara;
	}
	public void setNom_etudiant_ara(String nom_etudiant_ara) {
		this.nom_etudiant_ara = nom_etudiant_ara;
	}
	public String getPrenom_etudiant_ara() {
		return prenom_etudiant_ara;
	}
	public void setPrenom_etudiant_ara(String prenom_etudiant_ara) {
		this.prenom_etudiant_ara = prenom_etudiant_ara;
	}
	public String getN_inscription() {
		return n_inscription;
	}
	public void setN_inscription(String n_inscription) {
		this.n_inscription = n_inscription;
	}
	public Date getDate_inscription() {
		return date_inscription;
	}
	public void setDate_inscription(Date date_inscription) {
		this.date_inscription = date_inscription;
	}
	public String getDispense() {
		return dispense;
	}
	public void setDispense(String dispense) {
		this.dispense = dispense;
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
	public String getLieu_naissance_ara() {
		return lieu_naissance_ara;
	}
	public void setLieu_naissance_ara(String lieu_naissance_ara) {
		this.lieu_naissance_ara = lieu_naissance_ara;
	}
	public String getBourse() {
		return bourse;
	}
	public void setBourse(String bourse) {
		this.bourse = bourse;
	}
	public String getN_bourse() {
		return n_bourse;
	}
	public void setN_bourse(String n_bourse) {
		this.n_bourse = n_bourse;
	}
	public String getEtat_etudiant() {
		return etat_etudiant;
	}
	public void setEtat_etudiant(String etat_etudiant) {
		this.etat_etudiant = etat_etudiant;
	}
	public Date getDate_etat_etudiant() {
		return date_etat_etudiant;
	}
	public void setDate_etat_etudiant(Date date_etat_etudiant) {
		this.date_etat_etudiant = date_etat_etudiant;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public int getNbr_annee_primaire() {
		return nbr_annee_primaire;
	}
	public void setNbr_annee_primaire(int nbr_annee_primaire) {
		this.nbr_annee_primaire = nbr_annee_primaire;
	}
	public int getNbr_annee_college() {
		return nbr_annee_college;
	}
	public void setNbr_annee_college(int nbr_annee_college) {
		this.nbr_annee_college = nbr_annee_college;
	}
	public String getN_certificat_depart() {
		return n_certificat_depart;
	}
	public void setN_certificat_depart(String n_certificat_depart) {
		this.n_certificat_depart = n_certificat_depart;
	}
	public Date getDate_certificat_depart() {
		return date_certificat_depart;
	}
	public void setDate_certificat_depart(Date date_certificat_depart) {
		this.date_certificat_depart = date_certificat_depart;
	}
	public String getN_nationnal() {
		return n_nationnal;
	}
	public void setN_nationnal(String n_nationnal) {
		this.n_nationnal = n_nationnal;
	}
	public String getDossier_scolaire() {
		return dossier_scolaire;
	}
	public void setDossier_scolaire(String dossier_scolaire) {
		this.dossier_scolaire = dossier_scolaire;
	}
	public int getArrivee_dossier() {
		return arrivee_dossier;
	}
	public void setArrivee_dossier(int arrivee_dossier) {
		this.arrivee_dossier = arrivee_dossier;
	}
	public Date getDate_arrivee_dossier() {
		return date_arrivee_dossier;
	}
	public void setDate_arrivee_dossier(Date date_arrivee_dossier) {
		this.date_arrivee_dossier = date_arrivee_dossier;
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
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public int getNbr_annee_1lycee() {
		return nbr_annee_1lycee;
	}
	public void setNbr_annee_1lycee(int nbr_annee_1lycee) {
		this.nbr_annee_1lycee = nbr_annee_1lycee;
	}
	public int getNbr_annee_2lycee() {
		return nbr_annee_2lycee;
	}
	public void setNbr_annee_2lycee(int nbr_annee_2lycee) {
		this.nbr_annee_2lycee = nbr_annee_2lycee;
	}
	public int getNbr_annee_3lycee() {
		return nbr_annee_3lycee;
	}
	public void setNbr_annee_3lycee(int nbr_annee_3lycee) {
		this.nbr_annee_3lycee = nbr_annee_3lycee;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public double getValeur_bourse_debut() {
		return valeur_bourse_debut;
	}
	public void setValeur_bourse_debut(double valeur_bourse_debut) {
		this.valeur_bourse_debut = valeur_bourse_debut;
	}
	public double getValeur_bourse_fin() {
		return valeur_bourse_fin;
	}
	public void setValeur_bourse_fin(double valeur_bourse_fin) {
		this.valeur_bourse_fin = valeur_bourse_fin;
	}
	public String getN_inscription_origine() {
		return n_inscription_origine;
	}
	public void setN_inscription_origine(String n_inscription_origine) {
		this.n_inscription_origine = n_inscription_origine;
	}
	public int getNum_ordre() {
		return num_ordre;
	}
	public void setNum_ordre(int num_ordre) {
		this.num_ordre = num_ordre;
	}
	public String getCodebare() {
		return codebare;
	}
	public void setCodebare(String codebare) {
		this.codebare = codebare;
	}
	public String getRemarque() {
		return remarque;
	}
	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}
	public double getMoyenne_reussi_college() {
		return moyenne_reussi_college;
	}
	public void setMoyenne_reussi_college(double moyenne_reussi_college) {
		this.moyenne_reussi_college = moyenne_reussi_college;
	}
	public String getN_national_massar() {
		return n_national_massar;
	}
	public void setN_national_massar(String n_national_massar) {
		this.n_national_massar = n_national_massar;
	}
	public int getAttente_attestation_depart() {
		return attente_attestation_depart;
	}
	public void setAttente_attestation_depart(int attente_attestation_depart) {
		this.attente_attestation_depart = attente_attestation_depart;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getActivation_code() {
		return activation_code;
	}
	public void setActivation_code(String activation_code) {
		this.activation_code = activation_code;
	}
	public int getNew_etudiant() {
		return new_etudiant;
	}
	public void setNew_etudiant(int new_etudiant) {
		this.new_etudiant = new_etudiant;
	}
	public int getId_langue_etrangere() {
		return id_langue_etrangere;
	}
	public void setId_langue_etrangere(int id_langue_etrangere) {
		this.id_langue_etrangere = id_langue_etrangere;
	}
	public int getId_specialite() {
		return id_specialite;
	}
	public void setId_specialite(int id_specialite) {
		this.id_specialite = id_specialite;
	}
	public Date getDate_bourse() {
		return date_bourse;
	}
	public void setDate_bourse(Date date_bourse) {
		this.date_bourse = date_bourse;
	}
	public int getAnnee_scolaire() {
		return annee_scolaire;
	}
	public void setAnnee_scolaire(int annee_scolaire) {
		this.annee_scolaire = annee_scolaire;
	}
	public int getEtablis_prec() {
		return etablis_prec;
	}
	public void setEtablis_prec(int etablis_prec) {
		this.etablis_prec = etablis_prec;
	}
	public int getId_etablissement_destination() {
		return id_etablissement_destination;
	}
	public void setId_etablissement_destination(int id_etablissement_destination) {
		this.id_etablissement_destination = id_etablissement_destination;
	}
	public int getId_branche_precedente() {
		return id_branche_precedente;
	}
	public void setId_branche_precedente(int id_branche_precedente) {
		this.id_branche_precedente = id_branche_precedente;
	}
	public int getId_branche_orientation() {
		return id_branche_orientation;
	}
	public void setId_branche_orientation(int id_branche_orientation) {
		this.id_branche_orientation = id_branche_orientation;
	}
	public int getId_branche_prochaine() {
		return id_branche_prochaine;
	}
	public void setId_branche_prochaine(int id_branche_prochaine) {
		this.id_branche_prochaine = id_branche_prochaine;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getNbr_annee_1primaire() {
		return nbr_annee_1primaire;
	}
	public void setNbr_annee_1primaire(int nbr_annee_1primaire) {
		this.nbr_annee_1primaire = nbr_annee_1primaire;
	}
	public int getNbr_annee_2primaire() {
		return nbr_annee_2primaire;
	}
	public void setNbr_annee_2primaire(int nbr_annee_2primaire) {
		this.nbr_annee_2primaire = nbr_annee_2primaire;
	}
	public int getNbr_annee_3primaire() {
		return nbr_annee_3primaire;
	}
	public void setNbr_annee_3primaire(int nbr_annee_3primaire) {
		this.nbr_annee_3primaire = nbr_annee_3primaire;
	}
	public int getNbr_annee_4primaire() {
		return nbr_annee_4primaire;
	}
	public void setNbr_annee_4primaire(int nbr_annee_4primaire) {
		this.nbr_annee_4primaire = nbr_annee_4primaire;
	}
	public int getNbr_annee_5primaire() {
		return nbr_annee_5primaire;
	}
	public void setNbr_annee_5primaire(int nbr_annee_5primaire) {
		this.nbr_annee_5primaire = nbr_annee_5primaire;
	}
	public String getNbr_annee_6primaire() {
		return nbr_annee_6primaire;
	}
	public void setNbr_annee_6primaire(String nbr_annee_6primaire) {
		this.nbr_annee_6primaire = nbr_annee_6primaire;
	}
	public int getId_ecole() {
		return id_ecole;
	}
	public void setId_ecole(int id_ecole) {
		this.id_ecole = id_ecole;
	}
	

}
