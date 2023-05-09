package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Village;

public interface VillageService {

	Village saveVillage(Village village);

	Village updateVillage(Village village);

	void deleteVillage(Village village);

	Village getVillageById(Long id);

	List<Village> getAllVillages();
	
}
