package com.magma.quantum.machintech.service;

import java.util.List;

import com.magma.quantum.machintech.entities.Campagne;


public interface CampagneService {

	Campagne saveCampagne(Campagne campagne);

	Campagne updateCampagne(Campagne campagne);

	void deleteCampagne(Campagne campagne);

	Campagne getCampagneById(Long id);

	List<Campagne> getAllCampagnes();
	
}
