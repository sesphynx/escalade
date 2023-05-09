package org.nioun.essentials.caposervice.service;

import java.util.List;

import org.nioun.essentials.niounsocial.Capo;



public interface CapoService {

	Capo save(Capo capo);
	Capo   fetchById(Long capoId);
	List<Capo> fetchAllCapos();
}
