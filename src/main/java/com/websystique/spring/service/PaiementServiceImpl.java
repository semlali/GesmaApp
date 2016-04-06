package com.websystique.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.spring.dao.PaiementDao;
import com.websystique.spring.model.Branche;
import com.websystique.spring.model.Caisse;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Fonctionnaire;
import com.websystique.spring.model.Frais;
import com.websystique.spring.model.Frais_Niveau;
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

	public Caisse addCaisse(Caisse caisse) {
		// TODO Auto-generated method stub
		return dao.addCaisse(caisse);
	}

	public Caisse updateCaisse(Caisse caisse, int id_caisse_old) {
		// TODO Auto-generated method stub
		return dao.updateCaisse(caisse, id_caisse_old);
	}

	public void deleteCaisseById(int id) {
		// TODO Auto-generated method stub
		dao.deleteCaisseById(id);
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

	@Override
	public Facture consulterFacture(String codeFacture) {
		// TODO Auto-generated method stub
		return dao.consulterFacture(codeFacture);
	}

	@Override
	public List<Niveau> getAllNiveau() {
		// TODO Auto-generated method stub
		return dao.getAllNiveau();
	}

	@Override
	public List<Branche> getAllBranche() {
		// TODO Auto-generated method stub
		return dao.getAllBranche();
	}

	@Override
	public List<Frais> getAllFrais() {
		// TODO Auto-generated method stub
		return dao.getAllFrais();
	}

	@Override
	public Frais getFraisById(int id) {
		// TODO Auto-generated method stub
		return dao.getFraisById(id);
	}

	@Override
	public Niveau getNiveauById(int id) {
		// TODO Auto-generated method stub
		return dao.getNiveauById(id);
	}

	@Override
	public List<Frais_Niveau> getAllNiveauFrais() {
		// TODO Auto-generated method stub
		return dao.getAllNiveauFrais();
	}

	@Override
	public Frais_Niveau AddFrais_Niveau(Frais_Niveau fn) {
		// TODO Auto-generated method stub
		return dao.AddFrais_Niveau(fn);
	}

	@Override
	public Frais_Niveau deleteFraisById(int getId) {
		// TODO Auto-generated method stub
		return dao.deleteFraisById(getId);
	}

	@Override
	public Frais_Niveau getNiveauFraisById(int id) {
		// TODO Auto-generated method stub
		return dao.getNiveauFraisById(id);
	}

	@Override
	public List<Caisse> getAllCaisse() {
		// TODO Auto-generated method stub
		return dao.getAllCaisse();
	}

	@Override
	public List<Fonctionnaire> getAllFontionnaire() {
		// TODO Auto-generated method stub
		return dao.getAllFontionnaire();
	}

	@Override
	public Caisse getCaisseById(int getId) {
		// TODO Auto-generated method stub
		return dao.getCaisseById(getId);
	}

	@Override
	public Fonctionnaire getFonctionnaireById(int id) {
		// TODO Auto-generated method stub
		return dao.getFonctionnaireById(id);
	}

}
