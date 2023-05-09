package org.nioun.essentials.filiereservice.service;

import java.util.List;

import org.nioun.essentials.niouncore.Filiere;

public interface FiliereService {


	Filiere saveFiliere(Filiere filiere);

	Filiere updateFiliere(Filiere filiere);

	void deleteFiliere(Filiere filiere);

	Filiere getFiliereById(Long id);

	List<Filiere> getAllFilieres();
}
