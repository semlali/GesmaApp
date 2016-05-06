package com.websystique.spring.service;

import java.util.List;
import java.util.Set;

import com.websystique.spring.model.Branche;
import com.websystique.spring.model.Caisse;
import com.websystique.spring.model.CategoriePaiement;
import com.websystique.spring.model.City;
import com.websystique.spring.model.Classe;
import com.websystique.spring.model.Compte;
import com.websystique.spring.model.DetailFacture;
import com.websystique.spring.model.Etudiant;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Fonctionnaire;
import com.websystique.spring.model.Frais;
import com.websystique.spring.model.Frais_Niveau;
import com.websystique.spring.model.Niveau;
import com.websystique.spring.model.State;

public interface PaiementService {
	
	public List<DetailFacture> getAllDetailFactureForFacture(Facture facture);
	public Facture getFactureById(int getId);
	public Set<State> findAllStates();
	public DetailFacture addDetailFacture(DetailFacture detail);
	public Set<City> findCitiesForState(String state);
	public CategoriePaiement getCategorieById(int idcategorie);
	public List<CategoriePaiement> getAllcategories();
	public Frais addFrais(Frais frais);
	public Niveau addNiveau(Niveau niveau);
	public List<Niveau> getAllNiveau();
	public List<Niveau> getAllNiveauName();
	public List<Branche> getAllBranche();
	public List<Frais> getAllFrais();
	public void setFrais_Niveau(int idNiveau, int idFrais, double prix, Double reduction);
	public Frais_Niveau AddFrais_Niveau(Frais_Niveau fn);
	public Frais_Niveau deleteFraisById(int getId);
	public void deleteReductionByName(String nom);
	public Caisse addCaisse(Caisse caisse);
	public Caisse updateCaisse(Caisse caisse,int id_caisse_old);
	public void deleteCaisseById(int id);
	public List<Caisse> getAllCaisse();
	public Caisse getCaisseById(int getId);
	public Facture addFacture(Facture facture);
	public Facture mergeFacture(Facture facture);
	public void updateFacture(Facture facture, int codeFacture);
	public void deleteFactureByNum(int codeFacture);
	public Facture consulterFacture(String codeFacture);
	public Frais getFraisById(int id);
	public Frais getFraisByName(String nom);
	public Niveau getNiveauById(int id);
	public List<Frais_Niveau> getAllNiveauFrais();
	public Frais_Niveau getNiveauFraisById(int id);
	public List<Fonctionnaire> getAllFontionnaire();
	public Fonctionnaire getFonctionnaireById(int id);
	public List<Compte> getAllCompte();
	public Compte addCompte(Compte compte);
	public Compte deleteCompteByCodeCompte(String getId);
	public Compte getCompteByCode(String getId);
	public void updateCompteByCode(Compte compte);
	public List<Etudiant> getAllEtudiant();
	public Etudiant getEtudiantById(int id);
	public List<Facture> getAllFactureForOneEtudiant(int id_etudiant);
	public List<Branche> findBrancheForNiveauName(String string);
	public List<Classe> findClasseForBrancheName(String nomBranche);
	public List<Etudiant> findEtudiantForClasseName(String nomClasse);
	public Frais_Niveau getPrixForFraisNiveau(int fraisId,String niveauName,int idcategorie);
	public List<Classe> getAllClasse();
	public List<Etudiant> getAllImpaye(int IdClasse);
	public Classe getClasseById(int classe);
	public List<Etudiant> getEtatEtudiantByBranche(String nomBranche);
	public void updateEtatTransportEtudiant(Etudiant etudiant, String s);
	public void updateEtatInscriptionEtudiant(Etudiant etudiant, String s);
	public Etudiant getEtatEtudiantParNom(String nom,String prenom);
	public void sendFromGMail(String to);
	public Etudiant connexion(String nom,String pass);
	public Fonctionnaire connxionFonc(String nom,String pass);
}
