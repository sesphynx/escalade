package org.nioun.essentials.niounfull.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.nioun.essentials.niounfull.model.Region;
import org.nioun.essentials.niounfull.repositories.RegionRepository;

@Service
public class RegionServiceImpl implements RegionService {

	@Autowired
	RegionRepository regionRepository ;
	
	

	public RegionRepository getRegionRepository() {
		return regionRepository;
	}

	public void setRegionRepository(RegionRepository regionRepository) {
		this.regionRepository = regionRepository;
	}

	@Override
	public Region saveRegion(Region region) {

		return regionRepository.save(region);
	}

	@Override
	public Region updateRegion(Region region) {
		return regionRepository.save(region);
	}

	@Override
	public void deleteRegion(Region region) {
    regionRepository.delete(region);

	}

	@Override
	public Region getRegionById(Long id) {
		return regionRepository.getOne(id);
	}

	@Override
	public List<Region> getAllRegions() {
		return regionRepository.findAll();
	}


}
