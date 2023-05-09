package org.nioun.essentials.voitureservice.service;

import java.util.List;

import org.nioun.essentials.niountransport.*;

public interface VoitureService {


	Voiture saveVoiture(Voiture voiture);

	Voiture updateVoiture(Voiture voiture);

	void deleteVoiture(Voiture voiture);

	Voiture getVoitureById(Long id);

	List<Voiture> getAllVoitures();
}
