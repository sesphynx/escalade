package com.magma.quantum.politicone.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.politicone.entities.Ligue;
import com.magma.quantum.politicone.repos.LigueRepository;

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
