package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Coordination;

public interface CoordinationService {

	Coordination saveCoordination(Coordination coordination);

	Coordination updateCoordination(Coordination coordination);

	void deleteCoordination(Coordination coordination);

	Coordination getCoordinationById(Long id);

	List<Coordination> getAllCoordinations();
	
}
