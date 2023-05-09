package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.nioun.essentials.niounfull.model.Village;
import org.nioun.essentials.niounfull.repositories.VillageRepository;

@Service
public class VillageServiceImpl implements VillageService {
	
	@Autowired
	VillageRepository villageRepository ;
	
	

	public VillageRepository getVillageRepository() {
		return villageRepository;
	}

	public void setVillageRepository(VillageRepository villageRepository) {
		this.villageRepository = villageRepository;
	}

	@Override
	public Village saveVillage(Village village) {

		return villageRepository.save(village);
	}

	@Override
	public Village updateVillage(Village village) {
		return villageRepository.save(village);
	}

	@Override
	public void deleteVillage(Village village) {
    villageRepository.delete(village);

	}

	@Override
	public Village getVillageById(Long id) {
		return villageRepository.getOne(id);
	}

	@Override
	public List<Village> getAllVillages() {
		return villageRepository.findAll();
	}

}
