package org.nioun.essentials.machinter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.nioun.essentials.machinter.model.Campagne;
import org.nioun.essentials.machinter.repo.CampagneRepository;
import org.nioun.essentials.machinter.service.CampagneService;

@Service
public class CampagneServiceImpl implements CampagneService{

	@Autowired
	private CampagneRepository campagneRepository;
	
	public CampagneRepository getRepository() {
		return campagneRepository;
	}

	public void setRepository(CampagneRepository campagneRepository) {
		this.campagneRepository = campagneRepository;
	}
	
	public Campagne saveCampagne(Campagne campagne) {
		
		return campagneRepository.save(campagne);
	}

	
	public Campagne updateCampagne(Campagne campagne) {
	
		return campagneRepository.save(campagne);
	}

	
	public void deleteCampagne(Campagne campagne) {
		campagneRepository.delete(campagne);

	}
	
	
	public List<Campagne> getAllCampagnes() {
		return campagneRepository.findAll();
	}

		
	public Campagne getCampagneById(Long id) {
		return  campagneRepository.getOne(id);
	}

	

	
}
