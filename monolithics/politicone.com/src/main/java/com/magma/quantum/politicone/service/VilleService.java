package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Ville;

public interface VilleService {
	
	Ville saveVille(Ville ville);

	Ville updateVille(Ville ville);

	void deleteVille(Ville ville);

	Ville getVilleById(Long id);

	List<Ville> getAllVilles();
}
