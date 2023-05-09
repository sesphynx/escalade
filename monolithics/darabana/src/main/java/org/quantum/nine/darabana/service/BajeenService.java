package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Bajeen;

public interface BajeenService {
	
	Bajeen saveBajeen(Bajeen bajeen);

	Bajeen updateBajeen(Bajeen bajeen);

	void deleteBajeen(Bajeen bajeen);

	Bajeen getBajeenById(Long id);

	List<Bajeen> getAllBajeens();

}
