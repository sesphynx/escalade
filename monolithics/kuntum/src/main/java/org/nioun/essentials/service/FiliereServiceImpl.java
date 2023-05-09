package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Filiere;
import org.nioun.essentials.repos.FiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FiliereServiceImpl implements FiliereService {
	@Autowired
	FiliereRepository filiereRepository ;
	
	

	public FiliereRepository getFiliereRepository() {
		return filiereRepository;
	}

	public void setFiliereRepository(FiliereRepository filiereRepository) {
		this.filiereRepository = filiereRepository;
	}

	@Override
	public Filiere saveFiliere(Filiere filiere) {

		return filiereRepository.save(filiere);
	}

	@Override
	public Filiere updateFiliere(Filiere filiere) {
		return filiereRepository.save(filiere);
	}

	@Override
	public void deleteFiliere(Filiere filiere) {
    filiereRepository.delete(filiere);

	}

	@Override
	public Filiere getFiliereById(Long id) {
		return filiereRepository.getOne(id);
	}

	@Override
	public List<Filiere> getAllFilieres() {
		return filiereRepository.findAll();
	}


}
