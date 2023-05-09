package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.nioun.essentials.niounfull.model.Coordination;
import org.nioun.essentials.niounfull.repositories.CoordinationRepository;

@Service
public class CoordinationServiceImpl implements CoordinationService {

	@Autowired
	CoordinationRepository coordinationRepository ;
	
	

	public CoordinationRepository getCoordinationRepository() {
		return coordinationRepository;
	}

	public void setCoordinationRepository(CoordinationRepository coordinationRepository) {
		this.coordinationRepository = coordinationRepository;
	}

	@Override
	public Coordination saveCoordination(Coordination coordination) {

		return coordinationRepository.save(coordination);
	}

	@Override
	public Coordination updateCoordination(Coordination coordination) {
		return coordinationRepository.save(coordination);
	}

	@Override
	public void deleteCoordination(Coordination coordination) {
    coordinationRepository.delete(coordination);

	}

	@Override
	public Coordination getCoordinationById(Long id) {
		return coordinationRepository.getOne(id);
	}

	@Override
	public List<Coordination> getAllCoordinations() {
		return coordinationRepository.findAll();
	}

}
