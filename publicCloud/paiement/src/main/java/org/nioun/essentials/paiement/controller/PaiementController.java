package org.nioun.essentials.paiement.controller;

import org.nioun.essentials.paiement.ClientProxy;
import org.nioun.essentials.paiement.CommandeProxy;
import org.nioun.essentials.paiement.model.Paiement;
import org.nioun.essentials.paiement.service.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaiementController {
	
	@Autowired
	ClientProxy clientProxy;
	
	@Autowired
	CommandeProxy commandeProxy;
	
	@Autowired
	PaiementService paiementService;
	
	@GetMapping("/paiement/commandeId/{commandeId}/clientId/{clientId}")
	Paiement getPaymentFull(@PathVariable Long commandeId , @PathVariable Long clientId) {
		
		Paiement client = clientProxy.getClientById(clientId);
		 Paiement commande = commandeProxy.getCommandeById(commandeId);
		Paiement paiement = new Paiement();
		
		paiement.setClientId(clientId);
		paiement.setFirstName(client.getFirstName());
		paiement.setLastName(client.getLastName());
		paiement.setEmail(client.getEmail());
		paiement.setAddresse(client.getAddresse());
		paiement.setPhone(client.getPhone());
		paiement.setCommandeId(commandeId);
		paiement.setName(commande.getName());
		paiement.setDescription(commande.getDescription());
		paiement.setQuantite(commande.getQuantite());
		paiement.setPrice(commande.getPrice());
		paiement.setPrixTotal(commande.getPrixTotal());
		
		paiementService.savePaiement(paiement);
		
		return paiement ;
	}

}
