package org.quantum.nine.magma.pharmog.service;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Commande;
import org.quantum.nine.magma.pharmog.repos.CommandeRepository;
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

	@Override
	public Commande saveCommande(Commande commande) {

		return commandeRepository.save(commande);
	}

	@Override
	public Commande updateCommande(Commande commande) {
		return commandeRepository.save(commande);
	}

	@Override
	public void deleteCommande(Commande commande) {
    commandeRepository.delete(commande);

	}

	@Override
	public Commande getCommandeById(Long id) {
		return commandeRepository.getOne(id);
	}

	@Override
	public List<Commande> getAllCommandes() {
		return commandeRepository.findAll();
	}



}
