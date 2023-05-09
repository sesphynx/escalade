package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.Chambre;

public interface ChambreService {
	
	Chambre saveChambre(Chambre chambre);
	Chambre updateChambre(Chambre chambre);
	void deleteChambre(Chambre chambre);
	Chambre getChambre(Long id );
	List<Chambre> getAllChambres();
	
}
