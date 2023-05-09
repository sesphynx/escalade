package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Localisation;
import org.quantum.nine.darabana.repos.LocalisationRepository;
import org.quantum.nine.darabana.service.LocalisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LocalisationServiceImpl implements LocalisationService {

	@Autowired
	private LocalisationRepository repository;
	
	public LocalisationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocalisationRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Localisation saveLocalisation(Localisation localisation) {
		
		return repository.save(localisation);
	}

	@Override
	public Localisation updateLocalisation(Localisation localisation) {
		return repository.save(localisation);
	}

	@Override
	public void deleteLocalisation(Localisation localisation) {
		repository.delete(localisation);

	}

	
	@Override
	public List<Localisation> getAllLocalisations() {
		return repository.findAll();
	}

	

	@Override
	public Localisation getLocalisationById(Long id) {
		return  repository.getOne(id);
	}

}
