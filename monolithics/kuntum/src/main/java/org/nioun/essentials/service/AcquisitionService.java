package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Acquisition;

public interface AcquisitionService {

	Acquisition saveAcquisition(Acquisition acquisition);

	Acquisition updateAcquisition(Acquisition acquisition);

	void deleteAcquisition(Acquisition acquisition);

	Acquisition getAcquisitionById(Long id);

	List<Acquisition> getAllAcquisitions();
	
}
