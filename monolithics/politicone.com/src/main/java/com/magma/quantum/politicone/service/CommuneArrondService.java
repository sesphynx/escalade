package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.CommuneArrond;

public interface CommuneArrondService {

	CommuneArrond saveCommuneArrond(CommuneArrond communeArrond);

	CommuneArrond updateCommuneArrond(CommuneArrond communeArrond);

	void deleteCommuneArrond(CommuneArrond communeArrond);

	CommuneArrond getCommuneArrondById(Long id);

	List<CommuneArrond> getAllCommuneArronds();
	
}
