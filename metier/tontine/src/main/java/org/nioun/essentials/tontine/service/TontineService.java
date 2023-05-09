package org.nioun.essentials.tontine.service;

import java.util.List;

import org.nioun.essentials.tontine.model.Tontine;

public interface TontineService {

	Tontine saveTontine(Tontine tontine);
	
	Tontine updateTontine(Tontine tontine);
	
	void deleteTontine(Tontine tontine);
	
	Tontine getTontine(Long tontineId);
	
	List<Tontine> getAllTontines();
}
