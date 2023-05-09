package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Quartier;

public interface QuartierService {

	Quartier saveQuartier(Quartier quartier);

	Quartier updateQuartier(Quartier quartier);

	void deleteQuartier(Quartier quartier);

	Quartier getQuartierById(Long id);

	List<Quartier> getAllQuartiers();
}
