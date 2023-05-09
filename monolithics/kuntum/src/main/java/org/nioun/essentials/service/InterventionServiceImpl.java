package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Intervention;
import org.nioun.essentials.repos.InterventionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterventionServiceImpl implements InterventionService {

	@Autowired
	InterventionRepository interventionRepository ;
	
	

	public InterventionRepository getInterventionRepository() {
		return interventionRepository;
	}

	public void setInterventionRepository(InterventionRepository interventionRepository) {
		this.interventionRepository = interventionRepository;
	}

	@Override
	public Intervention saveIntervention(Intervention intervention) {

		return interventionRepository.save(intervention);
	}

	@Override
	public Intervention updateIntervention(Intervention intervention) {
		return interventionRepository.save(intervention);
	}

	@Override
	public void deleteIntervention(Intervention intervention) {
    interventionRepository.delete(intervention);

	}

	@Override
	public Intervention getInterventionById(Long id) {
		return interventionRepository.getOne(id);
	}

	@Override
	public List<Intervention> getAllInterventions() {
		return interventionRepository.findAll();
	}



}
