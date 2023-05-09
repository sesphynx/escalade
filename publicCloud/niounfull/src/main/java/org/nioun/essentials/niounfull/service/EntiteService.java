package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Entite;

public interface EntiteService {

	Entite saveEntite(Entite entite);

	Entite updateEntite(Entite entite);

	void deleteEntite(Entite entite);

	Entite getEntiteById(Long id);

	List<Entite> getAllEntites();
}
