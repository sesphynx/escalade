package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Commande;

public interface CommandeService {
	

	Commande saveCommande(Commande commande);

	Commande updateCommande(Commande commande);

	void deleteCommande(Commande commande);

	Commande getCommandeById(Long id);

	List<Commande> getAllCommandes();

}
