package org.nioun.essentials.caposervice.service;

import java.util.List;
import java.util.Optional;

import org.nioun.essentials.caposervice.repos.CapoRepository;
import org.nioun.essentials.niounsocial.Capo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CapoServiceImpl implements CapoService {

	@Autowired
	CapoRepository capoRepository ;
	
	
	public Capo save(Capo capo) {
		
		return capoRepository.save(capo);
	}

	
	public Capo fetchById(Long capoId) {
	
		Optional<Capo>	capo = capoRepository.findById(capoId);
	
	if (capo.isPresent()){
		return capo.get();
	}
	else {
		return null ;
	}	
	
	
	}

	
	public List<Capo> fetchAllCapos() {
		
		return capoRepository.findAll();
	}

}
