package org.nioun.essentials.machinter.service;

import java.util.List;
import org.nioun.essentials.machinter.model.Prospect;

public interface ProspectService {
	
	Prospect saveProspect(Prospect prospect);
	Prospect updateProspect(Prospect prospect);
	void deleteProspect(Prospect prospect);
	Prospect getProspectById(Long id);
	List<Prospect> getAllProspects();

}
