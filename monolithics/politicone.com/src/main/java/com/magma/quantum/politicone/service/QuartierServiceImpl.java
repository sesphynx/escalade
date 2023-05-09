package com.magma.quantum.politicone.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.politicone.entities.Quartier;
import com.magma.quantum.politicone.repos.QuartierRepository;

@Service
public class QuartierServiceImpl implements QuartierService {

	@Autowired
	QuartierRepository quartierRepository ;
	
	

	public QuartierRepository getQuartierRepository() {
		return quartierRepository;
	}

	public void setQuartierRepository(QuartierRepository quartierRepository) {
		this.quartierRepository = quartierRepository;
	}

	@Override
	public Quartier saveQuartier(Quartier quartier) {

		return quartierRepository.save(quartier);
	}

	@Override
	public Quartier updateQuartier(Quartier quartier) {
		return quartierRepository.save(quartier);
	}

	@Override
	public void deleteQuartier(Quartier quartier) {
    quartierRepository.delete(quartier);

	}

	@Override
	public Quartier getQuartierById(Long id) {
		return quartierRepository.getOne(id);
	}

	@Override
	public List<Quartier> getAllQuartiers() {
		return quartierRepository.findAll();
	}

}
