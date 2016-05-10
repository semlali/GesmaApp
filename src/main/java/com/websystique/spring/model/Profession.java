package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tache")
public class Profession implements Serializable  {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id_tache")
private Long idProfession ;

@Column(name="designation_tache_fr")
private String nomProfession;
@Column(name="designation_tache")
private String nomProfession_arabe;
@Column(name="code_tache")
private int codeProfession;

@OneToMany(mappedBy="profession", fetch=FetchType.LAZY)
private Collection <Contrat> contrats;



@ManyToOne
private CIMR cimr;

public Profession(String nomProfession) {
	super();
	this.nomProfession = nomProfession;
}

public Profession(String nomProfession, String nomProfession_arabe,
		int codeProfession) {
	super();
	this.nomProfession = nomProfession;
	this.nomProfession_arabe = nomProfession_arabe;
	this.codeProfession = codeProfession;
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
public String getNomProfession_arabe() {
	return nomProfession_arabe;
}
public void setNomProfession_arabe(String nomProfession_arabe) {
	this.nomProfession_arabe = nomProfession_arabe;
}
public int getCodeProfession() {
	return codeProfession;
}
public void setCodeProfession(int codeProfession) {
	this.codeProfession = codeProfession;
}




}
