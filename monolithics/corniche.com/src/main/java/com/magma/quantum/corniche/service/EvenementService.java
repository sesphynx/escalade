package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.Evenement;

public interface EvenementService {

	Evenement saveEvenement(Evenement evenement);
	Evenement updateEvenement(Evenement evenement);
	void deleteEvenement (Evenement evenement);
	Evenement getEvenement(Long id);
	List<Evenement> getAllEvenements();
}
