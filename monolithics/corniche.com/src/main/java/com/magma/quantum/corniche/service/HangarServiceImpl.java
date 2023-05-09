package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.Hangar;
import com.magma.quantum.corniche.repos.HangarRepository;

@Service
public class HangarServiceImpl implements HangarService {

	@Autowired
	HangarRepository hangarRepository;
	
	
	
	public HangarRepository getHangarRepository() {
		return hangarRepository;
	}

	public void setHangarRepository(HangarRepository hangarRepository) {
		this.hangarRepository = hangarRepository;
	}

	public Hangar saveHangar(Hangar hangar) {
		
		return hangarRepository.save(hangar);
	}


	public Hangar updateHangar(Hangar hangar) {

		return hangarRepository.save(hangar);
	}

	
	public void deleteHangar(Hangar hangar) {
	hangarRepository.delete(hangar);

	}

	
	public Hangar getHangar(Long id) {
	
		return hangarRepository.getOne(id);
	}

	
	public List<Hangar> getAllHangars() {
	
		return hangarRepository.findAll();
	}

}
