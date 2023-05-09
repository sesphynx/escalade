package com.magma.quantum.machintech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.machintech.entities.Campagne;
import com.magma.quantum.machintech.repos.CampagneRepository;

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
