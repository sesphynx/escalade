package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Promoteur;

public interface PromoteurService {

	Promoteur savePromoteur(Promoteur promoteur);

	Promoteur updatePromoteur(Promoteur promoteur);

	void deletePromoteur(Promoteur promoteur);

	Promoteur getPromoteurById(Long id);

	List<Promoteur> getAllPromoteurs();

	
	
}
