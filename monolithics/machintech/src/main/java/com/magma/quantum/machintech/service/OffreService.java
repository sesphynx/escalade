package com.magma.quantum.machintech.service;

import java.util.List;

import com.magma.quantum.machintech.entities.Offre;

public interface OffreService {
	
	Offre saveOffre(Offre offre);

	Offre updateOffre(Offre offre);

	void deleteOffre(Offre offre);

	Offre getOffreById(Long id);

	List<Offre> getAllOffres();

}
