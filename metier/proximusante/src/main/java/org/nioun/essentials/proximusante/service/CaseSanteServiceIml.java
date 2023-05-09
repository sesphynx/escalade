package org.nioun.essentials.proximusante.service;

import java.util.List;

import org.nioun.essentials.proximusante.model.CaseSante;
import org.nioun.essentials.proximusante.repository.CaseSanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CaseSanteServiceIml implements CaseSanteService {

	@Autowired
	CaseSanteRepository caseSanteRepository;
	
	
	
	public CaseSanteRepository getCaseSanteRepository() {
		return caseSanteRepository;
	}

	public void setCaseSanteRepository(CaseSanteRepository caseSanteRepository) {
		this.caseSanteRepository = caseSanteRepository;
	}



	public List<CaseSante> findAll() {

		return caseSanteRepository.findAll();
	}


	public CaseSante findById(int id) throws NotFoundException {

		return caseSanteRepository.findById(id).get();
	}


	public List<CaseSante> findCaseSantesWithinSubCounty(int subcountyId) {

		return caseSanteRepository.findCaseSanteWithinSubCounty(subcountyId);
	}


	public List<CaseSante> findCaseSantesByDistanceFromUser(Double userLongitude, Double userLatitude) {

		return caseSanteRepository.findAllHospitalsByDistanceFromUser(userLongitude, userLatitude);
	}

	
	public void deleteById(int id) {
		
		caseSanteRepository.deleteById(id);

	}




}
