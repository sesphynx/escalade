package org.nioun.essentials.assurance.service;

import java.util.List;

import org.nioun.essentials.assurance.model.Assurance;

public interface AssuranceService {

	Assurance saveAssurance(Assurance assurance);
	
	Assurance updateAssurance(Assurance assurance);
	
	void deleteAssurance(Assurance assurance);
	
	Assurance getAssurance(Long assuranceId);
	
	List<Assurance> getAllAssurances();
}
