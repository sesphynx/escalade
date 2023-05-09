package com.magma.quantum.machintech.service;

import java.util.List;

import com.magma.quantum.machintech.entities.Rappel;

public interface RappelService {
	
	Rappel saveRappel(Rappel rappel);

	Rappel updateRappel(Rappel rappel);

	void deleteRappel(Rappel rappel);

	Rappel getRappelById(Long id);

	List<Rappel> getAllRappels();

}
