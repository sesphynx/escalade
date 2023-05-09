package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.magma.quantum.corniche.entities.Suite;
import com.magma.quantum.corniche.repos.SuiteRepository;

@Service
public class SuiteServiceImpl implements SuiteService {

	@Autowired
	SuiteRepository suiteRepository; 
	
	
	
	public SuiteRepository getSuiteRepository() {
		return suiteRepository;
	}

	public void setSuiteRepository(SuiteRepository suiteRepository) {
		this.suiteRepository = suiteRepository;
	}

	
	public Suite saveSuite(Suite suite) {
		return suiteRepository.save(suite);
	}

	
	public Suite updateSuite(Suite suite) {
		return suiteRepository.save(suite);
	}

	
	public void deleteSuite(Suite suite) {
	suiteRepository.delete(suite);
	}

	
	public Suite getSuite(Long id) {
			return suiteRepository.getOne(id);
	}

	
	public List<Suite> getAllSuites() {
	
		return suiteRepository.findAll();
	}

}
