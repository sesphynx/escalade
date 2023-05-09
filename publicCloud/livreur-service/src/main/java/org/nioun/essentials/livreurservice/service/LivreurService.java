package org.nioun.essentials.livreurservice.service;

import java.util.List;

import org.nioun.essentials.niounlivraison.Livreur;



public interface LivreurService {


	Livreur saveLivreur(Livreur livreur);

	Livreur updateLivreur(Livreur livreur);

	void deleteLivreur(Livreur livreur);

	Livreur getLivreurById(Long id);

	List<Livreur> getAllLivreurs();
}
