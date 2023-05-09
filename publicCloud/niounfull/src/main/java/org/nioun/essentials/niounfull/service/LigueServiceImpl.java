package org.nioun.essentials.niounfull.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.nioun.essentials.niounfull.model.Ligue;
import org.nioun.essentials.niounfull.repositories.LigueRepository;

@Service
public class LigueServiceImpl implements LigueService {

	@Autowired
	LigueRepository ligueRepository ;
	
	

	public LigueRepository getLigueRepository() {
		return ligueRepository;
	}

	public void setLigueRepository(LigueRepository ligueRepository) {
		this.ligueRepository = ligueRepository;
	}

	@Override
	public Ligue saveLigue(Ligue ligue) {

		return ligueRepository.save(ligue);
	}

	@Override
	public Ligue updateLigue(Ligue ligue) {
		return ligueRepository.save(ligue);
	}

	@Override
	public void deleteLigue(Ligue ligue) {
    ligueRepository.delete(ligue);

	}

	@Override
	public Ligue getLigueById(Long id) {
		return ligueRepository.getOne(id);
	}

	@Override
	public List<Ligue> getAllLigues() {
		return ligueRepository.findAll();
	}

}
