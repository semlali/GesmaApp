package com.websystique.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="type_conge")

public class TypeConge implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTypeConge;
	private String type;
	
    @OneToMany(mappedBy="typeConge")
    private Collection <Conge> conges;
    
	public TypeConge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeConge(String type) {
		super();
		this.type = type;
	}
	public Long getIdTypeConge() {
		return idTypeConge;
	}
	public void setIdTypeConge(Long idTypeConge) {
		this.idTypeConge = idTypeConge;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Collection<Conge> getConges() {
		return conges;
	}
	public void setConges(Collection<Conge> conges) {
		this.conges = conges;
	}
	
	

}
