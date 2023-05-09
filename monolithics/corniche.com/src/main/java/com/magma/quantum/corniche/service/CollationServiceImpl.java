package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.Collation;
import com.magma.quantum.corniche.repos.CollationRepository;

@Service
public class CollationServiceImpl implements CollationService {

	@Autowired
	CollationRepository collationRepository;
	
	
	
	public CollationRepository getCollationRepository() {
		return collationRepository;
	}

	public void setCollationRepository(CollationRepository collationRepository) {
		this.collationRepository = collationRepository;
	}

	
	public Collation saveCollation(Collation collation) {
	
		return collationRepository.save(collation);
	}

	
	public Collation updateCollation(Collation collation) {
	
		return collationRepository.save(collation);
	}

	
	public void deleteCollation(Collation collation) {
	collationRepository.delete(collation);

	}

	
	public Collation getCollation(Long id) {
	
		return collationRepository.findOne(id);
	}

	
	public List<Collation> getAllCollations() {
	
		return collationRepository.findAll();
	}

}
