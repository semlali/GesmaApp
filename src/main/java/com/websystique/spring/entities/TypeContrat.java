package com.websystique.spring.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="type_contrat")

public class TypeContrat implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idTypeContrat;
private String nomType;

@OneToMany(mappedBy="typecontrat")
private Collection <Contrat> contrats;

public TypeContrat(String nomType) {
	super();
	this.nomType = nomType;
}
public TypeContrat() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getIdTypeContrat() {
	return idTypeContrat;
}
public void setIdTypeContrat(Long idTypeContrat) {
	this.idTypeContrat = idTypeContrat;
}
public String getNomType() {
	return nomType;
}
public void setNomType(String nomType) {
	this.nomType = nomType;
}
public Collection<Contrat> getContrats() {
	return contrats;
}
public void setContrats(Collection<Contrat> contrats) {
	this.contrats = contrats;
}


}
