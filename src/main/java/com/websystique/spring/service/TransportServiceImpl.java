package com.websystique.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.spring.dao.ITransportDao;
import com.websystique.spring.model.Chauffeur_tr;
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

}
