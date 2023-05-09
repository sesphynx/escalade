package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Region;

public interface RegionService {

	
	Region saveRegion(Region region);

	Region updateRegion(Region region);

	void deleteRegion(Region region);

	Region getRegionById(Long id);

	List<Region> getAllRegions();
	
}
