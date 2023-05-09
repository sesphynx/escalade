package org.nioun.essentials.voiturageservice.service;

import java.util.List;

import org.nioun.essentials.niountransport.*;

public interface VoiturageService {


	Voiturage saveVoiturage(Voiturage voiturage);

	Voiturage updateVoiturage(Voiturage voiturage);

	void deleteVoiturage(Voiturage voiturage);

	Voiturage getVoiturageById(Long id);

	List<Voiturage> getAllVoiturages();
}
