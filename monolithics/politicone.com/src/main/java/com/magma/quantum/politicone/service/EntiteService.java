package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Entite;

public interface EntiteService {

	Entite saveEntite(Entite entite);

	Entite updateEntite(Entite entite);

	void deleteEntite(Entite entite);

	Entite getEntiteById(Long id);

	List<Entite> getAllEntites();
}
