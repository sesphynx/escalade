package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Federation;

public interface FederationService {

	Federation saveFederation(Federation federation);

	Federation updateFederation(Federation federation);

	void deleteFederation(Federation federation);

	Federation getFederationById(Long id);

	List<Federation> getAllFederations();
}
