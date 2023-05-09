package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Filiere;

public interface FiliereService {
	
	Filiere saveFiliere(Filiere filiere);

	Filiere updateFiliere(Filiere filiere);

	void deleteFiliere(Filiere filiere);

	Filiere getFiliereById(Long id);

	List<Filiere> getAllFilieres();
	
}
