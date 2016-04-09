package com.websystique.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.spring.model.Chauffeur_tr;
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
			
			Query query = getSession().createSQLQuery("delete from Vehicule where id_vehicule = :id");
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
	}


