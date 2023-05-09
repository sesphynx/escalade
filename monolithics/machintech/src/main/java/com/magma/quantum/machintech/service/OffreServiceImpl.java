package com.magma.quantum.machintech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.machintech.entities.Offre;
import com.magma.quantum.machintech.repos.OffreRepository;

@Service
public class OffreServiceImpl  implements OffreService{
	
	@Autowired
	OffreRepository offreRepository;
	


	

	
	public Offre saveOffre(Offre offre) {
		
		return offreRepository.save(offre);
	}

	
	public Offre updateOffre(Offre offre) {
		
		return offreRepository.save(offre);
	}

	
	public void deleteOffre(Offre offre) {
		offreRepository.delete(offre);
		
	}

	
	public Offre getOffreById(Long id) {
		
		return offreRepository.getOne(id);
	}

	
	public List<Offre> getAllOffres() {
		
		return offreRepository.findAll();
	}
	/**
	 * @return the offreRepository
	 */
	public OffreRepository getOffreRepository() {
		return offreRepository;
	}

	/**
	 * @param offreRepository the offreRepository to set
	 */
	public void setOffreRepository(OffreRepository offreRepository) {
		this.offreRepository = offreRepository;
	}

}
