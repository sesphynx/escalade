package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Ligue;

public interface LigueService {

	Ligue saveLigue(Ligue ligue);

	Ligue updateLigue(Ligue ligue);

	void deleteLigue(Ligue ligue);

	Ligue getLigueById(Long id);

	List<Ligue> getAllLigues();
	
}
