package com.websystique.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.spring.dao.ITransportDao;
import com.websystique.spring.model.Arret_tr;
import com.websystique.spring.model.Chauffeur;
import com.websystique.spring.model.Etablissement;
import com.websystique.spring.model.Etudiant;
import com.websystique.spring.model.Vehicule;

@Service(value="ITransportService")
@Transactional
public class TransportServiceImpl implements ITransportService {
     
	@Autowired
	private ITransportDao dao;
	
	public void setDao(ITransportDao dao) {
		this.dao = dao;
		}

	
	@Override
	public void AjouterVehicule(Vehicule vehicule) {
		// TODO Auto-generated method stub
		dao.AjouterVehicule(vehicule);
		
	}
	@Override
	public List<Vehicule> getAllVehicules() {
		
		return dao.getAllVehicules();
	}
	@Override
	public void deleteVehicule(int id) {
		dao.deleteVehicule(id);
		
	}
	@Override
	public Vehicule findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}
	@Override
	public void updateVehicule(Vehicule vehicule) {
		// TODO Auto-generated method stub
		dao.updateVehicule(vehicule);
	}


	@Override
	public Vehicule findByNumImm(int numImmatriculation) {
		
		return dao.findByNumImm(numImmatriculation);
	}


	@Override
	public void AjouterEtablissement(Etablissement etablissement) {
		dao.AjouterEtablissement(etablissement);
		
	}


	@Override
	public List<Chauffeur> getAllchauffeurs() {
		// TODO Auto-generated method stub
		return dao.getAllchauffeurs();
	}


	@Override
	public Chauffeur findChauffeurById(int id) {
		// TODO Auto-generated method stub
		return dao.findChauffeurById(id);
	}


	@Override
	public List<Vehicule> getAllVehiculesChauffeurs() {
	
		return dao.getAllVehiculesChauffeurs();
	}


	@Override
	public List<Etudiant> getAllEtudiants() {
		// TODO Auto-generated method stub
		return dao.getAllEtudiants();
	}


	@Override
	public void deleteEtudiant(int id) {
		// TODO Auto-generated method stub
		dao.deleteEtudiant(id);
		
	}


	@Override
	public Etudiant findEtudById(int id) {
		// TODO Auto-generated method stub
		return dao.findEtudById(id);
	}


	@Override
	public void updateEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		dao.updateEtudiant(etudiant);
		
	}


	@Override
	public List<Arret_tr> getAllArrets() {
		// TODO Auto-generated method stub
		return dao.getAllArrets();
	}


	@Override
	public void AjouterArret(Arret_tr arret) {
		// TODO Auto-generated method stub
		dao.AjouterArret(arret);
		
	}


	@Override
	public void deleteArret(int id) {
		// TODO Auto-generated method stub
		dao.deleteArret(id);
	}


	@Override
	public Arret_tr findArretById(int id) {
		// TODO Auto-generated method stub
		return dao.findArretById(id);
	}


	@Override
	public void updateArret(Arret_tr arret) {
		// TODO Auto-generated method stub
		dao.updateArret(arret);
		
	}




}
