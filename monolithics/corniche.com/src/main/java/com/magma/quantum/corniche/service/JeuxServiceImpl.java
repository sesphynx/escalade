package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.Jeux;
import com.magma.quantum.corniche.repos.JeuxRepository;

@Service
public class JeuxServiceImpl implements JeuxService {

	@Autowired
	JeuxRepository jeuxRepository;
	
	public Jeux saveJeux(Jeux jeux) {
	
		return jeuxRepository.save(jeux);
	}

	
	public Jeux updateJeux(Jeux jeux) {
	
		return jeuxRepository.save(jeux);
	}

	@Override
	public void deleteJeux(Jeux jeux) {
 jeuxRepository.delete(jeux);

	}


	public Jeux getJeux(Long id) {

		return jeuxRepository.getOne(id);
	}


	public List<Jeux> getAllJeuxs() {

		return jeuxRepository.findAll();
	}

}
