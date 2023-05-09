package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Faiseur;

public interface FaiseurService {

	Faiseur saveFaiseur(Faiseur faiseur);

	Faiseur updateFaiseur(Faiseur faiseur);

	void deleteFaiseur(Faiseur faiseur);

	Faiseur getFaiseurById(Long id);

	List<Faiseur> getAllFaiseurs();
}
