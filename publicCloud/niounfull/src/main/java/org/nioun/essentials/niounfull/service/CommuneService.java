package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Commune;

public interface CommuneService {

	Commune saveCommune(Commune commune);

	Commune updateCommune(Commune commune);

	void deleteCommune(Commune commune);

	Commune getCommuneById(Long id);

	List<Commune> getAllCommunes();

}
