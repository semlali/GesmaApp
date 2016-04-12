package com.websystique.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cimr")
public class CIMR implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idCIMR;
private int tauxCimrSalarial;
private int tauxCimrPatronale;
@OneToMany (mappedBy="cimr", fetch=FetchType.LAZY)
private Collection<Profession> professions;


public CIMR() {
	super();
	// TODO Auto-generated constructor stub
}
public CIMR(int tauxCimrSalarial, int tauxCimrPatronale) {
	super();
	this.tauxCimrSalarial = tauxCimrSalarial;
	this.tauxCimrPatronale = tauxCimrPatronale;
}
public Long getIdCIMR() {
	return idCIMR;
}
public void setIdCIMR(Long idCIMR) {
	this.idCIMR = idCIMR;
}
public int getTauxCimrSalarial() {
	return tauxCimrSalarial;
}
public void setTauxCimrSalarial(int tauxCimrSalarial) {
	this.tauxCimrSalarial = tauxCimrSalarial;
}
public int getTauxCimrPatronale() {
	return tauxCimrPatronale;
}
public void setTauxCimrPatronale(int tauxCimrPatronale) {
	this.tauxCimrPatronale = tauxCimrPatronale;
}
public Collection<Profession> getProfessions() {
	return professions;
}
public void setProfessions(Collection<Profession> professions) {
	this.professions = professions;
}


}
