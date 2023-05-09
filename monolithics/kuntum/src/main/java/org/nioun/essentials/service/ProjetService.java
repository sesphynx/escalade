package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Projet;

public interface ProjetService {

	Projet saveProjet(Projet projet);

	Projet updateProjet(Projet projet);

	void deleteProjet(Projet projet);

	Projet getProjetById(Long id);

	List<Projet> getAllProjets();
	
}
