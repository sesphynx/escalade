package org.nioun.essentials.livreur.service;

import java.util.List;

import org.nioun.essentials.livreur.model.Livreur;

public interface LivreurService {

Livreur	saveLivreur(Livreur livreur);

Livreur	updateLivreur(Livreur livreur);

void	deleteLivreur(Livreur livreur);

Livreur	getLivreur(Long id);

List<Livreur>	getAllLivreurs();
	
}
