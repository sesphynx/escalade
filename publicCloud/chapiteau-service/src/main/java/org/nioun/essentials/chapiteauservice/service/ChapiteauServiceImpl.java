package org.nioun.essentials.chapiteauservice.service;

import java.util.List;
import java.util.Optional;

import org.nioun.essentials.chapiteauservice.repos.ChapiteauRepository;
import org.nioun.essentials.niounsocial.Chapiteau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChapiteauServiceImpl implements ChapiteauService {

	@Autowired
	ChapiteauRepository chapiteauRepository ;
	
	
	public Chapiteau save(Chapiteau chapiteau) {
		
		return chapiteauRepository.save(chapiteau);
	}

	
	public Chapiteau fetchById(Long profileId) {
	
		Optional<Chapiteau>	chapiteau = chapiteauRepository.findById(profileId);
	
	if (chapiteau.isPresent()){
		return chapiteau.get();
	}
	else {
		return null ;
	}	
	
	
	}

	
	public List<Chapiteau> fetchAllProfiles() {
		
		return chapiteauRepository.findAll();
	}

}
