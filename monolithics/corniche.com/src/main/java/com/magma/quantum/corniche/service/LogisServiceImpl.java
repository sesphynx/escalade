package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.Logis;
import com.magma.quantum.corniche.repos.LogisRepository;

@Service
public class LogisServiceImpl implements LogisService {

	@Autowired
	LogisRepository logisRepository ;
	
	public LogisRepository getLogisRepository() {
		return logisRepository;
	}

	public void setLogisRepository(LogisRepository logisRepository) {
		this.logisRepository = logisRepository;
	}

	public Logis saveLogis(Logis logis) {
	
		return logisRepository.save(logis);
	}

	
	public Logis updateLogis(Logis logis) {
	
		return logisRepository.save(logis);
	}

	
	public void deleteLogis(Logis logis) {
	logisRepository.delete(logis);

	}

	
	public Logis getLogis(Long id) {
	
		return logisRepository.getOne(id);
	}

	
	public List<Logis> getAllLogiss() {
	
		return logisRepository.findAll();
	}

}
