package com.websystique.spring.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.spring.entities.*;

@Repository("PaieDao")

public class PaieDaoImplementation extends AbstractDao implements PaieDao {

	@Override
	public void ajouterBanque(Banque b) {
		// TODO Auto-generated method stub
		
		persist(b);
		

		
	}
	
	public void ajouterProfession(Profession p){
		persist(p);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Profession> afficherProfession() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Profession.class);
		return (List<Profession>) criteria.list();
	
	}

	@Override
	@SuppressWarnings("unchecked")

	public List<Banque> afficherBanque() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Banque.class);
		return (List<Banque>) criteria.list();
	
	}

	@Override
	@SuppressWarnings("unchecked")

	public List<Anciennete> afficheAnciennte() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Anciennete.class);
		return (List<Anciennete>) criteria.list();
	}

	@Override
	public Anciennete  getAncienneteById(int id) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Anciennete.class).add(Restrictions.eq("idAnciennete", new Long(id)));
		return   (Anciennete) criteria.uniqueResult();
	}

	@Override
	public void updateAnciennete(Long id, Anciennete a) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("UPDATE anciennete SET debutTranche='"+a.getDebutTranche()+"',finTranche='"+a.getFinTranche()+"', tauxAnciennete='"+a.getTauxAnciennete()+"' WHERE idAnciennete='"+id+"' ");
		query.executeUpdate();
	}

	@Override
	@SuppressWarnings("unchecked")

	public List<IGR> afficheIGR() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(IGR.class);
		return (List<IGR>) criteria.list();
	}

	@Override
	public IGR getIGRById(int id) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(IGR.class).add(Restrictions.eq("idIgr", new Long(id)));
		return   (IGR) criteria.uniqueResult();
	}

	@Override
	public void updateIGR(Long id, IGR a) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("UPDATE igr SET debutTranche='"+a.getDebutTranche()+"',finTranche='"+a.getFinTranche()+"', sommeADeduire='"+a.getSommeADeduire()+"', taux='"+a.getTaux()+"' WHERE idIGR='"+id+"' ");
		query.executeUpdate();
		System.out.println("valeurs mise a jours "+a.getDebutTranche()+" "+a.getFinTranche()+" "+a.getSommeADeduire()+" "+a.getTaux()+"id :"+id);

	}

	@Override
	public Banque getBanqueById(int id) {
		Criteria criteria = getSession().createCriteria(Banque.class).add(Restrictions.eq("idBanque", new Long(id)));
		return   (Banque) criteria.uniqueResult();
	
	}

	@Override
	public void ajouterFonctionnaire(Fonctionnaire f) {
		// TODO Auto-generated method stub
		persist(f);
	}

	

	@Override
	@SuppressWarnings("unchecked")

	public List<TypeContrat> afficherTypeContrat() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(TypeContrat.class);
		return (List<TypeContrat>) criteria.list();

	}

	@Override
	public TypeContrat getTypeContratById(int id) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(TypeContrat.class).add(Restrictions.eq("idTypeContrat", new Long(id)));
		return   (TypeContrat) criteria.uniqueResult();
	
	}

	@Override
	public Profession getProfessionById(int id) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Profession.class).add(Restrictions.eq("idProfession", new Long(id)));
		return   (Profession) criteria.uniqueResult();
	
	}

	@Override
	public void ajouterContrat(Contrat c) {
		// TODO Auto-generated method stub
	    persist(c);
    	}

	@Override
	public void ajouterChauffeur(Chauffeur c) {
		// TODO Auto-generated method stub
		persist(c);
		
	}

	@Override
	public void ajouterProfesseur(Professeur p) {
		// TODO Auto-generated method stub
		persist(p);
	}

	@Override
	public List<Fonctionnaire> afficherSalaries() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Fonctionnaire.class);
		return (List<Fonctionnaire>) criteria.list();
	}

	@Override
	public Fonctionnaire getSalarieById(int id) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Fonctionnaire.class).add(Restrictions.eq("n_fonc", id));
		return   (Fonctionnaire) criteria.uniqueResult();
	}

	@Override
	public void supprimerIgr(int id) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("Delete  from  igr where idIgr ='"+id+"' ");
		query.executeUpdate();
	}

	@Override
	public void supprimerAnciennete(int id) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("Delete  from  anciennete where idAnciennete ='"+id+"' ");
		query.executeUpdate();
	}

	@Override
	public Fonctionnaire chercherSalarieByName(String nom, String prenom) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Fonctionnaire.class).add(Restrictions.eq("nom_fonc",nom)).add(Restrictions.eq("prenom_fonc",prenom));
		
     return (Fonctionnaire) criteria.uniqueResult();
		   
	}

	@Override
	public Chauffeur chercherChauffeurByName(String nom, String prenom) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Chauffeur.class).add(Restrictions.eq("nom_fonc",nom)).add(Restrictions.eq("prenom_fonc",prenom));
		
	     return (Chauffeur) criteria.uniqueResult();
	}

	@Override
	public Professeur chercherProfesseurByName(String nom, String prenom) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Professeur.class).add(Restrictions.eq("nom_fonc",nom)).add(Restrictions.eq("prenom_fonc",prenom));
		
	     return (Professeur) criteria.uniqueResult();
	}

	@Override
	public void updateSalarieProf(Professeur p) {
		// TODO Auto-generated method stub
		getSession().update(p);
	}

	@Override
	public void updateSalarieChauffeur(Chauffeur c, Long id) {
		
		// TODO Auto-generated method stub
		
				
		  Query query = getSession().createSQLQuery("Update fonctionnaire set nom_fonc='"
		  
					    +c.getNom_fonc()
					    +"',prenom_fonc='"+c.getPrenom_fonc()
					    +"', nom_fonc_ara='"+c.getNom_fonc_ara()
					    +"',prenom_fonc_ara='"+c.getPrenom_fonc_ara()
					    +"',matricule='"+c.getMatricule()
					    +"', nationalite='"+c.getNationalite()
					    +"', cin='"+c.getCin()
					    +"',carte_sejour='"+c.getCarte_sejour()
					    +"',date_naissance='"+c.getDate_naissance()
					    +"', lieu_naissance='"+c.getLieu_naissance()
					    +"',sexe='"+c.getSexe()
					    +"',situation_familiale='"+c.getSituation_familiale()
						+"',nbr_enfants='"+c.getNbr_enfants()
						+"',adresse='"+c.getAdresse()
						+"',ville='"+c.getVille()
						+"',telephone='"+c.getTelephone()
						+"',email='"+c.getEmail()
						+"',date_travail='"+c.getDate_travail()
						+"',sortieTravail='"+c.getSortieTravail()
						+"',compteBancaire='"+c.getCompteBancaire()
						+"',agenceBancaire='"+c.getAgenceBancaire()
						+"',login='"+c.getLogin()
						+"',pass='"+c.getPass()
						+"',num_cnss='"+c.getNumCnss()
						+"',num_cimr='"+c.getNumCimr()
						+"',num_mutuelle='"+c.getNumMutuelle()
						+"',salaireBase='"+c.getSalaireBase()
						+"',frais_professionnels='"+c.getFrais_professionnels()
						+"',numero_de_permis='"+c.getNumero_de_permis()
						+"',modeRegelement='"+c.getModeRegelement()
						+"',banque_idBanque='"+c.getBanque().getIdBanque()
						+"',profession_id_tache='"+c.getProfession().getIdProfession()
						+"',contrat_idContrat='"+c.getContrat().getIdContrat()
						+"',ExoAmo='"+c.getExoAmo()
						+"',ExoIr='"+c.getExoIr()
						+"',ExoCnss='"+c.getExoCnss()
					    + "'where n_fonc ='"+id+"' ");
			    
		  
		           query.executeUpdate();

	}

	@Override
	public void updateSalarie(Fonctionnaire f) {
		// TODO Auto-generated method stub
		getSession().update(f);

	}

	@Override
	@SuppressWarnings("unchecked")

	public List<Fonctionnaire> chercherSalarieByProfession(int id) {
		// TODO Auto-generated method stub
		
	
		Criteria criteria = getSession().createCriteria(Fonctionnaire.class).add(Restrictions.eq("id_tache",id));
		
	     return (List<Fonctionnaire>)criteria.list();
		
	}

	@Override
	@SuppressWarnings("unchecked")

	public List<Chauffeur> afficherListeChauffeur() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Chauffeur.class);
		
	     return (List<Chauffeur>)criteria.list();
	}

	@Override
	@SuppressWarnings("unchecked")

	public List<Professeur> afficherListeProfesseur() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Professeur.class);
		
	     return (List<Professeur>)criteria.list();
	}

	@Override
	@SuppressWarnings("unchecked")

	public List<PrimesVariables> afficherPrimes() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(PrimesVariables.class);
		
	     return (List<PrimesVariables>)criteria.list();
	}

	@Override
	public void ajouterIgr(IGR igr) {
		// TODO Auto-generated method stub
		persist(igr);
	}

	@Override
	public void ajouterAnciennete(Anciennete a) {
		// TODO Auto-generated method stub
		persist(a);
	}

	@Override
	@SuppressWarnings("unchecked")

	public List<PrimesVariables> afficherPrimesParam() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(PrimesVariables.class);
		return (List<PrimesVariables>) criteria.list();
	
	}

	@Override
	public void supprimerPrimesPara(int id) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("Delete  from  primes_variables where idPrimeVariable ='"+id+"' ");
		query.executeUpdate();
	}

	@Override
	public PrimesVariables getPrimesVariablesById(int id) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(PrimesVariables.class).add(Restrictions.eq("idPrimeVariable", new Long(id)));
		return   (PrimesVariables) criteria.uniqueResult();
	}

	@Override
	public void ajouterPrimes(PrimesVariables p) {
		// TODO Auto-generated method stub
		persist(p);
	}

	@Override
	public void updatePrimesVariables(PrimesVariables p, Long id) {
		// TODO Auto-generated method stub
		System.out.println(" cnc checked normalement true ==="+p.getImposableCNSS());
		System.out.println("id a la requette ="+id);

		int a=0, b=0, c=0,d=0;
		if(p.getBaseAnciennete()){
			a=1;
		}
		if(p.getImposableCNSS())
		{
			b=1;
		}
		if(p.getImposableIR()){
			c=1;
		}
		if(p.getAvantagesNature())
		{
			d=1;
		}
		Query query = getSession().createSQLQuery("UPDATE primes_variables SET nomPrimeVariable='"+p.getNomPrimeVariable()+"',baseAnciennete='"+a+"', imposableCNSS='"+b+"', imposableIR='"+c+"', avantagesNature='"+d+"', valeur='"+p.getValeur()+"' WHERE idPrimeVariable='"+id+"' ");
		query.executeUpdate();
	}

	@Override
	public void updateSalarieHeuresSupPrimes(Fonctionnaire f) {
		// TODO Auto-generated method stub
		
            getSession().merge(f);
		
	}
// je me suis arrete ici
	@Override
	public int[] getPrimesAssociedToSalarie(Long id) {
		// TODO Auto-generated method stub
	   return null;
	}

	@Override
	public void supprimerHeuresSupPara(int id) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("Delete  from  heures_supplementaires where idHeuresSup ='"+id+"' ");
		query.executeUpdate();
	}

	@Override
	public void updateProfession(Profession p) {
		// TODO Auto-generated method stub
        getSession().merge(p);

	}
	
//  
	}



	


