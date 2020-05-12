package com.app.stagiaire.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
 
@Entity
public class Departement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String responsable;
	
	@OneToMany(mappedBy = "departement")
	private Set<Stagiaire> stagiaires;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public Set<Stagiaire> getStagiaires() {
		return stagiaires;
	}

	public void setStagiaires(Set<Stagiaire> stagiaires) {
		this.stagiaires = stagiaires;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Departement(Long id, String nom, String responsable, Set<Stagiaire> stagiaires) {
		super();
		this.id = id;
		this.nom = nom;
		this.responsable = responsable;
		this.stagiaires = stagiaires;
	}

	public Departement() {
		super();
	}
	
	

}
