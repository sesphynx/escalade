package org.nioun.essentials.naneurone.service;

import java.util.List;

import org.nioun.essentials.naneurone.model.Naneurone;
import org.nioun.essentials.naneurone.repository.NaneuroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaneuroneServiceImpl implements NaneuroneService {

	@Autowired
	NaneuroneRepository naneuroneRepository; 
	
	
	
	public NaneuroneRepository getNaneuroneRepository() {
		return naneuroneRepository;
	}


	public void setNaneuroneRepository(NaneuroneRepository naneuroneRepository) {
		this.naneuroneRepository = naneuroneRepository;
	}


	
	public Naneurone saveNaneurone(Naneurone naneurone) {
		return naneuroneRepository.save(naneurone);
		
	}

	
	
	
	public Naneurone updateNaneurone(Naneurone naneurone) {
		
		return naneuroneRepository.save(naneurone);
	}


	public void deleteNaneurone(Naneurone naneurone) {
		naneuroneRepository.delete(naneurone);

	}


	public Naneurone getNaneurone(Long naneuroneId) {

		return naneuroneRepository.getById(naneuroneId);
	}


	public List<Naneurone> getAllNaneurones() {
		
		return naneuroneRepository.findAll();
	}


}
