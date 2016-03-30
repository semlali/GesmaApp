package com.websystique.spring.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("V")
public class versement extends Operation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public versement(Date dateOperation, double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	
}
