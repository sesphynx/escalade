package com.magma.quantum.machintech.service;

import java.util.List;

import com.magma.quantum.machintech.entities.Retard;

public interface RetardService {
	
	Retard saveRetard(Retard retard);

	Retard updateRetard(Retard retard);

	void deleteRetard(Retard retard);

	Retard getRetardById(Long id);

	List<Retard> getAllRetards();

}
