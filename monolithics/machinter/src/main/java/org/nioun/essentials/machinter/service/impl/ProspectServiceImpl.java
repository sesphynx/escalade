package org.nioun.essentials.machinter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.nioun.essentials.machinter.service.ProspectService;
import org.nioun.essentials.machinter.model.Prospect;
import org.nioun.essentials.machinter.repo.ProspectRepository;

@Service
public class ProspectServiceImpl implements ProspectService {

	 @Autowired
	 ProspectRepository prospectRepository;

	
	
	public Prospect saveProspect(Prospect prospect) {
		
		return prospectRepository.save(prospect);
	}

	
	public Prospect updateProspect(Prospect prospect) {
		
		return prospectRepository.save(prospect);
	}

	
	public void deleteProspect(Prospect prospect) {
		
		prospectRepository.delete(prospect);
	}

	
	public Prospect getProspectById(Long id) {
		
		return prospectRepository.getOne(id);
	}

	
	public List<Prospect> getAllProspects() {
		
		return prospectRepository.findAll();
	}

	/**
	 * @return the prospectRepository
	 */
	public ProspectRepository getProspectRepository() {
		return prospectRepository;
	}

	/**
	 * @param prospectRepository the prospectRepository to set
	 */
	public void setProspectRepository(ProspectRepository prospectRepository) {
		this.prospectRepository = prospectRepository;
	}

	

}
