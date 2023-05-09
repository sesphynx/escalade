package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Departement;

public interface DepartementService {

	Departement saveDepartement(Departement departement);

	Departement updateDepartement(Departement departement);

	void deleteDepartement(Departement departement);

	Departement getDepartementById(Long id);

	List<Departement> getAllDepartements();
	
}
