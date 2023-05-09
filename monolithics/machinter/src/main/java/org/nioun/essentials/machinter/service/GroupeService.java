package org.nioun.essentials.machinter.service;

import java.util.List;
import org.nioun.essentials.machinter.model.Groupe;

public interface GroupeService {
	
	Groupe saveGroupe(Groupe groupe);

	Groupe updateGroupe(Groupe groupe);

	void deleteGroupe(Groupe groupe);

	Groupe getGroupeById(Long id);

	List<Groupe> getAllGroupes();

}
