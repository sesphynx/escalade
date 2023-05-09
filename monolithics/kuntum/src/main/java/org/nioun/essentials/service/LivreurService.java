package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Livreur;


public interface LivreurService {

	Livreur saveLivreur(Livreur livreur);

	Livreur updateLivreur(Livreur livreur);

	void deleteLivreur(Livreur livreur);

	Livreur getLivreurById(Long id);

	List<Livreur> getAllLivreurs();

}
