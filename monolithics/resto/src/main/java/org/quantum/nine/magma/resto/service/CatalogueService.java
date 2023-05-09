package org.quantum.nine.magma.resto.service;

import java.util.List;

import org.quantum.nine.magma.resto.entities.Category;
import org.quantum.nine.magma.resto.entities.Plat;


public interface CatalogueService {
	
	/* Plats Sets */
	Plat savePlat(Plat plat);

	Plat updatePlat(Plat plat);

	void deletePlat(Plat plat);

	Plat getPlatById(Long id);

	List<Plat> getAllPlats();

	
	/* Category's Sets */
	
	Category saveCategory(Category category);

	Category updateCategory(Category category);

	void deleteCategory(Category category);

	Category getCategoryById(Long id);

	List<Category> getAllCategorys();
	
	
	
	
	
}
