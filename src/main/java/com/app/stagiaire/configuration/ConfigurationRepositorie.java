package com.app.stagiaire.configuration;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

 
@Configuration
public class ConfigurationRepositorie implements RepositoryRestConfigurer{
	@Autowired
	private EntityManager entityManager; 
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		//config.exposeIdsFor(Stagiaire.class,Departement.class);
		// AFFICHER LE ID DANS LES RESULTA JSON 
		config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new));
		
		config.getCorsRegistry().addMapping("/**").allowedOrigins("http://localhost:4200");
		
		
	}

}
