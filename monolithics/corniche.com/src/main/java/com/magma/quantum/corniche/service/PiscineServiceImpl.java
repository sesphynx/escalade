package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.Piscine;
import com.magma.quantum.corniche.repos.PiscineRepository;

@Service
public class PiscineServiceImpl implements PiscineService {

	@Autowired
	PiscineRepository piscineRepository;
	
	
	public PiscineRepository getPiscineRepository() {
		return piscineRepository;
	}

	public void setPiscineRepository(PiscineRepository piscineRepository) {
		this.piscineRepository = piscineRepository;
	}

	public Piscine savePiscine(Piscine piscine) {
	
		return piscineRepository.save(piscine);
	}

	
	public Piscine updatePiscine(Piscine piscine) {
	
		return piscineRepository.save(piscine);
	}

	
	public void deletePiscine(Piscine piscine) {
	piscineRepository.delete(piscine);

	}

	
	public Piscine getPiscine(Long id) {
	
		return piscineRepository.getOne(id);
	}

	
	public List<Piscine> getAllPiscines() {
	
		return piscineRepository.findAll();
	}

}
