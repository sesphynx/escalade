package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Departement;

public interface DepartementService {

	Departement saveDepartement(Departement departement);

	Departement updateDepartement(Departement departement);

	void deleteDepartement(Departement departement);

	Departement getDepartementById(Long id);

	List<Departement> getAllDepartements();
	
}
