package com.websystique.spring.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.spring.model.Caisse;
import com.websystique.spring.model.Etudiant;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Fonctionnaire;
import com.websystique.spring.model.Frais;
import com.websystique.spring.model.Niveau;
import com.websystique.spring.model.Reduction;


@Repository("PaiementDao")
public class PaiementDaoImpl extends AbstractDao implements PaiementDao{

	public void setFrais_Niveau(int idNiveau, int idFrais, double prix, String reduction) {
		// TODO ajouter les differents frais
		//Query query = getSession().createSQLQuery("insert into frais_niveau_paiement(frais_id_frais,niveau_id_niveau,prix,reduction) values('"+idFrais+"','"+idNiveau+"','"+prix+"','"+reduction+"')");
		
		Query query = getSession().createSQLQuery("UPDATE frais_niveau_paiement SET prix='"+prix+"', reduction='"+reduction+"' WHERE frais_id_frais='"+idFrais+"' AND niveau_id_niveau='"+idNiveau+"'");
		
		query.executeUpdate();
		
		
	}

	public Frais addFrais(Frais frais) {
		// TODO Auto-generated method stub
		persist(frais);
		return frais;
	}

	public Niveau addNiveau(Niveau niveau) {
		// TODO Auto-generated method stub
		persist(niveau);
		return niveau;
	}

	public Reduction addReduction(Reduction reduction) {
		// TODO Auto-generated method stub
		persist(reduction);
		return reduction;
	}

	public Reduction updateReduction(Reduction reduction,int id_reduction_old) {
		// TODO Auto-generated method stub
    Query query = getSession().createSQLQuery("UPDATE reduction_paiement SET nom='"+reduction.getNom()+"', value='"+reduction.getValue()+"' WHERE id_reduction='"+id_reduction_old+"' ");
	query.executeUpdate();
		//getSession().update(reduction);
		return reduction;
	}

	public void deleteReductionByName(String nom) {
		// TODO Auto-generated method stub
	Query query = getSession().createSQLQuery("delete from reduction_paiement WHERE nom='"+nom+"' ");
	query.executeUpdate();	
		
	}

	public Reduction getReductionByName(String nom) {
		Criteria criteria = getSession().createCriteria(Reduction.class);
		criteria.add(Restrictions.eq("nom",nom));
		return (Reduction) criteria.uniqueResult();
	}

	public Caisse addCaisse(Caisse caisse,int codeFonctionnaire) {
		Fonctionnaire fonc= (Fonctionnaire)getSession().load(Fonctionnaire.class, codeFonctionnaire);
		caisse.setFonctionnaire(fonc);
		persist(caisse);
		return caisse;
	}

	public Caisse updateCaisse(Caisse caisse, int id_caisse_old) {
		Query query = getSession().createSQLQuery("UPDATE caisse_paiement SET nom_caisse='"+caisse.getNom_caisse()+"' WHERE id_caisse='"+id_caisse_old+"' ");
		query.executeUpdate();
		return caisse;
	}

	public void deleteCaisseByName(String nom) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("delete from caisse_paiement WHERE nom_caisse='"+nom+"' ");
		query.executeUpdate();
	}

	public Facture addFacture(Facture facture, int codeEtudiant, int codeCaisse) {
		Etudiant etudiant= (Etudiant)getSession().load(Etudiant.class, codeEtudiant);
		facture.setEtudiant(etudiant);
		Caisse caisse= (Caisse)getSession().load(Caisse.class, codeCaisse);
		facture.setCaisse(caisse);
		persist(facture);
		return facture;
		
	}

	public void updateFacture(Facture facture, int codeFacture) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("UPDATE facture_paiement SET avance='"+facture.getAvance()+"' WHERE id_facture='"+codeFacture+"' ");
		query.executeUpdate();
		
	}

	public void deleteFactureByNum(int codeFacture) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("delete from facture_paiement WHERE id_facture='"+codeFacture+"' ");
		query.executeUpdate();
		
	}

}
