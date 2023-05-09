package org.nioun.essentials.machinter.service;

import java.util.List;
import org.nioun.essentials.machinter.model.Vente;

public interface VenteService {
	
	Vente saveVente(Vente vente);

	Vente updateVente(Vente vente);

	void deleteVente(Vente vente);

	Vente getVenteById(Long id);

	List<Vente> getAllVentes();

}
