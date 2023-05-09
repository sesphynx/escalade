package org.nioun.essentials.machinter.service;

import java.util.List;
import org.nioun.essentials.machinter.model.Campagne;


public interface CampagneService {

	Campagne saveCampagne(Campagne campagne);

	Campagne updateCampagne(Campagne campagne);

	void deleteCampagne(Campagne campagne);

	Campagne getCampagneById(Long id);

	List<Campagne> getAllCampagnes();
	
}
