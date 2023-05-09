package org.quantum.nine.noun.service;

import java.util.List;

import org.quantum.nine.noun.entities.Activiste;
import org.quantum.nine.noun.repos.ActivisteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActivisteServiceImpl implements ActivisteService {

	@Autowired
	ActivisteRepo activisteRepo;

	@Override
	public Activiste saveActiviste(Activiste activiste) {

		return activisteRepo.save(activiste);
	}

	@Override
	public Activiste updateActiviste(Activiste activiste) {

		return activisteRepo.saveAndFlush(activiste);
	}

	@Override
	public void deleteActiviste(Activiste activiste) {
		activisteRepo.delete(activiste);

	}

	@Override
	public Activiste getActivisteById(Long id) {

		return activisteRepo.getOne(id);
	}

	@Override
	public List<Activiste> getAllActivistes() {

		return activisteRepo.findAll();
	}

}
