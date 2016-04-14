package com.websystique.spring.service;

import java.util.List;

import com.websystique.entities.Anciennete;
import com.websystique.entities.Banque;
import com.websystique.entities.Chauffeur;
import com.websystique.entities.Contrat;
import com.websystique.entities.Fonctionnaire;
import com.websystique.entities.IGR;
import com.websystique.entities.Professeur;
import com.websystique.entities.Profession;
import com.websystique.entities.TypeContrat;

public interface PaieService {
	public void ajouterBanque(Banque b);
	public void ajouterProfession(Profession p);
	public List<Profession> afficherProfession();	
	public List<TypeContrat> afficherTypeContrat();
    public List<Banque> afficherBanque();
    public List<Anciennete> afficheAnciennte();
	public Anciennete getAncienneteById(int getId);
	public void updateAnciennete(Long id, Anciennete a);
    public List<IGR> afficheIGR();
	public IGR getIGRById(int getId);
	public void updateIGR(Long id, IGR a);
	public Banque getBanqueById(int id);	
    public void ajouterFonctionnaire(Fonctionnaire f);
    public TypeContrat getTypeContratById(int id);
    public Profession getProfessionById(int id);
    public void ajouterContrat(Contrat c);
    public void ajouterChauffeur(Chauffeur c);
	public void ajouterProfesseur(Professeur p);
    public List<Fonctionnaire> afficherSalaries();
    public Fonctionnaire getSalarieById(int id);





}
