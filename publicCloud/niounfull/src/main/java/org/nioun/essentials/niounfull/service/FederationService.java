package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Federation;

public interface FederationService {

	Federation saveFederation(Federation federation);

	Federation updateFederation(Federation federation);

	void deleteFederation(Federation federation);

	Federation getFederationById(Long id);

	List<Federation> getAllFederations();
}
