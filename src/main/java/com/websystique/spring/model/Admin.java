package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN_CLUB")
public class Admin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id_admin;
	
	private String nom_admin;
	private String prenom_admin;
	private String username;
	private String password;
	
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String nom_admin, String prenom_admin, String username,
			String password) {
		super();
		this.nom_admin = nom_admin;
		this.prenom_admin = prenom_admin;
		this.username = username;
		this.password = password;
	}
	public String getNom_admin() {
		return nom_admin;
	}
	public void setNom_admin(String nom_admin) {
		this.nom_admin = nom_admin;
	}
	public String getPrenom_admin() {
		return prenom_admin;
	}
	public void setPrenom_admin(String prenom_admin) {
		this.prenom_admin = prenom_admin;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
