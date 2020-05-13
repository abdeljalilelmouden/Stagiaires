package com.app.stagiaire.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn; 
import javax.persistence.ManyToOne;
@Entity
public class Stagiaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String diplome;
	private String imageUrl;
	private String observation;
	private Date dateDeDebutDeStage;
	private Date dateDeFinDeStage;
	private Date dateDeNaissance;
	private int telephone;
	private boolean remuneration;
	
	@ManyToOne
	@JoinColumn(name = "departement_id", nullable = false)
	private Departement departement;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public Date getDateDeDebutDeStage() {
		return dateDeDebutDeStage;
	}

	public void setDateDeDebutDeStage(Date dateDeDebutDeStage) {
		this.dateDeDebutDeStage = dateDeDebutDeStage;
	}

	public Date getDateDeFinDeStage() {
		return dateDeFinDeStage;
	}

	public void setDateDeFinDeStage(Date dateDeFinDeStage) {
		this.dateDeFinDeStage = dateDeFinDeStage;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public boolean isRemunération() {
		return remuneration;
	}

	public void setRemunération(boolean remunération) {
		this.remuneration = remunération;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public Stagiaire(Long id, String nom, String prenom, String diplome, String imageUrl, String observation,
			Date dateDeDebutDeStage, Date dateDeFinDeStage, Date dateDeNaissance, int telephone, boolean remunération,
			Departement departement) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.diplome = diplome;
		this.imageUrl = imageUrl;
		this.observation = observation;
		this.dateDeDebutDeStage = dateDeDebutDeStage;
		this.dateDeFinDeStage = dateDeFinDeStage;
		this.dateDeNaissance = dateDeNaissance;
		this.telephone = telephone;
		this.remuneration = remunération;
		this.departement = departement;
	}

	public Stagiaire() {
		super();
	}
	

}
