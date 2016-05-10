package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="contrat")
public class Contrat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContrat;
	private Date dateEntree;
	private Date dateSortie;
	private Double salaireBase;
	private String modeRegelemnt;
	

	@ManyToOne
	private Profession profession;
	@ManyToOne 
	private TypeContrat typecontrat;
	
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	


	public Contrat(Date dateEntree, Date dateSortie, Double salaireBase,
			String modeRegelemnt, Profession profession, TypeContrat typecontrat) {
		super();
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
		this.salaireBase = salaireBase;
		this.modeRegelemnt = modeRegelemnt;
		this.profession = profession;
		this.typecontrat = typecontrat;
	}





	public Long getIdContrat() {
		return idContrat;
	}

	public void setIdContrat(Long idContrat) {
		this.idContrat = idContrat;
	}

	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public Double getSalaireBase() {
		return salaireBase;
	}

	public void setSalaireBase(Double salaireBase) {
		this.salaireBase = salaireBase;
	}

	public String getModeRegelemnt() {
		return modeRegelemnt;
	}

	public void setModeRegelemnt(String modeRegelemnt) {
		this.modeRegelemnt = modeRegelemnt;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public TypeContrat getTypecontrat() {
		return typecontrat;
	}

	public void setTypecontrat(TypeContrat typecontrat) {
		this.typecontrat = typecontrat;
	}
	
	
	

}
