package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.Seminaire;
import com.magma.quantum.corniche.repos.SeminaireRepository;

@Service
public class SeminaireServiceImpl implements SeminaireService {

	@Autowired
	SeminaireRepository seminaireRepository ;
	
	
	public Seminaire saveSeminaire(Seminaire seminaire) {

		return seminaireRepository.save(seminaire);
	}

	
	public Seminaire updateSeminaire(Seminaire seminaire) {
		return seminaireRepository.save(seminaire);
	}

	
	public void deleteSeminaire(Seminaire seminaire) {
		seminaireRepository.delete(seminaire);
	}

	
	public Seminaire getSeminaire(Long id) {
	
		return seminaireRepository.getOne(id);
	}

	
	public List<Seminaire> getAllSeminaires() {
	
		return seminaireRepository.findAll();
	}

}
