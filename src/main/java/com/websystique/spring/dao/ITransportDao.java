package com.websystique.spring.dao;

import java.util.List;

import com.websystique.spring.model.Chauffeur_tr;
import com.websystique.spring.model.Vehicule;

public interface ITransportDao {
	

    
    public void AjouterVehicule(Vehicule vehicule);
    public List<Vehicule>getAllVehicules();
	void deleteVehicule(int id);
	Vehicule findById(int id);
	void updateVehicule(Vehicule vehicule);
	
  
    
}
