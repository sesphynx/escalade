package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Voiture;

public interface VoitureService {
	
	Voiture saveVoiture(Voiture voiture);

	Voiture updateVoiture(Voiture voiture);

	void deleteVoiture(Voiture voiture);

	Voiture getVoitureById(Long id);

	List<Voiture> getAllVoitures();
}
