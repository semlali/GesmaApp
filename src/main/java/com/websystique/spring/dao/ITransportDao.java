package com.websystique.spring.dao;

import java.util.List;

import com.websystique.spring.model.Chauffeur_tr;
import com.websystique.spring.model.Vehicule;

public interface ITransportDao {
	

    
    public void AjouterVehicule(Vehicule vehicule);
    public List<Vehicule>getAllVehicules();
	public void deleteVehicule(int id);
	public Vehicule findById(int id);
	public void updateVehicule(Vehicule vehicule);

	
	
  
    
}
