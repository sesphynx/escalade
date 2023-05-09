package org.nioun.essentials.verset.service;

import java.util.List;

import org.nioun.essentials.verset.model.Verset;
import org.nioun.essentials.verset.repository.VersetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VersetServiceImpl implements VersetService {

	@Autowired
	VersetRepository versetRepository;

	
	public VersetRepository getVersetRepository() {
		return versetRepository;
	}

	public void setVersetRepository(VersetRepository versetRepository) {
		this.versetRepository = versetRepository;
	}

	public Verset saveVerset(Verset verset) {

		return versetRepository.save(verset);
	}


	public Verset updateVerset(Verset verset) {

		return versetRepository.save(verset);
	}


	public void deleteVerset(Verset verset) {
		versetRepository.delete(verset);
		
	}


	public Verset getVerset(Long versetId) {

		return versetRepository.getById(versetId);
	}

	@Override
	public List<Verset> getAllVersets() {

		return versetRepository.findAll();
	}

}
