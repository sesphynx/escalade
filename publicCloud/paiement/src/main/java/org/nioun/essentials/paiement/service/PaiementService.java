package org.nioun.essentials.paiement.service;

import java.util.List;

import org.nioun.essentials.paiement.model.Paiement;

public interface PaiementService {

	Paiement savePaiement(Paiement paiement);
	
	Paiement updatePaiement(Paiement paiement);
	
	void deletePaiement(Paiement paiement);
	
	Paiement getPaiement(Long id);
	
	List<Paiement> getAllPaiements();
	
}
