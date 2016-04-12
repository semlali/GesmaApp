package com.websystique.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="teledeclaration")
public class Teledeclaration implements  Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long idTeleDeclaration;

	public Long getIdTeleDeclaration() {
		return idTeleDeclaration;
	}

	public void setIdTeleDeclaration(Long idTeleDeclaration) {
		this.idTeleDeclaration = idTeleDeclaration;
	}

	public Teledeclaration(Long idTeleDeclaration) {
		super();
		this.idTeleDeclaration = idTeleDeclaration;
	}
	
}
