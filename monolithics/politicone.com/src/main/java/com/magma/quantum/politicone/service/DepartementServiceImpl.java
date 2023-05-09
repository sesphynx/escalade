package com.magma.quantum.politicone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.politicone.entities.Departement;
import com.magma.quantum.politicone.repos.DepartementRepository;

@Service
public class DepartementServiceImpl implements DepartementService {

	@Autowired
	DepartementRepository departementRepository ;
	
	

	public DepartementRepository getDepartementRepository() {
		return departementRepository;
	}

	public void setDepartementRepository(DepartementRepository departementRepository) {
		this.departementRepository = departementRepository;
	}

	@Override
	public Departement saveDepartement(Departement departement) {

		return departementRepository.save(departement);
	}

	@Override
	public Departement updateDepartement(Departement departement) {
		return departementRepository.save(departement);
	}

	@Override
	public void deleteDepartement(Departement departement) {
    departementRepository.delete(departement);

	}

	@Override
	public Departement getDepartementById(Long id) {
		return departementRepository.getOne(id);
	}

	@Override
	public List<Departement> getAllDepartements() {
		return departementRepository.findAll();
	}

}
