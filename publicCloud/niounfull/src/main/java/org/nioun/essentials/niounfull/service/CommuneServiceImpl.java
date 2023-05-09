package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.nioun.essentials.niounfull.model.Commune;
import org.nioun.essentials.niounfull.repositories.CommuneRepository;

@Service
public class CommuneServiceImpl implements CommuneService {

	@Autowired
	CommuneRepository communeRepository ;
	
	

	public CommuneRepository getCommuneRepository() {
		return communeRepository;
	}

	public void setCommuneRepository(CommuneRepository communeRepository) {
		this.communeRepository = communeRepository;
	}

	@Override
	public Commune saveCommune(Commune commune) {

		return communeRepository.save(commune);
	}

	@Override
	public Commune updateCommune(Commune commune) {
		return communeRepository.save(commune);
	}

	@Override
	public void deleteCommune(Commune commune) {
    communeRepository.delete(commune);

	}

	@Override
	public Commune getCommuneById(Long id) {
		return communeRepository.getOne(id);
	}

	@Override
	public List<Commune> getAllCommunes() {
		return communeRepository.findAll();
	}

}
