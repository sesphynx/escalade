package org.nioun.essentials.causeservice.service;

import java.util.List;
import java.util.Optional;

import org.nioun.essentials.causeservice.repos.CauseRepository;
import org.nioun.essentials.niounsocial.Cause;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CauseServiceImpl implements CauseService {

	@Autowired
	CauseRepository causeRepository ;
	
	
	public Cause save(Cause cause) {
		
		return causeRepository.save(cause);
	}

	
	public Cause fetchById(Long causeId) {
	
		Optional<Cause>	cause = causeRepository.findById(causeId);
	
	if (cause.isPresent()){
		return cause.get();
	}
	else {
		return null ;
	}	
	
	
	}

	
	public List<Cause> fetchAllCauses() {
		
		return causeRepository.findAll();
	}

}
