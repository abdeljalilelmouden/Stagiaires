package com.app.stagiaire.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.stagiaire.entities.Stagiaire;

@RepositoryRestResource(path = "stagiaires-web-rest")
public interface StagiaireRepositorie extends JpaRepository<Stagiaire, Long>{

}
