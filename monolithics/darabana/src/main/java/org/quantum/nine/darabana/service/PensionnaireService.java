package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Pensionnaire;

public interface PensionnaireService {
	
	public Pensionnaire savePensionnaire ( Pensionnaire pensionnaire);
	
	public Pensionnaire updatePensionnaire(Pensionnaire pensionnaire);
	
	public void deletePensionnaire( Pensionnaire Pensionnaire);

	public Pensionnaire getPensionnaireById(Long id);
	
	public List<Pensionnaire> getAllPensionnaires();
}
