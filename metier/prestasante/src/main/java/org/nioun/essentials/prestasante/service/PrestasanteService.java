package org.nioun.essentials.prestasante.service;

import java.util.List;

import org.nioun.essentials.prestasante.model.Prestasante;

public interface PrestasanteService {

	Prestasante savePrestasante(Prestasante prestasante);
	
	Prestasante updatePrestasante(Prestasante prestasante);
	
	void deletePrestasante(Prestasante prestasante);
	
	Prestasante getPrestasante(Long prestasanteId);
	
	List<Prestasante> getAllPrestasantes();
}
