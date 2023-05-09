package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Faiseur;
import org.nioun.essentials.repos.FaiseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaiseurServiceImpl implements FaiseurService {
	@Autowired
	FaiseurRepository faiseurRepository ;
	
	

	public FaiseurRepository getFaiseurRepository() {
		return faiseurRepository;
	}

	public void setFaiseurRepository(FaiseurRepository faiseurRepository) {
		this.faiseurRepository = faiseurRepository;
	}

	@Override
	public Faiseur saveFaiseur(Faiseur faiseur) {

		return faiseurRepository.save(faiseur);
	}

	@Override
	public Faiseur updateFaiseur(Faiseur faiseur) {
		return faiseurRepository.save(faiseur);
	}

	@Override
	public void deleteFaiseur(Faiseur faiseur) {
    faiseurRepository.delete(faiseur);

	}

	@Override
	public Faiseur getFaiseurById(Long id) {
		return faiseurRepository.getOne(id);
	}

	@Override
	public List<Faiseur> getAllFaiseurs() {
		return faiseurRepository.findAll();
	}

}
