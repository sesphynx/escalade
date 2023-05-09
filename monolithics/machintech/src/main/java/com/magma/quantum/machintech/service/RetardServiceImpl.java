package com.magma.quantum.machintech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.machintech.entities.Retard;
import com.magma.quantum.machintech.repos.RetardRepository;

@Service
public class RetardServiceImpl implements RetardService{

	@Autowired
	RetardRepository retardRepository;
	
	
	
	/**
	 * @return the retardRepository
	 */
	public RetardRepository getRetardRepository() {
		return retardRepository;
	}

	/**
	 * @param retardRepository the retardRepository to set
	 */
	public void setRetardRepository(RetardRepository retardRepository) {
		this.retardRepository = retardRepository;
	}

	
	public Retard saveRetard(Retard retard) {
		return retardRepository.save(retard);
	}

	
	public Retard updateRetard(Retard retard) {
		return retardRepository.save(retard);
	}

	
	public void deleteRetard(Retard retard) {
		retardRepository.delete(retard);
		
	}

	
	public Retard getRetardById(Long id) {
		
		return retardRepository.getOne(id);
	}

	
	public List<Retard> getAllRetards() {
		return retardRepository.findAll();
	}

	
}
