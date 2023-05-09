package org.nioun.essentials.cercleservice.service;

import java.util.List;
import java.util.Optional;

import org.nioun.essentials.cercleservice.repos.CercleRepository;
import org.nioun.essentials.niounsocial.Cercle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CercleServiceImpl implements CercleService {

	@Autowired
	CercleRepository cercleRepository ;
	

	public Cercle save(Cercle cercle) {
		
		return cercleRepository.save(cercle);
	}


	public Cercle fetchById(Long cercleId) {
	
		Optional<Cercle>	cercle = cercleRepository.findById(cercleId);
	
	if (cercle.isPresent()){
		return cercle.get();
	}
	else {
		return null ;
	}	
	
	
	}


	public List<Cercle> fetchAllCercles() {
		
		return cercleRepository.findAll();
	}

}
