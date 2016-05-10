package com.websystique.spring.dao;


import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.spring.model.Arret_tr;
import com.websystique.spring.model.Chauffeur;
import com.websystique.spring.model.Etablissement;
import com.websystique.spring.model.Etudiant;
import com.websystique.spring.model.Vehicule;

@Repository(value="ITransportDao") 
public class TransportDaoImp extends AbstractDao implements ITransportDao {
	


	@Override
	public void AjouterVehicule(Vehicule vehicule) {
			
			persist(vehicule);
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Vehicule> getAllVehicules() {
			Criteria criteria = getSession().createCriteria(Vehicule.class);
			return (List<Vehicule>) criteria.list();
		}

		@Override
		public void deleteVehicule(int id) {
			
			Query query = getSession().createSQLQuery("delete from vehicule_tr where id_vehicule = :id");
			query.setInteger("id", id);
			query.executeUpdate();
			
		}

		@Override
		public Vehicule findById(int id) {
			Criteria criteria = getSession().createCriteria(Vehicule.class);
			criteria.add(Restrictions.eq("id",id));
			return (Vehicule) criteria.uniqueResult();
		}

		@Override
		public void updateVehicule(Vehicule vehicule) {
			
			getSession().update(vehicule);
			
		}

		@Override
		public Vehicule findByNumImm(int numImmatriculation) {
			Criteria criteria = getSession().createCriteria(Vehicule.class);
			criteria.add(Restrictions.eq("numImmatriculation",numImmatriculation));
			return (Vehicule) criteria.uniqueResult();
		}

		@Override
		public void AjouterEtablissement(Etablissement etablissement) {
		    
			persist(etablissement);
			
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Etudiant> getAllEtudiants() {
			Criteria criteria = getSession().createCriteria(Etudiant.class,"etudiant");
			criteria.add(Restrictions.eq("etudiant.etat_transport", "payé"));
			return (List<Etudiant>) criteria.list();
		}

		@Override
		public void deleteEtudiant(int id) {
			Query query = getSession().createSQLQuery("delete from etudiant where id_etudiant = :id");
			query.setInteger("id", id);
			query.executeUpdate();
			
		}

		@Override
		public Etudiant findEtudById(int id) {
			Criteria criteria = getSession().createCriteria(Etudiant.class);
			criteria.add(Restrictions.eq("id",id));
			return (Etudiant) criteria.uniqueResult();
		}

		@Override
		public void updateEtudiant(Etudiant et) {
			
			getSession().merge(et);
	
		}
		@SuppressWarnings("unchecked")
		@Override
		public List<Chauffeur> getAllchauffeurs() {
			Criteria criteria = getSession().createCriteria(Chauffeur.class);
			return (List<Chauffeur>) criteria.list();
		}

		@Override
		public Chauffeur findChauffeurById(int id) {
		
			Criteria criteria = getSession().createCriteria(Chauffeur.class);
			criteria.add(Restrictions.eq("id",id));
			return (Chauffeur) criteria.uniqueResult();
		}

	

		@SuppressWarnings("unchecked")
		@Override
		public List<Vehicule> getAllVehiculesChauffeurs() {
		
			Criteria criteria = getSession().createCriteria(Vehicule.class);
			criteria.createAlias("chauffeur", "c");
			criteria.add(Restrictions.eq("c.n_fonc",0));
			List<Vehicule> liste = (List<Vehicule>) criteria.list();
			return liste;			
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Arret_tr> getAllArrets() {
			
			Criteria criteria = getSession().createCriteria(Arret_tr.class);
			return (List<Arret_tr>) criteria.list();
		
		}

		@Override
		public void AjouterArret(Arret_tr arret) {
			
			persist(arret);
		
		}

		@Override
		public void deleteArret(int id) {
			Query query = getSession().createSQLQuery("delete from arret_tr where id_arret = :id");
			query.setInteger("id", id);
			query.executeUpdate();
			
		}

		@Override
		public Arret_tr findArretById(int id) {
			
			Criteria criteria = getSession().createCriteria(Arret_tr.class);
			criteria.add(Restrictions.eq("id",id));
			return (Arret_tr) criteria.uniqueResult();
		}

		@Override
		public void updateArret(Arret_tr arret) {
		
			getSession().update(arret);
			
		}

}


