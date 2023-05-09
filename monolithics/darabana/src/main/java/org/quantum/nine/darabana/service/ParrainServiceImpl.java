package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Parrain;
import org.quantum.nine.darabana.repos.ParrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParrainServiceImpl implements ParrainService {

	@Autowired
	ParrainRepository parrainRepository;
	
	
	
	public ParrainRepository getParrainRepository() {
		return parrainRepository;
	}

	public void setParrainRepository(ParrainRepository parrainRepository) {
		this.parrainRepository = parrainRepository;
	}

	@Override
	public Parrain saveParrain(Parrain parrain) {

		return parrainRepository.save(parrain);
	}

	@Override
	public Parrain updateParrain(Parrain parrain) {
	return parrainRepository.save(parrain);
	}

	@Override
	public void deleteParrain(Parrain parrain) {
		parrainRepository.delete(parrain);

	}

	@Override
	public Parrain getParrainById(Long id) {
	return parrainRepository.getOne(id);
	}

	@Override
	public List<Parrain> getAllParrains() {
		return parrainRepository.findAll();
	}

}
