package org.nioun.essentials.voiturageservice.service;

import java.util.List;

import org.nioun.essentials.niountransport.Voiturage;
import org.nioun.essentials.voiturageservice.repos.VoiturageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoiturageServiceImpl implements VoiturageService {

	@Autowired
	VoiturageRepository voiturageRepository ;
	
	

	public VoiturageRepository getVoiturageRepository() {
		return voiturageRepository;
	}

	public void setVoiturageRepository(VoiturageRepository voiturageRepository) {
		this.voiturageRepository = voiturageRepository;
	}

	@Override
	public Voiturage saveVoiturage(Voiturage voiturage) {

		return voiturageRepository.save(voiturage);
	}

	@Override
	public Voiturage updateVoiturage(Voiturage voiturage) {
		return voiturageRepository.save(voiturage);
	}

	@Override
	public void deleteVoiturage(Voiturage voiturage) {
    voiturageRepository.delete(voiturage);

	}

	@Override
	public Voiturage getVoiturageById(Long id) {
		return voiturageRepository.getOne(id);
	}

	@Override
	public List<Voiturage> getAllVoiturages() {
		return voiturageRepository.findAll();
	}


}
