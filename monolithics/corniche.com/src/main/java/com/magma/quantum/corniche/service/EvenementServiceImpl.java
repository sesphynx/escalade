package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.Evenement;
import com.magma.quantum.corniche.repos.EvenementRepository;

@Service
public class EvenementServiceImpl implements EvenementService {

	@Autowired
	EvenementRepository evenementRepository;
	
	
	public EvenementRepository getEvenementRepository() {
		return evenementRepository;
	}

	public void setEvenementRepository(EvenementRepository evenementRepository) {
		this.evenementRepository = evenementRepository;
	}

	public Evenement saveEvenement(Evenement evenement) {
	
		return evenementRepository.save(evenement);
	}

	
	public Evenement updateEvenement(Evenement evenement) {
	
		return evenementRepository.save(evenement);
	}

	
	public void deleteEvenement(Evenement evenement) {
	evenementRepository.delete(evenement);

	}

	
	public Evenement getEvenement(Long id) {

		return evenementRepository.getOne(id);
	}

	
	public List<Evenement> getAllEvenements() {
	
		return evenementRepository.findAll();
	}

}
