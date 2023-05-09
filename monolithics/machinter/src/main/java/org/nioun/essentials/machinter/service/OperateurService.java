package org.nioun.essentials.machinter.service;

import java.util.List;

import org.nioun.essentials.machinter.model.Operateur;

public interface OperateurService {

	Operateur saveOperateur(Operateur operateur);
	Operateur updateOperateur (Operateur operateur);
	void deleteOperateur(Operateur operateur) ;
	Operateur getOperateurById(Long Id);
	List<Operateur> getAllOperateurs();
}
