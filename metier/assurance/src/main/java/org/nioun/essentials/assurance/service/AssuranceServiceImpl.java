package org.nioun.essentials.assurance.service;

import java.util.List;

import org.nioun.essentials.assurance.model.Assurance;
import org.nioun.essentials.assurance.repository.AssuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssuranceServiceImpl implements AssuranceService {


	@Autowired
	AssuranceRepository assuranceRepository;
	
	
	
	
	public AssuranceRepository getAssuranceRepository() {
		return assuranceRepository;
	}

	public void setAssuranceRepository(AssuranceRepository assuranceRepository) {
		this.assuranceRepository = assuranceRepository;
	}

	@Override
	public Assurance saveAssurance(Assurance assurance) {

		return assuranceRepository.save(assurance);
	}

	
	public Assurance updateAssurance(Assurance assurance) {

		return assuranceRepository.save(assurance);
	}

	@Override
	public void deleteAssurance(Assurance assurance) {
		assuranceRepository.delete(assurance);

	}

	@Override
	public Assurance getAssurance(Long assuranceId) {

		return assuranceRepository.findById(assuranceId).get();
	}

	@Override
	public List<Assurance> getAllAssurances() {

		return assuranceRepository.findAll();
	}

}
