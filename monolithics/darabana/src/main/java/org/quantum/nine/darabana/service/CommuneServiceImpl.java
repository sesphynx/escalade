package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Commune;
import org.quantum.nine.darabana.repos.CommuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommuneServiceImpl implements CommuneService {

	@Autowired
	CommuneRepository communeRepo ;
	
	

	public CommuneRepository getCommuneRepo() {
		return communeRepo;
	}

	public void setCommuneRepo(CommuneRepository communeRepo) {
		this.communeRepo = communeRepo;
	}

	@Override
	public Commune saveCommune(Commune commune) {
		
		return communeRepo.save(commune);
	}

	@Override
	public Commune updateCommune(Commune commune) {
		
		return communeRepo.save(commune);
	}

	@Override
	public void deleteCommune(Commune commune) {
		communeRepo.delete(commune);

	}

	@Override
	public Commune getCommuneById(Long id) {
		
		return communeRepo.getOne(id);
	}

	@Override
	public List<Commune> getAllCommunes() {

		return communeRepo.findAll();
	}

	@Override
	public Commune getByNom(String nom) {
		return communeRepo.findByNom(nom);
	}


}
