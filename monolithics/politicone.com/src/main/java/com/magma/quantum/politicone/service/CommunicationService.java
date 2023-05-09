package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Communication;

public interface CommunicationService {
	Communication saveCommunication(Communication communication);

	Communication updateCommunication(Communication communication);

	void deleteCommunication(Communication communication);

	Communication getCommunicationById(Long id);

	List<Communication> getAllCommunications();

}
