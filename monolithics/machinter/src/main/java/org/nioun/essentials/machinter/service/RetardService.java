package org.nioun.essentials.machinter.service;

import java.util.List;
import org.nioun.essentials.machinter.model.Retard;

public interface RetardService {
	
	Retard saveRetard(Retard retard);

	Retard updateRetard(Retard retard);

	void deleteRetard(Retard retard);

	Retard getRetardById(Long id);

	List<Retard> getAllRetards();

}
