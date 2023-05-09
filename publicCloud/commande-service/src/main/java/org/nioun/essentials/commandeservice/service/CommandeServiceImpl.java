package org.nioun.essentials.commandeservice.service;

import java.util.List;

import org.nioun.essentials.commandeservice.repos.CommandeRepository;
import org.nioun.essentials.niouncommerce.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandeServiceImpl implements CommandeService {

	@Autowired
	CommandeRepository commandeRepository ;
	
	

	public CommandeRepository getCommandeRepository() {
		return commandeRepository;
	}

	public void setCommandeRepository(CommandeRepository commandeRepository) {
		this.commandeRepository = commandeRepository;
	}

	
	public Commande saveCommande(Commande commande) {

		return commandeRepository.save(commande);
	}

	
	public Commande updateCommande(Commande commande) {
		return commandeRepository.save(commande);
	}

	
	public void deleteCommande(Commande commande) {
    commandeRepository.delete(commande);

	}

	
	public Commande getCommandeById(Long id) {
		return commandeRepository.getOne(id);
	}

	
	public List<Commande> getAllCommandes() {
		return commandeRepository.findAll();
	}


}
