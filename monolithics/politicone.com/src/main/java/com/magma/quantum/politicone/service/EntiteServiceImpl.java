package com.magma.quantum.politicone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.politicone.entities.Entite;
import com.magma.quantum.politicone.repos.EntiteRepository;

@Service
public class EntiteServiceImpl implements EntiteService {

	@Autowired
	EntiteRepository entiteRepository ;
	
	

	public EntiteRepository getEntiteRepository() {
		return entiteRepository;
	}

	public void setEntiteRepository(EntiteRepository entiteRepository) {
		this.entiteRepository = entiteRepository;
	}

	@Override
	public Entite saveEntite(Entite entite) {

		return entiteRepository.save(entite);
	}

	@Override
	public Entite updateEntite(Entite entite) {
		return entiteRepository.save(entite);
	}

	@Override
	public void deleteEntite(Entite entite) {
    entiteRepository.delete(entite);

	}

	@Override
	public Entite getEntiteById(Long id) {
		return entiteRepository.getOne(id);
	}

	@Override
	public List<Entite> getAllEntites() {
		return entiteRepository.findAll();
	}

}
