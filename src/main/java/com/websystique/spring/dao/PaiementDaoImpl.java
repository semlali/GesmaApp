package com.websystique.spring.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.spring.model.Branche;
import com.websystique.spring.model.Caisse;
import com.websystique.spring.model.CategoriePaiement;
import com.websystique.spring.model.Classe;
import com.websystique.spring.model.Compte;
import com.websystique.spring.model.DetailFacture;
import com.websystique.spring.model.Etudiant;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Fonctionnaire;
import com.websystique.spring.model.Frais;
import com.websystique.spring.model.Frais_Niveau;
import com.websystique.spring.model.Niveau;



@Repository("PaiementDao")
public class PaiementDaoImpl extends AbstractDao implements PaiementDao{

	public void setFrais_Niveau(int idNiveau, int idFrais, double prix, Double reduction) {
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

	

	public void deleteReductionByName(String nom) {
		// TODO Auto-generated method stub
	Query query = getSession().createSQLQuery("delete from reduction_paiement WHERE nom='"+nom+"' ");
	query.executeUpdate();	
		
	}


	public Caisse addCaisse(Caisse caisse) {
		
		persist(caisse);
		
		return caisse;
	}

	public Caisse updateCaisse(Caisse caisse, int id_caisse_old) {
		Query query = getSession().createSQLQuery("UPDATE caisse_paiement SET nom_caisse='"+caisse.getNom_caisse()+"', fonctionnaire_n_fonc='"+caisse.getFonctionnaire().getN_fonc()+"' WHERE id_caisse='"+id_caisse_old+"'");
		query.executeUpdate();
		return caisse;
	}

	public void deleteCaisseById(int id) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("delete from caisse_paiement WHERE id_caisse='"+id+"' ");
		query.executeUpdate();
	}

