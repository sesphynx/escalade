package org.quantum.nine.magma.pharmog.service;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Producteur;

public interface ProducteurService {
	

	Producteur saveProducteur(Producteur producteur);

	Producteur updateProducteur(Producteur producteur);

	void deleteProducteur(Producteur producteur);

	Producteur getProducteurById(Long id);

	List<Producteur> getAllProducteurs();

}
