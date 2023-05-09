package org.quantum.nine.magma.pharmog.service;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.CommandeComposante;
import org.quantum.nine.magma.pharmog.repos.CommandeComposanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandeComposanteServiceImpl implements CommandeComposanteService {

	@Autowired
	CommandeComposanteRepository commandeComposanteRepository ;
	
	

	public CommandeComposanteRepository getCommandeComposanteRepository() {
		return commandeComposanteRepository;
	}

	public void setCommandeComposanteRepository(CommandeComposanteRepository commandeComposanteRepository) {
		this.commandeComposanteRepository = commandeComposanteRepository;
	}

	@Override
	public CommandeComposante saveCommandeComposante(CommandeComposante commandeComposante) {

		return commandeComposanteRepository.save(commandeComposante);
	}

	@Override
	public CommandeComposante updateCommandeComposante(CommandeComposante commandeComposante) {
		return commandeComposanteRepository.save(commandeComposante);
	}

	@Override
	public void deleteCommandeComposante(CommandeComposante commandeComposante) {
    commandeComposanteRepository.delete(commandeComposante);

	}

	@Override
	public CommandeComposante getCommandeComposanteById(Long id) {
		return commandeComposanteRepository.getOne(id);
	}

	@Override
	public List<CommandeComposante> getAllCommandeComposantes() {
		return commandeComposanteRepository.findAll();
	}


}
