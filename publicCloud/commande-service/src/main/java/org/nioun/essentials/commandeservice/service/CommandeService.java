package org.nioun.essentials.commandeservice.service;

import java.util.List;

import org.nioun.essentials.niouncommerce.*;

public interface CommandeService {


	Commande saveCommande(Commande commande);

	Commande updateCommande(Commande commande);

	void deleteCommande(Commande commande);

	Commande getCommandeById(Long id);

	List<Commande> getAllCommandes();
}
