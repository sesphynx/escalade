package com.magma.quantum.machintech.service;

import java.util.List;

import com.magma.quantum.machintech.entities.Vente;

public interface VenteService {
	
	Vente saveVente(Vente vente);

	Vente updateVente(Vente vente);

	void deleteVente(Vente vente);

	Vente getVenteById(Long id);

	List<Vente> getAllVentes();

}
