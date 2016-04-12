package com.websystique.spring.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.spring.dao.PaiementDao;
import com.websystique.spring.model.Branche;
import com.websystique.spring.model.Caisse;
import com.websystique.spring.model.City;
import com.websystique.spring.model.Classe;
import com.websystique.spring.model.Compte;
import com.websystique.spring.model.Etudiant;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Fonctionnaire;
import com.websystique.spring.model.Frais;
import com.websystique.spring.model.Frais_Niveau;
import com.websystique.spring.model.Niveau;
import com.websystique.spring.model.Reduction;
import com.websystique.spring.model.State;


@Service("PaiementService")
@Transactional
public class PaiementServiceImpl implements PaiementService {
	
	private Map<String, State> states = new LinkedHashMap<String, State>();
	
	@Autowired
	private PaiementDao dao;
	
	public PaiementServiceImpl(){
		
		State state = new State("NJ");
		state.addCity("Haddonfield").addCity("Cherry Hill").addCity("Marlton");
		this.states.put(state.getName(), state);

		state = new State("PA");
		// Carville's joke
		state.addCity("Philadelphia").addCity("Pittsburgh").addCity("Alabama");
		this.states.put(state.getName(), state);

		state = new State("NY");
		state.addCity("Sewer").addCity("Flushing").addCity("Armpit");
		state.addCity("Jerkville").addCity("Moronica").addCity("Shithole");
		this.states.put(state.getName(), state);
	}
	
	public Set<City> findCitiesForState(String stateName) {
		System.out.println("method: find cities for state ");
		State state = this.states.get(stateName);
		return state.getCities();
	}

	public Set<State> findAllStates() {
		System.out.println("method: find all states");
		Set<State> set = new TreeSet<State>();
		set.addAll(this.states.values());
		return set;
	}
	

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

	public Facture addFacture(Facture facture) {
		// TODO Auto-generated method stub
		return dao.addFacture(facture);
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

	@Override
	public List<Compte> getAllCompte() {
		// TODO Auto-generated method stub
		return dao.getAllCompte();
	}

	@Override
	public Compte addCompte(Compte compte) {
		// TODO Auto-generated method stub
		return dao.addCompte(compte);
	}

	@Override
	public Compte deleteCompteByCodeCompte(String getId) {
		// TODO Auto-generated method stub
		return dao.deleteCompteByCodeCompte(getId);
	}

	@Override
	public Compte getCompteByCode(String getId) {
		// TODO Auto-generated method stub
		return dao.getCompteByCode(getId);
	}

	@Override
	public void updateCompteByCode(Compte compte) {
		// TODO Auto-generated method stub
		dao.updateCompteByCode(compte);
	}

	@Override
	public List<Etudiant> getAllEtudiant() {
		// TODO Auto-generated method stub
		return dao.getAllEtudiant();
	}

	@Override
	public List<Facture> getAllFactureForOneEtudiant(int id_etudiant) {
		// TODO Auto-generated method stub
		return dao.getAllFactureForOneEtudiant(id_etudiant);
	}

	@Override
	public List<Niveau> getAllNiveauName() {
		// TODO Auto-generated method stub
		return dao.getAllNiveauName();
	}

	@Override
	public List<Branche> findBrancheForNiveauName(String string) {
		// TODO Auto-generated method stub
		return dao.findBrancheForNiveauName(string);
	}

	@Override
	public List<Classe> findClasseForBrancheName(String nomBranche) {
		// TODO Auto-generated method stub
		return dao.findClasseForBrancheName(nomBranche);
	}

	@Override
	public List<Etudiant> findEtudiantForClasseName(String nomClasse) {
		// TODO Auto-generated method stub
		return dao.findEtudiantForClasseName(nomClasse);
	}

	@Override
	public Frais_Niveau getPrixForFraisNiveau(int fraisId,String niveauName) {
		// TODO Auto-generated method stub
		return dao.getPrixForFraisNiveau(fraisId, niveauName);
	}

	@Override
	public Etudiant getEtudiantById(int id) {
		// TODO Auto-generated method stub
		return dao.getEtudiantById(id);
	}

	@Override
	public List<Classe> getAllClasse() {
		// TODO Auto-generated method stub
		return dao.getAllClasse();
	}

	@Override
	public List<Etudiant> getAllImpaye(int IdClasse) {
		// TODO Auto-generated method stub
		return dao.getAllImpaye(IdClasse);
	}

	@Override
	public Classe getClasseById(int classe) {
		// TODO Auto-generated method stub
		return dao.getClasseById(classe);
	}

	@Override
	public List<Etudiant> getEtatEtudiantByBranche(String nomBranche) {
		// TODO Auto-generated method stub
		return dao.getEtatEtudiantByBranche(nomBranche);
	}

	@Override
	public void updateEtatTransportEtudiant(Etudiant etudiant, String s) {
		// TODO Auto-generated method stub
		dao.updateEtatTransportEtudiant(etudiant, s);
	}

	@Override
	public void updateEtatInscriptionEtudiant(Etudiant etudiant, String s) {
		// TODO Auto-generated method stub
		dao.updateEtatInscriptionEtudiant(etudiant, s);
	}

	@Override
	public Etudiant getEtatEtudiantParNom(String nom,String prenom) {
		// TODO Auto-generated method stub
		return dao.getEtatEtudiantParNom(nom,prenom);
	}

	

}
