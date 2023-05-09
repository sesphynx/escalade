package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Ville;

public interface VilleService {
	
	Ville saveVille(Ville ville);

	Ville updateVille(Ville ville);

	void deleteVille(Ville ville);

	Ville getVilleById(Long id);

	List<Ville> getAllVilles();
}
