package org.quantum.nine.magma.resto.service;

import java.util.List;

import org.quantum.nine.magma.resto.entities.CommandeComposante;

public interface CommandeComposanteService {
	

	CommandeComposante saveCommandeComposante(CommandeComposante commandeComposante);

	CommandeComposante updateCommandeComposante(CommandeComposante commandeComposante);

	void deleteCommandeComposante(CommandeComposante commandeComposante);

	CommandeComposante getCommandeComposanteById(Long id);

	List<CommandeComposante> getAllCommandeComposantes();

}
