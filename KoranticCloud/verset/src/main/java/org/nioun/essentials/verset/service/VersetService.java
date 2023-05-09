package org.nioun.essentials.verset.service;

import java.util.List;

import org.nioun.essentials.verset.model.Verset;

public interface VersetService {

	Verset saveVerset(Verset verset);
	
	Verset updateVerset (Verset verset);
	
	void deleteVerset (Verset verset);
	
	Verset getVerset(Long versetId);
	
	List<Verset> getAllVersets();
	
}
