package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Dividende;

public interface DividendeService {

	Dividende saveDividende(Dividende dividende);

	Dividende updateDividende(Dividende dividende);

	void deleteDividende(Dividende dividende);

	Dividende getDividendeById(Long id);

	List<Dividende> getAllDividendes();
	
}
