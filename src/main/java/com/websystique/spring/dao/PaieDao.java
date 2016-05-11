package com.websystique.spring.dao;
import java.util.List;

import com.websystique.spring.entities.*;


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
    public void ajouterContrat(Contrat c);
	public void ajouterChauffeur(Chauffeur c);
	public void ajouterProfesseur(Professeur p);
    public List<Fonctionnaire> afficherSalaries();
    public Fonctionnaire getSalarieById(int id);
    public void supprimerIgr(int id);
    public void supprimerAnciennete(int id);
    public Fonctionnaire chercherSalarieByName(String nom, String prenom);
    public Chauffeur chercherChauffeurByName(String nom, String prenom);
    public Professeur chercherProfesseurByName(String nom, String prenom);
    public void updateSalarieProf(Professeur p );
    public void updateSalarieChauffeur(Chauffeur c , Long id);
    public void updateSalarie(Fonctionnaire f );
    public List<Fonctionnaire>  chercherSalarieByProfession(int id );
	public List<Chauffeur> afficherListeChauffeur();
	public List<Professeur> afficherListeProfesseur();
	public List<PrimesVariables> afficherPrimes();
	public void ajouterIgr(IGR igr);
    public void ajouterAnciennete (Anciennete a);
    public List<PrimesVariables> afficherPrimesParam(); 
    public void supprimerPrimesPara (int id);
    public void supprimerHeuresSupPara (int id);
    public PrimesVariables getPrimesVariablesById(int id);
	public void ajouterPrimes(PrimesVariables p);
    public void updatePrimesVariables(PrimesVariables p,Long id);
    public void updateSalarieHeuresSupPrimes(Fonctionnaire f );
    public int [] getPrimesAssociedToSalarie(Long id);
	public void updateProfession(Profession p);

    	
    
}
