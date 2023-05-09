package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Gp;

public interface GpService {

	Gp saveGp(Gp gp);

	Gp updateGp(Gp gp);

	void deleteGp(Gp gp);

	Gp getGpById(Long id);

	List<Gp> getAllGps();

	
}
