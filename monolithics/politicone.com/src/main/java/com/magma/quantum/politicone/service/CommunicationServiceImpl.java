package com.magma.quantum.politicone.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.magma.quantum.politicone.entities.Communication;
import com.magma.quantum.politicone.repos.CommunicationRepository;

@Service
public class CommunicationServiceImpl implements CommunicationService {

	@Autowired
	CommunicationRepository communicationRepository ;
	
	

	public CommunicationRepository getCommunicationRepository() {
		return communicationRepository;
	}

	public void setCommunicationRepository(CommunicationRepository communicationRepository) {
		this.communicationRepository = communicationRepository;
	}

	@Override
	public Communication saveCommunication(Communication communication) {

		return communicationRepository.save(communication);
	}

	@Override
	public Communication updateCommunication(Communication communication) {
		return communicationRepository.save(communication);
	}

	@Override
	public void deleteCommunication(Communication communication) {
    communicationRepository.delete(communication);

	}

	@Override
	public Communication getCommunicationById(Long id) {
		return communicationRepository.getOne(id);
	}

	@Override
	public List<Communication> getAllCommunications() {
		return communicationRepository.findAll();
	}

}
