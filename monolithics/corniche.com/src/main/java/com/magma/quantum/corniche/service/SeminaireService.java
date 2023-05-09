package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.Seminaire;

public interface SeminaireService {

	Seminaire saveSeminaire(Seminaire seminaire);
	Seminaire updateSeminaire(Seminaire seminaire);
	void deleteSeminaire(Seminaire seminaire);
	Seminaire getSeminaire(Long id);
	List<Seminaire> getAllSeminaires();
}
