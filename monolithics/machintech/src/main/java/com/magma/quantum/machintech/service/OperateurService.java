package com.magma.quantum.machintech.service;

import java.util.List;

import com.magma.quantum.machintech.entities.Operateur;

public interface OperateurService {

	Operateur saveOperateur(Operateur operateur);
	Operateur updateOperateur (Operateur operateur);
	void deleteOperateur(Operateur operateur) ;
	Operateur getOperateurById(Long Id);
	List<Operateur> getAllOperateurs();
}
