package org.nioun.essentials.machinter.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.nioun.essentials.machinter.service.ProspectusService;
import org.nioun.essentials.machinter.model.Prospectus;
import org.nioun.essentials.machinter.repo.ProspectusRepository;

@Service
public class ProspectusServiceImpl implements ProspectusService {
	
	@Autowired
	ProspectusRepository prospectusRepository;
	
	
	public Prospectus saveProspectus(Prospectus prospectus) {
		
		return prospectusRepository.save(prospectus);
	}

	
	public Prospectus updateProspectus(Prospectus prospectus) {
		return prospectusRepository.save(prospectus);
	}

	
	public void deleteProspectus(Prospectus prospectus) {
		prospectusRepository.delete(prospectus);

	}

	
	
	public List<Prospectus> getAllProspectuss() {
		return prospectusRepository.findAll();
	}

	
	public ProspectusRepository getRepository() {
		return prospectusRepository;
	}

	public void setRepository(ProspectusRepository prospectusRepository) {
		this.prospectusRepository = prospectusRepository;
	}

	
	public Prospectus getProspectusById(Long id) {
		return  prospectusRepository.getOne(id);
	}

}
