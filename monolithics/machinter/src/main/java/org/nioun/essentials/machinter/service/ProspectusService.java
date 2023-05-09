package org.nioun.essentials.machinter.service;

import java.util.List;

import org.nioun.essentials.machinter.model.Prospectus;

public interface ProspectusService {
	
	Prospectus saveProspectus(Prospectus prospectus);
	Prospectus updateProspectus (Prospectus prospectus);
	void deleteProspectus(Prospectus prospectus) ;
	Prospectus getProspectusById(Long Id);
	List<Prospectus> getAllProspectuss();

}
