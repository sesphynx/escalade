package org.nioun.essentials.machinter.service;

import java.util.List;

import org.nioun.essentials.machinter.model.Rappel;

public interface RappelService {
	
	Rappel saveRappel(Rappel rappel);

	Rappel updateRappel(Rappel rappel);

	void deleteRappel(Rappel rappel);

	Rappel getRappelById(Long id);

	List<Rappel> getAllRappels();

}
