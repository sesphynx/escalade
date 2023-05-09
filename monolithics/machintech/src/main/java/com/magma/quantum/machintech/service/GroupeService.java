package com.magma.quantum.machintech.service;

import java.util.List;

import com.magma.quantum.machintech.entities.Groupe;

public interface GroupeService {
	
	Groupe saveGroupe(Groupe groupe);

	Groupe updateGroupe(Groupe groupe);

	void deleteGroupe(Groupe groupe);

	Groupe getGroupeById(Long id);

	List<Groupe> getAllGroupes();

}
