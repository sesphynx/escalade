package org.quantum.nine.magma.pharmog.service;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.CommandeComposante;

public interface CommandeComposanteService {
	

	CommandeComposante saveCommandeComposante(CommandeComposante commandeComposante);

	CommandeComposante updateCommandeComposante(CommandeComposante commandeComposante);

	void deleteCommandeComposante(CommandeComposante commandeComposante);

	CommandeComposante getCommandeComposanteById(Long id);

	List<CommandeComposante> getAllCommandeComposantes();

}
