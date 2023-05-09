package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Ligue;

public interface LigueService {

	Ligue saveLigue(Ligue ligue);

	Ligue updateLigue(Ligue ligue);

	void deleteLigue(Ligue ligue);

	Ligue getLigueById(Long id);

	List<Ligue> getAllLigues();
	
}
