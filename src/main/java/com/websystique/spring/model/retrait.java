package com.websystique.spring.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("R")
public class retrait extends Operation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	public retrait(Date dateOperation, double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}
	
	

}
