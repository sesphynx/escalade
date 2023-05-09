package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Pays;

public interface PaysService {

	Pays savePays(Pays pays);

	Pays updatePays(Pays pays);

	void deletePays(Pays pays);

	Pays getPaysById(Long id);

	List<Pays> getAllPayss();
	
}