	public Facture addFacture(Facture facture) {
		
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

	@Override
	public Facture consulterFacture(String numFacture) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Facture.class);
		criteria.add(Restrictions.eq("numFacture",numFacture));
		return (Facture) criteria.uniqueResult();
		
	}

	@Override
	public List<Niveau> getAllNiveau() {
		// TODO Auto-generated method stub
		List<Niveau> list=getSession().createCriteria(Niveau.class).list();
		
		return list;
	}
	
	@Override
	public List<Niveau> getAllNiveauName() {
		// TODO Auto-generated method stub
		List<Niveau> list=getSession().createCriteria(Niveau.class).setProjection(Projections.property("niveau_scolaire")).list();
		
		return list;
	}
	
	
	

	@Override
	public List<Branche> getAllBranche() {
		// TODO Auto-generated method stub
      //List<Branche> list=getSession().createCriteria(Branche.class).setProjection(Projections.property("nom_branche")).list();
		List<Branche> list=getSession().createCriteria(Branche.class).setProjection(Projections.property("nom_branche")).list();
		return list;
	}

	@Override
	public List<Frais> getAllFrais() {
List<Frais> list=getSession().createCriteria(Frais.class).list();
		
		return list;
	}

	@Override
	public Frais getFraisById(int id) {
		Criteria criteria = getSession().createCriteria(Frais.class);
		criteria.add(Restrictions.eq("id_frais",id));
		return (Frais) criteria.uniqueResult();
	}
	@Override
	public Frais getFraisByName(String nom) {
		Criteria criteria = getSession().createCriteria(Frais.class);
		criteria.add(Restrictions.eq("nom",nom));
		return (Frais) criteria.uniqueResult();
	}

	@Override
	public Niveau getNiveauById(int id) {
		Criteria criteria = getSession().createCriteria(Niveau.class);
		criteria.add(Restrictions.eq("id_niveau",id));
		return (Niveau) criteria.uniqueResult();
	}

	@Override
	public List<Frais_Niveau> getAllNiveauFrais() {
		List<Frais_Niveau> list=getSession().createCriteria(Frais_Niveau.class).list();
		return list;
	}


	@Override
	public Frais_Niveau AddFrais_Niveau(Frais_Niveau fn) {
		// TODO Auto-generated method stub
		
   Query query = getSession().createSQLQuery("insert into frais_niveau_paiement(frais_id_frais,niveau_id_niveau,categoriePaiement_id_categoriePaiement,prix,reduction) values('"+fn.getFrais().getId_frais()+"','"+fn.getNiveau().getId_niveau()+"','"+fn.getCategoriepaiement().getId_categoriePaiement()+"','"+fn.getPrix()+"','"+fn.getReduction()+"')"); 
		   query.executeUpdate();
		return null;
	}


	@Override
	public Frais_Niveau deleteFraisById(int getId) {
		
		Frais_Niveau fn=getNiveauFraisById(getId);
		delete(fn);
		 return fn;
	}


	@Override
	public Frais_Niveau getNiveauFraisById(int id) {
		Criteria criteria = getSession().createCriteria(Frais_Niveau.class);
		criteria.add(Restrictions.eq("id_frais_niveau",id));
		return (Frais_Niveau) criteria.uniqueResult();
	}


	@Override
	public List<Caisse> getAllCaisse() {
		List<Caisse> list=getSession().createCriteria(Caisse.class).list();
		return list;
	}


	@Override
	public List<Fonctionnaire> getAllFontionnaire() {
		List<Fonctionnaire> list=getSession().createCriteria(Fonctionnaire.class).list();
		return list;
	}


	@Override
	public Caisse getCaisseById(int getId) {
		Criteria criteria = getSession().createCriteria(Caisse.class);
		criteria.add(Restrictions.eq("id_caisse",getId));
		return (Caisse) criteria.uniqueResult();
	}


	@Override
	public Fonctionnaire getFonctionnaireById(int id) {
		Criteria criteria = getSession().createCriteria(Fonctionnaire.class);
		criteria.add(Restrictions.eq("n_fonc",id));
		return (Fonctionnaire) criteria.uniqueResult();
	}


	@Override
	public List<Compte> getAllCompte() {
		List<Compte> list=getSession().createCriteria(Compte.class).list();
		return list;
	}


	@Override
	public Compte addCompte(Compte compte) {
		// TODO Auto-generated method stub
		persist(compte);
		return compte;
	}


	@Override
	public Compte deleteCompteByCodeCompte(String getId) {
		
		Compte compte=getCompteByCode(getId);
		delete(compte);
		
		return compte;
	}


	@Override
	public Compte getCompteByCode(String getId) {
		Criteria criteria = getSession().createCriteria(Compte.class);
		criteria.add(Restrictions.eq("codeCompte",getId));
		return (Compte) criteria.uniqueResult();
	}


	@Override
	public void updateCompteByCode(Compte compte) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("UPDATE  compte_bancaire SET solde='"+compte.getSolde()+"', CODE_FONCTIONNAIRE='"+compte.getFonctionnaire().getN_fonc()+"' WHERE codeCompte='"+compte.getCodeCompte()+"' ");
		query.executeUpdate();
		
	}


	@Override
	public List<Etudiant> getAllEtudiant() {
		List<Etudiant> list=getSession().createCriteria(Etudiant.class).list();
		return list;
	}


	@Override
	public List<Facture> getAllFactureForOneEtudiant(int id_etudiant) {
		
		Criteria cr = getSession().createCriteria(Facture.class).createAlias("etudiant", "e");
		cr.add(Restrictions.eq("e.n_etudiant", id_etudiant));
		List<Facture> results = cr.list();
		
		
	    
		return results;
	}


	@Override
	public List<Branche> findBrancheForNiveauName(String string) {
		
		Criteria cr = getSession().createCriteria(Branche.class).createAlias("niveau", "n");
		cr.add(Restrictions.eq("n.niveau_scolaire", string));
		List<Branche> results = cr.list();
		
		
	    
		return results;
		
	}


	@Override
	public List<Classe> findClasseForBrancheName(String nomBranche) {

		Criteria cr = getSession().createCriteria(Classe.class).createAlias("branche", "b");
		cr.add(Restrictions.eq("b.nom_branche", nomBranche));
		List<Classe> results = cr.list();
		
		
	    
		return results;
	}


	@Override
	public List<Etudiant> findEtudiantForClasseName(String nomClasse) {

		Criteria cr = getSession().createCriteria(Etudiant.class).createAlias("classe", "c");
		cr.add(Restrictions.eq("c.nom_classe", nomClasse));
		List<Etudiant> results = cr.list();
		
		
	    
		return results;
	}


	@Override
	public Frais_Niveau getPrixForFraisNiveau(int fraisId,String niveauName,int idcategorie) {
		
		Criteria cr = getSession().createCriteria(Frais_Niveau.class).createAlias("frais", "f");
		cr.add(Restrictions.eq("f.id_frais", fraisId));
		cr.createAlias("niveau", "n");
		cr.add(Restrictions.eq("n.niveau_scolaire", niveauName));
		cr.createAlias("categoriepaiement", "c");
		cr.add(Restrictions.eq("c.id_categoriePaiement", idcategorie));
		
		
		return (Frais_Niveau) cr.uniqueResult();
	}


	@Override
	public Etudiant getEtudiantById(int id) {
		
		Criteria criteria = getSession().createCriteria(Etudiant.class);
		criteria.add(Restrictions.eq("n_etudiant",id));
		return (Etudiant) criteria.uniqueResult();
	}


	@Override
	public List<Classe> getAllClasse() {

             List<Classe> list=getSession().createCriteria(Classe.class).list();
		
		return list;
	}


	@Override
	public List<Etudiant> getAllImpaye(int IdClasse) {
		
		Criteria cr = getSession().createCriteria(Etudiant.class);
		cr.createAlias("classe", "c");
		List<Etudiant> list = cr.add(Restrictions.eq("c.id_classe", IdClasse)).list();
		
		return list;
	}


	@Override
	public Classe getClasseById(int classe) {
		
		Criteria criteria = getSession().createCriteria(Classe.class);
		criteria.add(Restrictions.eq("id_classe",classe));
		return (Classe) criteria.uniqueResult();
		
	}


	@Override
	public List<Etudiant> getEtatEtudiantByBranche(String nomBranche) {
		
		Criteria cr = getSession().createCriteria(Etudiant.class);
		cr.createAlias("branche", "b");
		List<Etudiant> list = cr.add(Restrictions.eq("b.nom_branche", nomBranche)).list();
		
		return list;
	}


	@Override
	public void updateEtatTransportEtudiant(Etudiant etudiant, String s) {
		
      Query query = getSession().createSQLQuery("UPDATE etudiant SET etat_transport='"+s+"' WHERE n_etudiant='"+etudiant.getN_etudiant()+"'");
	   query.executeUpdate();
		
	}


	@Override
	public void updateEtatInscriptionEtudiant(Etudiant etudiant, String s) {
		
		Query query = getSession().createSQLQuery("UPDATE etudiant SET etat_inscription='"+s+"' WHERE n_etudiant='"+etudiant.getN_etudiant()+"'");
		   query.executeUpdate();
		
	}


	@Override
	public Etudiant getEtatEtudiantParNom(String nom,String prenom) {
		
		Criteria criteria = getSession().createCriteria(Etudiant.class);
		criteria.add(Restrictions.eq("nom_etudiant",nom));
		criteria.add(Restrictions.eq("prenom_etudiant",prenom));
		return (Etudiant) criteria.uniqueResult();
		
	}


	@Override
	public List<CategoriePaiement> getAllcategories() {
       List<CategoriePaiement> list=getSession().createCriteria(CategoriePaiement.class).list();
		
		return list;
	}


	@Override
	public CategoriePaiement getCategorieById(int idcategorie) {
		Criteria criteria = getSession().createCriteria(CategoriePaiement.class);
		criteria.add(Restrictions.eq("id_categoriePaiement",idcategorie));
		return (CategoriePaiement) criteria.uniqueResult();
	}


	@Override
	public DetailFacture addDetailFacture(DetailFacture detail) {
		persist(detail);
		return detail;
	}


	@Override
	public Facture getFactureById(int getId) {
		Criteria criteria = getSession().createCriteria(Facture.class);
		criteria.add(Restrictions.eq("id_facture",getId));
		return (Facture) criteria.uniqueResult();
	}


	@Override
	public List<DetailFacture> getAllDetailFactureForFacture(Facture facture) {
		
		Criteria cr = getSession().createCriteria(DetailFacture.class).createAlias("facture", "f");
		cr.add(Restrictions.eq("f.id_facture", facture.getId_facture()));
		List<DetailFacture> results = cr.list();
		return results;
		
	}


	@Override
	public Etudiant connexion(String nom, String pass) {
		Criteria criteria = getSession().createCriteria(Etudiant.class);
		criteria.add(Restrictions.eq("login",nom));
		criteria.add(Restrictions.eq("pass",pass));
		return (Etudiant) criteria.uniqueResult();
	}


	@Override
	public Fonctionnaire connxionFonc(String nom, String pass) {
		Criteria criteria = getSession().createCriteria(Fonctionnaire.class);
		criteria.add(Restrictions.eq("login",nom));
		criteria.add(Restrictions.eq("pass",pass));
		return (Fonctionnaire) criteria.uniqueResult();
	}


	@Override
	public Facture mergeFacture(Facture facture) {
		// TODO Auto-generated method stub
		 getSession().merge(facture);
		 return facture;
	}


	





	


	

}
