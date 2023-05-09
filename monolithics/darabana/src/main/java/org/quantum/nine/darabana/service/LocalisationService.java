package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Localisation;


public interface LocalisationService {
	

	Localisation saveLocalisation(Localisation localisation);

	Localisation updateLocalisation(Localisation localisation);

	void deleteLocalisation(Localisation localisation);

	Localisation getLocalisationById(Long id);

	List<Localisation> getAllLocalisations();

}
