package com.magma.quantum.machintech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.machintech.entities.Prospectus;
import com.magma.quantum.machintech.repos.ProspectusRepository;

@Service
public class ProspectusServiceImpl implements ProspectusService {
	
	@Autowired
	ProspectusRepository prospectusRepository;
	
	
	public Prospectus saveProspectus(Prospectus prospectus) {
		
		return prospectusRepository.save(prospectus);
	}

	
	public Prospectus updateProspectus(Prospectus prospectus) {
		return prospectusRepository.save(prospectus);
	}

	
	public void deleteProspectus(Prospectus prospectus) {
		prospectusRepository.delete(prospectus);

	}

	
	
	public List<Prospectus> getAllProspectuss() {
		return prospectusRepository.findAll();
	}

	
	public ProspectusRepository getRepository() {
		return prospectusRepository;
	}

	public void setRepository(ProspectusRepository prospectusRepository) {
		this.prospectusRepository = prospectusRepository;
	}

	
	public Prospectus getProspectusById(Long id) {
		return  prospectusRepository.getOne(id);
	}

}
