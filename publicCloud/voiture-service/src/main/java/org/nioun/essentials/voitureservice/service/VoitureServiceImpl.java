package org.nioun.essentials.voitureservice.service;

import java.util.List;

import org.nioun.essentials.niountransport.Voiture;
import org.nioun.essentials.voitureservice.repos.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureServiceImpl implements VoitureService {

	@Autowired
	VoitureRepository voitureRepository ;
	
	

	public VoitureRepository getVoitureRepository() {
		return voitureRepository;
	}

	public void setVoitureRepository(VoitureRepository voitureRepository) {
		this.voitureRepository = voitureRepository;
	}

	@Override
	public Voiture saveVoiture(Voiture voiture) {

		return voitureRepository.save(voiture);
	}

	@Override
	public Voiture updateVoiture(Voiture voiture) {
		return voitureRepository.save(voiture);
	}

	@Override
	public void deleteVoiture(Voiture voiture) {
    voitureRepository.delete(voiture);

	}

	@Override
	public Voiture getVoitureById(Long id) {
		return voitureRepository.getOne(id);
	}

	@Override
	public List<Voiture> getAllVoitures() {
		return voitureRepository.findAll();
	}


}
