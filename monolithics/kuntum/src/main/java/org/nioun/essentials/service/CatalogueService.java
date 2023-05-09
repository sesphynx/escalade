package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Category;
import org.nioun.essentials.entities.Producteur;
import org.nioun.essentials.entities.Produit;

public interface CatalogueService {
	
	/* Produits Sets */
	Produit saveProduit(Produit produit);

	Produit updateProduit(Produit produit);

	void deleteProduit(Produit produit);

	Produit getProduitById(Long id);

	List<Produit> getAllProduits();

	
	/* Category's Sets */
	
	Category saveCategory(Category category);

	Category updateCategory(Category category);

	void deleteCategory(Category category);

	Category getCategoryById(Long id);

	List<Category> getAllCategorys();
	
	/* Producteur's Sets */
	
	Producteur saveProducteur(Producteur producteur);

	Producteur updateProducteur(Producteur producteur);

	void deleteProducteur(Producteur producteur);

	Producteur getProducteurById(Long id);

	List<Producteur> getAllProducteurs();
	
	
	
}
