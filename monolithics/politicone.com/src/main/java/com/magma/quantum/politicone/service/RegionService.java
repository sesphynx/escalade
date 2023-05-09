package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Region;

public interface RegionService {

	
	Region saveRegion(Region region);

	Region updateRegion(Region region);

	void deleteRegion(Region region);

	Region getRegionById(Long id);

	List<Region> getAllRegions();
	
}
