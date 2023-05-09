package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Communication;

public interface CommunicationService {
	Communication saveCommunication(Communication communication);

	Communication updateCommunication(Communication communication);

	void deleteCommunication(Communication communication);

	Communication getCommunicationById(Long id);

	List<Communication> getAllCommunications();

}
