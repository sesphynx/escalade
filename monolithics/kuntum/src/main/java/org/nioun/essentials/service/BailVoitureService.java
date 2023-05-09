package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.BailVoiture;

public interface BailVoitureService {

	BailVoiture saveBailVoiture(BailVoiture bailVoiture);

	BailVoiture updateBailVoiture(BailVoiture bailVoiture);

	void deleteBailVoiture(BailVoiture bailVoiture);

	BailVoiture getBailVoitureById(Long id);

	List<BailVoiture> getAllBailVoitures();
}
