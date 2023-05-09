package com.magma.quantum.machintech.service;

import java.util.List;

import com.magma.quantum.machintech.entities.Prospectus;

public interface ProspectusService {
	
	Prospectus saveProspectus(Prospectus prospectus);
	Prospectus updateProspectus (Prospectus prospectus);
	void deleteProspectus(Prospectus prospectus) ;
	Prospectus getProspectusById(Long Id);
	List<Prospectus> getAllProspectuss();

}
