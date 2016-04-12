package com.websystique.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="profession")
public class Profession implements Serializable  {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idProfession ;

private String nomProfession;

@OneToMany(mappedBy="profession", fetch=FetchType.LAZY)
private Collection <Contrat> contrats;

@ManyToOne
private CIMR cimr;

public Profession(String nomProfession) {
	super();
	this.nomProfession = nomProfession;
}
public Profession() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getIdProfession() {
	return idProfession;
}
public void setIdProfession(Long idProfession) {
	this.idProfession = idProfession;
}
public String getNomProfession() {
	return nomProfession;
}
public void setNomProfession(String nomProfession) {
	this.nomProfession = nomProfession;
}
public Collection<Contrat> getContrats() {
	return contrats;
}
public void setContrats(Collection<Contrat> contrats) {
	this.contrats = contrats;
}
public CIMR getCimr() {
	return cimr;
}
public void setCimr(CIMR cimr) {
	this.cimr = cimr;
} 


}
