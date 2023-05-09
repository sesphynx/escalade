package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Village;

public interface VillageService {

	Village saveVillage(Village village);

	Village updateVillage(Village village);

	void deleteVillage(Village village);

	Village getVillageById(Long id);

	List<Village> getAllVillages();
	
}
