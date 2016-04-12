package com.websystique.spring.dao;
import java.util.List;

import com.websystique.entities.*;

public interface PaieDao {
	
	public void ajouterBanque(Banque b);
	public void ajouterProfession(Profession p);
	public List<Profession> afficherProfession();
	public List<TypeContrat> afficherTypeContrat();
	public List<Banque> afficherBanque();
	public List<Anciennete> afficheAnciennte();
	public Anciennete getAncienneteById(int id);
	public void updateAnciennete(Long id, Anciennete a);
	public List<IGR> afficheIGR();
	public IGR getIGRById(int id);
	public void updateIGR(Long id, IGR a);
	public Banque getBanqueById(int id);
    public void ajouterFonctionnaire(Fonctionnaire f);
    public TypeContrat getTypeContratById(int id);
    public Profession getProfessionById(int id);
	
}
