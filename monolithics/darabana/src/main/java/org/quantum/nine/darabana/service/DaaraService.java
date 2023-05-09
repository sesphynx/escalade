package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Daara;

public interface DaaraService {

	Daara saveDaara(Daara daara);

	Daara updateDaara(Daara daara);

	void deleteDaara(Daara daara);

	Daara getDaaraById(Long id);

	List<Daara> getAllDaaras();

}
