package com.magma.quantum.machintech.service;

import java.util.List;

import com.magma.quantum.machintech.entities.Prospect;

public interface ProspectService {
	
	Prospect saveProspect(Prospect prospect);
	Prospect updateProspect(Prospect prospect);
	void deleteProspect(Prospect prospect);
	Prospect getProspectById(Long id);
	List<Prospect> getAllProspects();

}
