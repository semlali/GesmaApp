package com.websystique.spring.service;

import java.util.List;

import com.websystique.spring.model.Branche;
import com.websystique.spring.model.Caisse;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Frais;
import com.websystique.spring.model.Frais_Niveau;
import com.websystique.spring.model.Niveau;
import com.websystique.spring.model.Reduction;

public interface PaiementService {
	public Frais addFrais(Frais frais);
	public Niveau addNiveau(Niveau niveau);
	public List<Niveau> getAllNiveau();
	public List<Branche> getAllBranche();
	public List<Frais> getAllFrais();
	public void setFrais_Niveau(int idNiveau, int idFrais, double prix, String reduction);
	public Frais_Niveau AddFrais_Niveau(Frais_Niveau fn);
	public Frais_Niveau deleteFraisById(int getId);
	public Reduction addReduction(Reduction reduction);
	public Reduction updateReduction(Reduction reduction,int id_reduction_old);
	public void deleteReductionByName(String nom);
	public Reduction getReductionByName(String name);
	public Caisse addCaisse(Caisse caisse,int codeFonctionnaire);
	public Caisse updateCaisse(Caisse caisse,int id_caisse_old);
	public void deleteCaisseByName(String nom);
	public Facture addFacture(Facture facture,int codeEtudiant,int codeCaisse);
	public void updateFacture(Facture facture, int codeFacture);
	public void deleteFactureByNum(int codeFacture);
	public Facture consulterFacture(String codeFacture);
	public Frais getFraisById(int id);
	public Niveau getNiveauById(int id);
	public List<Frais_Niveau> getAllNiveauFrais();
	public Frais_Niveau getNiveauFraisById(int id);
}
