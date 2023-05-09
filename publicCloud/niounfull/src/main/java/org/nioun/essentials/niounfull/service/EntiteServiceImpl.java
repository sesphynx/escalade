package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.nioun.essentials.niounfull.model.Entite;
import org.nioun.essentials.niounfull.repositories.EntiteRepository;

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
