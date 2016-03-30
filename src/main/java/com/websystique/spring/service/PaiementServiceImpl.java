package com.websystique.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.spring.dao.PaiementDao;
import com.websystique.spring.model.Caisse;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Frais;
import com.websystique.spring.model.Niveau;
import com.websystique.spring.model.Reduction;


@Service("PaiementService")
@Transactional
public class PaiementServiceImpl implements PaiementService {
	
	@Autowired
	private PaiementDao dao;

	public Frais addFrais(Frais frais) {
		// TODO Auto-generated method stub
		return dao.addFrais(frais);
	}

	public Niveau addNiveau(Niveau niveau) {
		// TODO Auto-generated method stub
		return dao.addNiveau(niveau);
	}

	public void setFrais_Niveau(int idNiveau, int idFrais, double prix, String reduction) {
		// TODO Auto-generated method stub
		dao.setFrais_Niveau(idNiveau, idFrais, prix, reduction);
	}

	public Reduction addReduction(Reduction reduction) {
		// TODO Auto-generated method stub
		return dao.addReduction(reduction);
	}

	public Reduction updateReduction(Reduction reduction,int id_reduction_old) {
		// TODO Auto-generated method stub
		
		return dao.updateReduction(reduction,id_reduction_old);
	}

	public void deleteReductionByName(String nom) {
		// TODO Auto-generated method stub
		 dao.deleteReductionByName(nom);
	}

	public Reduction getReductionByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Caisse addCaisse(Caisse caisse,int codeFonctionnaire) {
		// TODO Auto-generated method stub
		return dao.addCaisse(caisse,codeFonctionnaire);
	}

	public Caisse updateCaisse(Caisse caisse, int id_caisse_old) {
		// TODO Auto-generated method stub
		return dao.updateCaisse(caisse, id_caisse_old);
	}

	public void deleteCaisseByName(String nom) {
		// TODO Auto-generated method stub
		dao.deleteCaisseByName(nom);
	}

	public Facture addFacture(Facture facture, int codeEtudiant, int codeCaisse) {
		// TODO Auto-generated method stub
		return dao.addFacture(facture, codeEtudiant, codeCaisse);
	}

	public void updateFacture(Facture facture, int codeFacture) {
		// TODO Auto-generated method stub
		dao.updateFacture(facture, codeFacture);
	}

	public void deleteFactureByNum(int codeFacture) {
		// TODO Auto-generated method stub
		dao.deleteFactureByNum(codeFacture);
	}

}
