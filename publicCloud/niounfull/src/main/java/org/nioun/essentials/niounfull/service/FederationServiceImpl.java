package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.nioun.essentials.niounfull.model.Federation;
import org.nioun.essentials.niounfull.repositories.FederationRepository;

@Service
public class FederationServiceImpl implements FederationService {

	@Autowired
	FederationRepository federationRepository ;
	
	

	public FederationRepository getFederationRepository() {
		return federationRepository;
	}

	public void setFederationRepository(FederationRepository federationRepository) {
		this.federationRepository = federationRepository;
	}

	@Override
	public Federation saveFederation(Federation federation) {

		return federationRepository.save(federation);
	}

	@Override
	public Federation updateFederation(Federation federation) {
		return federationRepository.save(federation);
	}

	@Override
	public void deleteFederation(Federation federation) {
    federationRepository.delete(federation);

	}

	@Override
	public Federation getFederationById(Long id) {
		return federationRepository.getOne(id);
	}

	@Override
	public List<Federation> getAllFederations() {
		return federationRepository.findAll();
	}


}
