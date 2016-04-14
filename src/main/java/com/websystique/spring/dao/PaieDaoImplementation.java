package com.websystique.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.entities.Anciennete;
import com.websystique.entities.Banque;
import com.websystique.entities.Chauffeur;
import com.websystique.entities.Contrat;
import com.websystique.entities.Fonctionnaire;
import com.websystique.entities.IGR;
import com.websystique.entities.Professeur;
import com.websystique.entities.Profession;
import com.websystique.entities.TypeContrat;
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

	
	
	}



	


