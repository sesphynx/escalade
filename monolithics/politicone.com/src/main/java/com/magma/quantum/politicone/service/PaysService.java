package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Pays;

public interface PaysService {

	Pays savePays(Pays pays);

	Pays updatePays(Pays pays);

	void deletePays(Pays pays);

	Pays getPaysById(Long id);

	List<Pays> getAllPayss();
	
}
