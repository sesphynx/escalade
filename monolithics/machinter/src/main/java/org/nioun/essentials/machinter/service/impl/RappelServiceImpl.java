package org.nioun.essentials.machinter.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.nioun.essentials.machinter.service.RappelService;
import org.nioun.essentials.machinter.model.Rappel;
import org.nioun.essentials.machinter.repo.RappelRepository;

@Service
public class RappelServiceImpl implements RappelService {

	@Autowired
	RappelRepository rappelRepository;
	
	
	
	/**
	 * @return the rappelRepository
	 */
	public RappelRepository getRappelRepository() {
		return rappelRepository;
	}

	/**
	 * @param rappelRepository the rappelRepository to set
	 */
	public void setRappelRepository(RappelRepository rappelRepository) {
		this.rappelRepository = rappelRepository;
	}


	public Rappel saveRappel(Rappel rappel) {
		
		return rappelRepository.save(rappel);
	}


	public Rappel updateRappel(Rappel rappel) {
		return rappelRepository.save(rappel);
	}


	public void deleteRappel(Rappel rappel) {
		rappelRepository.delete(rappel);
		
	}


	public Rappel getRappelById(Long id) {
		
		return rappelRepository.getOne(id);
	}


	public List<Rappel> getAllRappels() {
		
		return rappelRepository.findAll();
	}

}
