package com.websystique.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.entities.Anciennete;
import com.websystique.entities.Banque;
import com.websystique.entities.Contrat;
import com.websystique.entities.Fonctionnaire;
import com.websystique.entities.IGR;
import com.websystique.entities.Profession;
import com.websystique.entities.TypeContrat;
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
		return null;
	}


	


}
