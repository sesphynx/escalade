package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Commune;

public interface CommuneService {
	
	Commune saveCommune(Commune commune);

	Commune updateCommune(Commune commune);

	void deleteCommune(Commune commune);

	Commune getCommuneById(Long id);

	List<Commune> getAllCommunes();
	
	Commune getByNom(String nom);
	

}
