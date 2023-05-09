package org.quantum.nine.magma.pharmog.service;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Commande;

public interface CommandeService {
	

	Commande saveCommande(Commande commande);

	Commande updateCommande(Commande commande);

	void deleteCommande(Commande commande);

	Commande getCommandeById(Long id);

	List<Commande> getAllCommandes();

}
