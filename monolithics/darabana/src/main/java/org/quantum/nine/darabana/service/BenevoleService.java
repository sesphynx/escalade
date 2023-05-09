package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Benevole;

public interface BenevoleService {

	Benevole saveBenevole(Benevole benevole);

	Benevole updateBenevole(Benevole benevole);

	void deleteBenevole(Benevole benevole);

	Benevole getBenevoleById(Long id);

	List<Benevole> getAllBenevoles();
	
}
