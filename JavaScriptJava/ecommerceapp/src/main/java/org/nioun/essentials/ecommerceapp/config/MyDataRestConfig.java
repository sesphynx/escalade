package org.nioun.essentials.ecommerceapp.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;

import org.nioun.essentials.ecommerceapp.entity.Product;
import org.nioun.essentials.ecommerceapp.entity.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
	
	@Autowired
	private EntityManager  entityManager;
	
	@Autowired
	public MyDataRestConfig(EntityManager  theEntityManager) {
		entityManager = theEntityManager ;
	}
	
	
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config ,  CorsRegistry cors ) {
		
		HttpMethod[] theUnsupportedActions = {HttpMethod.POST,HttpMethod.PUT,HttpMethod.DELETE};
	
	config.getExposureConfiguration()
		  .forDomainType(Product.class)
		  .withItemExposure((metdata , httpMethods) -> httpMethods.disable(theUnsupportedActions))
		  .withCollectionExposure((metdata,httpMethods) -> httpMethods.disable(theUnsupportedActions));
	

	config.getExposureConfiguration()
		  .forDomainType(ProductCategory.class)
		  .withItemExposure((metdata , httpMethods) -> httpMethods.disable(theUnsupportedActions))
		  .withCollectionExposure((metdata,httpMethods) -> httpMethods.disable(theUnsupportedActions));
	
	//call internal helper method to expose ids 
	exposeIds(config);
	
	}

private void exposeIds(RepositoryRestConfiguration config) {
		//expose entity ids
		//
		//- get a list of all entity classes from the entity manager 
	Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();
	
		// create an array list of those entity types
	List<Class> entityClasses = new ArrayList<>();

		// get the entity types for the entities
	for (EntityType tempEntityType:entities) {
		entityClasses.add(tempEntityType.getJavaType());
	}
	
		// expose the entity ids for the array of entity/domain types
	Class[] domainTypes = entityClasses.toArray(new Class[0]);
	config.exposeIdsFor(domainTypes);
	config.exposeIdsFor(ProductCategory.class);
	}
	

	


}
