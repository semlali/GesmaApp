package com.websystique.spring.service;

import java.util.List;

import com.websystique.spring.model.Arret_tr;
import com.websystique.spring.model.Chauffeur;
import com.websystique.spring.model.Etablissement;
import com.websystique.spring.model.Etudiant;
import com.websystique.spring.model.Vehicule;


public interface ITransportService {

	
    public void AjouterVehicule(Vehicule vehicule);
    public List<Vehicule>getAllVehicules();
	void deleteVehicule(int id);
	public Vehicule findById(int id);
	void updateVehicule(Vehicule vehicule);
	public Vehicule findByNumImm(int numImmatriculation);
	public void AjouterEtablissement(Etablissement etablissement);
    public List<Etudiant>getAllEtudiants();
	public void deleteEtudiant(int id);
	public Etudiant findEtudById(int id);
	public void updateEtudiant(Etudiant etudiant);
    public List<Chauffeur>getAllchauffeurs();
    public  Chauffeur findChauffeurById(int id);
    public List<Vehicule> getAllVehiculesChauffeurs();
    public List<Arret_tr> getAllArrets();
   	public void AjouterArret(Arret_tr arret);
   	public void deleteArret(int id);
   	public Arret_tr findArretById(int id);
   	public void updateArret(Arret_tr arret);
}
