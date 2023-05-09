package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Intervention;

public interface InterventionService {

	Intervention saveIntervention(Intervention intervention);

	Intervention updateIntervention(Intervention intervention);

	void deleteIntervention(Intervention intervention);

	Intervention getInterventionById(Long id);

	List<Intervention> getAllInterventions();
	
}
