package org.nioun.essentials.cercleservice.service;

import java.util.List;

import org.nioun.essentials.niounsocial.Cercle;



public interface CercleService {

	Cercle save(Cercle cercle);
	Cercle   fetchById(Long cercleId);
	List<Cercle> fetchAllCercles();
}
