package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.Spa;
import com.magma.quantum.corniche.repos.SpaRepository;

@Service
public class SpaServiceImpl implements SpaService{

	@Autowired
	SpaRepository spaRepository;
	
	public Spa saveSpa(Spa spa) {
		return spaRepository.save(spa);
	}

	
	public Spa updateSpa(Spa spa) {
		return spaRepository.save(spa);
	}

	
	public void deleteSpa(Spa spa) {
		spaRepository.delete(spa);
		
	}


	public Spa getSpa(Long id) {
		return spaRepository.getOne(id);
	}

	
	public List<Spa> getAllSpas() {
		return spaRepository.findAll();
	}

}
