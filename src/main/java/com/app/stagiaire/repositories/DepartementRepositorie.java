package com.app.stagiaire.repositories;
 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.rest.core.annotation.RepositoryRestResource; 

import com.app.stagiaire.entities.Departement; 
@RepositoryRestResource(path = "departements-web-rest") 
public interface DepartementRepositorie extends JpaRepository<Departement, Long> {

 
	 
}
