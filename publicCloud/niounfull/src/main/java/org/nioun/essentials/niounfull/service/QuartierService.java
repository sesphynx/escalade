package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Quartier;

public interface QuartierService {

	Quartier saveQuartier(Quartier quartier);

	Quartier updateQuartier(Quartier quartier);

	void deleteQuartier(Quartier quartier);

	Quartier getQuartierById(Long id);

	List<Quartier> getAllQuartiers();
}
