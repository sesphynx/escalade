package org.nioun.essentials.machinter.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.nioun.essentials.machinter.service.RetardService;
import org.nioun.essentials.machinter.model.Retard;
import org.nioun.essentials.machinter.repo.RetardRepository;

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
