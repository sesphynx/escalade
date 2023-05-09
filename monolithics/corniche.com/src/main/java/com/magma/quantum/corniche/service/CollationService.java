package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.Collation;

public interface CollationService {

	Collation saveCollation(Collation collation);
	Collation updateCollation(Collation collation);
	void deleteCollation(Collation collation);
	Collation getCollation(Long id);
	List<Collation> getAllCollations();
}
