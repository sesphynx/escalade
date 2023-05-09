package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Voiturage;

public interface VoiturageService {
	
	Voiturage saveVoiturage(Voiturage voiturage);

	Voiturage updateVoiturage(Voiturage voiturage);

	void deleteVoiturage(Voiturage voiturage);

	Voiturage getVoiturageById(Long id);

	List<Voiturage> getAllVoiturages();

}
