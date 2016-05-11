package com.websystique.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.spring.entities.*;
import com.websystique.spring.dao.PaieDao;

@Service("PaieService")
@Transactional
public class PaieServiceImplementation implements PaieService {
	
	@Autowired
	private PaieDao dao;
	@Override
	public void ajouterBanque(Banque b) {
		// TODO Auto-generated method stub
		dao.ajouterBanque(b);
	}
	public void ajouterProfession(Profession p){
		dao.ajouterProfession(p);

	}
	@Override
	public List<Profession> afficherProfession() {
		// TODO Auto-generated method stub

		return dao.afficherProfession();
	}
	@Override
	public List<Banque> afficherBanque() {
		// TODO Auto-generated method stub
		return dao.afficherBanque();
	}
	@Override
	public List<Anciennete> afficheAnciennte() {
		// TODO Auto-generated method stub
		return dao.afficheAnciennte();
	}
	@Override
	public Anciennete getAncienneteById(int id) {
		// TODO Auto-generated method stub
		return dao.getAncienneteById(id);

	}
	@Override
	public void updateAnciennete(Long id, Anciennete a) {
		// TODO Auto-generated method stub
		
		dao.updateAnciennete(id, a);
	}
	@Override
	public List<IGR> afficheIGR() {
		// TODO Auto-generated method stub
		return dao.afficheIGR();

	}
	@Override
	public IGR getIGRById(int id) {
		// TODO Auto-generated method stub
		return dao.getIGRById(id);

	}
	@Override
	public void updateIGR(Long id, IGR a) {
		// TODO Auto-generated method stub
		dao.updateIGR( id,  a);

	}
	@Override
	public Banque getBanqueById(int id) {
		// TODO Auto-generated method stub
		return dao.getBanqueById(id);
	}
	@Override
	public void ajouterFonctionnaire(Fonctionnaire f) {
		// TODO Auto-generated method stub
		dao.ajouterFonctionnaire(f);
	}
	
	@Override
	public List<TypeContrat> afficherTypeContrat() {
		// TODO Auto-generated method stub
		return dao.afficherTypeContrat();
	}
	@Override
	public TypeContrat getTypeContratById(int id) {
		// TODO Auto-generated method stub
		return dao.getTypeContratById(id);
	}
	@Override
	public Profession getProfessionById(int id) {
		// TODO Auto-generated method stub
		return dao.getProfessionById(id);
	}

	@Override
    public void ajouterContrat(Contrat c){
    	dao.ajouterContrat(c);
    }
	@Override
	public void ajouterChauffeur(Chauffeur c) {
		// TODO Auto-generated method stub
		dao.ajouterChauffeur(c);
	}
	@Override
	public void ajouterProfesseur(Professeur p) {
		// TODO Auto-generated method stub
		dao.ajouterProfesseur(p);
	}
	@Override
	public List<Fonctionnaire> afficherSalaries() {
		// TODO Auto-generated method stub
		return dao.afficherSalaries();
	}
	@Override
	public Fonctionnaire getSalarieById(int id) {
		// TODO Auto-generated method stub
		return dao.getSalarieById(id);
	}
	@Override
	public void supprimerIgr(int id) {
		// TODO Auto-generated method stub
		dao.supprimerIgr(id);
	}
	@Override
	public void supprimerAnciennete(int id) {
		// TODO Auto-generated method stub
		dao.supprimerAnciennete(id);
	}
	@Override
	public Fonctionnaire chercherSalarieByName(String nom, String prenom) {
		// TODO Auto-generated method stub
		return dao.chercherSalarieByName(nom,prenom);
	}
	@Override
	public Chauffeur chercherChauffeurByName(String nom, String prenom) {
		// TODO Auto-generated method stub
		return dao.chercherChauffeurByName(nom, prenom);
	}
	@Override
	public Professeur chercherProfesseurByName(String nom, String prenom) {
		// TODO Auto-generated method stub
		return dao.chercherProfesseurByName(nom, prenom);
	}
	@Override
	public void updateSalarieProf(Professeur p) {
		// TODO Auto-generated method stub
		dao.updateSalarieProf(p);
	}
	@Override
	public void updateSalarieChauffeur(Chauffeur c, Long id) {
		// TODO Auto-generated method stub
		dao.updateSalarieChauffeur(c, id);
	}
	@Override
	public void updateSalarie(Fonctionnaire f) {
		// TODO Auto-generated method stub
		dao.updateSalarie(f);
	}
	@Override
	public List<Fonctionnaire> chercherSalarieByProfession(int id) {
		// TODO Auto-generated method stub
		return dao.chercherSalarieByProfession(id);
	}
	@Override
	public List<Chauffeur> afficherListeChauffeur() {
		// TODO Auto-generated method stub
		return dao.afficherListeChauffeur();
	}
	@Override
	public List<Professeur> afficherListeProfesseur() {
		// TODO Auto-generated method stub
		return dao.afficherListeProfesseur() ;
	}
	@Override
	public List<PrimesVariables> afficherPrimes() {
		// TODO Auto-generated method stub
		return dao.afficherPrimes();
	}
	@Override
	public void ajouterIgr(IGR igr) {
		// TODO Auto-generated method stub
		dao.ajouterIgr(igr);
	}
	@Override
	public void ajouterAnciennete(Anciennete a) {
		// TODO Auto-generated method stub
		dao.ajouterAnciennete(a);
		
	}
	@Override
	public List<PrimesVariables> afficherPrimesParam() {
		// TODO Auto-generated method stub
		return dao.afficherPrimesParam();
	}
	@Override
	public void supprimerPrimesPara(int id) {
		// TODO Auto-generated method stub
		dao.supprimerPrimesPara(id);
	}
	@Override
	public PrimesVariables getPrimesVariablesById(int id) {
		// TODO Auto-generated method stub
		return dao.getPrimesVariablesById(id);
	}
	@Override
	public void ajouterPrimes(PrimesVariables p) {
		// TODO Auto-generated method stub
		dao.ajouterPrimes(p);
	}
	@Override
	public void updatePrimesVariables(PrimesVariables p, Long id) {
		// TODO Auto-generated method stub
		dao.updatePrimesVariables(p,id);
	}
	@Override
	public void updateSalarieHeuresSupPrimes(Fonctionnaire f) {
		// TODO Auto-generated method stub
		dao.updateSalarieHeuresSupPrimes(f);
	}
	@Override
	public void supprimerHeuresSupPara(int id) {
		// TODO Auto-generated method stub
		dao.supprimerHeuresSupPara(id);
	}
	@Override
	public void updateProfession(Profession p) {
		// TODO Auto-generated method stub
		dao.updateProfession(p);
		
	}



}
