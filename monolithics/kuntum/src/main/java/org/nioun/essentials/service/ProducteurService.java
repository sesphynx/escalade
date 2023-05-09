package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Producteur;

public interface ProducteurService {
	

	Producteur saveProducteur(Producteur producteur);

	Producteur updateProducteur(Producteur producteur);

	void deleteProducteur(Producteur producteur);

	Producteur getProducteurById(Long id);

	List<Producteur> getAllProducteurs();

}
