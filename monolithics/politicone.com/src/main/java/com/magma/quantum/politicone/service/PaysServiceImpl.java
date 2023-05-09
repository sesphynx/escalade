package com.magma.quantum.politicone.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.politicone.entities.Pays;
import com.magma.quantum.politicone.repos.PaysRepository;

@Service
public class PaysServiceImpl implements PaysService {

	@Autowired
	PaysRepository paysRepository ;
	
	

	public PaysRepository getPaysRepository() {
		return paysRepository;
	}

	public void setPaysRepository(PaysRepository paysRepository) {
		this.paysRepository = paysRepository;
	}

	@Override
	public Pays savePays(Pays pays) {

		return paysRepository.save(pays);
	}

	@Override
	public Pays updatePays(Pays pays) {
		return paysRepository.save(pays);
	}

	@Override
	public void deletePays(Pays pays) {
    paysRepository.delete(pays);

	}

	@Override
	public Pays getPaysById(Long id) {
		return paysRepository.getOne(id);
	}

	@Override
	public List<Pays> getAllPayss() {
		return paysRepository.findAll();
	}


}
