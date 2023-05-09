package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Bailleur;

public interface BailleurService {

	Bailleur saveBailleur(Bailleur bailleur);

	Bailleur updateBailleur(Bailleur bailleur);

	void deleteBailleur(Bailleur bailleur);

	Bailleur getBailleurById(Long id);

	List<Bailleur> getAllBailleurs();
}
