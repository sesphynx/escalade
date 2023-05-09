package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Commune;

public interface CommuneService {

	Commune saveCommune(Commune commune);

	Commune updateCommune(Commune commune);

	void deleteCommune(Commune commune);

	Commune getCommuneById(Long id);

	List<Commune> getAllCommunes();

}
