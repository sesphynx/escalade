package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Benevole;
import org.quantum.nine.darabana.repos.BenevoleRepository;
import org.quantum.nine.darabana.service.BenevoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BenevoleServiceImpl implements BenevoleService {
	
	@Autowired
	BenevoleRepository benevoleRepo ;
	
	

	public BenevoleRepository getBenevoleRepo() {
		return benevoleRepo;
	}

	public void setBenevoleRepo(BenevoleRepository benevoleRepo) {
		this.benevoleRepo = benevoleRepo;
	}

	@Override
	public Benevole saveBenevole(Benevole benevole) {
		
		return benevoleRepo.save(benevole);
	}

	@Override
	public Benevole updateBenevole(Benevole benevole) {
		
		return benevoleRepo.save(benevole);
	}

	@Override
	public void deleteBenevole(Benevole benevole) {
		benevoleRepo.delete(benevole);

	}

	@Override
	public Benevole getBenevoleById(Long id) {
		
		return benevoleRepo.getOne(id);
	}

	@Override
	public List<Benevole> getAllBenevoles() {

		return benevoleRepo.findAll();
	}

}
