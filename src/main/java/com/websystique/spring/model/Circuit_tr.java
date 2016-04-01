package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="circuit_tr")
public class Circuit_tr implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id_circuit;
	
	@OneToMany(mappedBy="circuit")
	private Collection<Quartier_tr> quarties;

	public Circuit_tr(int id_circuit) {
		super();
		this.id_circuit = id_circuit;
	}


	public int getId_circuit() {
		return id_circuit;
	}


	public void setId_circuit(int id_circuit) {
		this.id_circuit = id_circuit;
	}


	public Circuit_tr() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}

