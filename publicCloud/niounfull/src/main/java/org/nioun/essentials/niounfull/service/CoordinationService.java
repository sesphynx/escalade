package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Coordination;

public interface CoordinationService {

	Coordination saveCoordination(Coordination coordination);

	Coordination updateCoordination(Coordination coordination);

	void deleteCoordination(Coordination coordination);

	Coordination getCoordinationById(Long id);

	List<Coordination> getAllCoordinations();
	
}
