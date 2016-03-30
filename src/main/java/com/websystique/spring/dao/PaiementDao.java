package com.websystique.spring.dao;

import com.websystique.spring.model.Caisse;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Frais;
import com.websystique.spring.model.Niveau;
import com.websystique.spring.model.Reduction;

public interface PaiementDao {
	public Frais addFrais(Frais frais);
	public Niveau addNiveau(Niveau niveau);
	public void setFrais_Niveau(int idNiveau,int idFrais, double prix, String reduction);
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
	

}
