package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.Suite;

public interface SuiteService {
	Suite saveSuite(Suite suite);
	Suite updateSuite(Suite suite);
	void deleteSuite(Suite suite);
	Suite getSuite(Long id);
	List<Suite> getAllSuites();
	
}
