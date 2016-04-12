package com.websystique.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@DiscriminatorValue("chauffeur")
@Table(name="chauffeur")

public class Chauffeur extends Fonctionnaire  {
   private int numero_de_permis;
 
   
   
   
public Chauffeur(int numero_de_permis) {
	super();
	this.numero_de_permis = numero_de_permis;
}

public Chauffeur() {
	super();
	// TODO Auto-generated constructor stub
}

public int getNumero_de_permis() {
	return numero_de_permis;
}

public void setNumero_de_permis(int numero_de_permis) {
	this.numero_de_permis = numero_de_permis;
}

   
}
