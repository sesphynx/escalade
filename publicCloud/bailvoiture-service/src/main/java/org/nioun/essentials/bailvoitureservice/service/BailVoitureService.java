package org.nioun.essentials.bailvoitureservice.service;

import java.util.List;

import org.nioun.essentials.niountransport.*;

public interface BailVoitureService {


	BailVoiture saveBailVoiture(BailVoiture bailvoiture);

	BailVoiture updateBailVoiture(BailVoiture bailvoiture);

	void deleteBailVoiture(BailVoiture bailvoiture);

	BailVoiture getBailVoitureById(Long id);

	List<BailVoiture> getAllBailVoitures();
}
