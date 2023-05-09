package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magma.quantum.corniche.entities.SalleReunion;
import com.magma.quantum.corniche.repos.SalleReunionRepository;

public class SalleReunionServiceImpl implements SalleReunionService {

	@Autowired
	SalleReunionRepository salleReunionRepository;
	
	public SalleReunionRepository getSalleReunionRepository() {
		return salleReunionRepository;
	}

	public void setSalleReunionRepository(SalleReunionRepository salleReunionRepository) {
		this.salleReunionRepository = salleReunionRepository;
	}

	
	public SalleReunion saveSalleReunion(SalleReunion salleReunion) {
		return salleReunionRepository.save(salleReunion);
	}

	public SalleReunion updateSalleReunion(SalleReunion salleReunion) {
		return salleReunionRepository.save(salleReunion);
	}

	
	public void deleteSalleReunion(SalleReunion salleReunion) {
		salleReunionRepository.delete(salleReunion);

	}

	
	public SalleReunion getSalleReunion(Long id) {
		return salleReunionRepository.getOne(id);
	}

	public List<SalleReunion> getAllSalleReunions() {
		return salleReunionRepository.findAll();
	}

}
