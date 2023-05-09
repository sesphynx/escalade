package org.nioun.essentials.machinter.service;

import java.util.List;
import org.nioun.essentials.machinter.model.Offre;

public interface OffreService {
	
	Offre saveOffre(Offre offre);

	Offre updateOffre(Offre offre);

	void deleteOffre(Offre offre);

	Offre getOffreById(Long id);

	List<Offre> getAllOffres();

}
