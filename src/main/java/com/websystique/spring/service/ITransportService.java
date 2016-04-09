package com.websystique.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.spring.model.Chauffeur_tr;
import com.websystique.spring.model.Vehicule;


public interface ITransportService {

	
    public void AjouterVehicule(Vehicule vehicule);
    public List<Vehicule>getAllVehicules();
	void deleteVehicule(int id);
	Vehicule findById(int id);
	void updateVehicule(Vehicule vehicule);
}
