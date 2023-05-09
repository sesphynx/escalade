package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.Logis;

public interface LogisService {
	Logis saveLogis(Logis logis);
	Logis updateLogis(Logis logis);
	void deleteLogis(Logis logis);
	Logis getLogis(Long id);
	List<Logis> getAllLogiss();
	
}
