package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.CommuneArrond;

public interface CommuneArrondService {

	CommuneArrond saveCommuneArrond(CommuneArrond communeArrond);

	CommuneArrond updateCommuneArrond(CommuneArrond communeArrond);

	void deleteCommuneArrond(CommuneArrond communeArrond);

	CommuneArrond getCommuneArrondById(Long id);

	List<CommuneArrond> getAllCommuneArronds();
	
}
