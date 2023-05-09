package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Daara;
import org.quantum.nine.darabana.repos.DaaraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaaraServiceImpl implements DaaraService {

	@Autowired
	DaaraRepository daaraRepo;
	
	
	
	
	public DaaraRepository getDaaraRepo() {
		return daaraRepo;
	}

	public void setDaaraRepo(DaaraRepository daaraRepo) {
		this.daaraRepo = daaraRepo;
	}

	@Override
	public Daara saveDaara(Daara daara) {
		
		return daaraRepo.save(daara);
	}

	@Override
	public Daara updateDaara(Daara daara) {
	
		return daaraRepo.save(daara);
	}

	@Override
	public void deleteDaara(Daara daara) {
		daaraRepo.delete(daara);

	}

	@Override
	public Daara getDaaraById(Long id) {
		return daaraRepo.getOne(id);
	}

	@Override
	public List<Daara> getAllDaaras() {
		
		return daaraRepo.findAll();
	}

}
