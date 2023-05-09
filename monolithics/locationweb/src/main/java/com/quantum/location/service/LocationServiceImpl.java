package com.quantum.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.quantum.location.entities.Location;
import com.quantum.location.repos.LocationRepository;

public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository repository;
	
	@Override
	public Location saveLocation(Location location) {
		
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);

	}

	
	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public LocationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}

	@Override
	public Location getLocationById(int id) {
		// TODO Auto-generated method stub
		return  repository.getOne(id);
	}

}
