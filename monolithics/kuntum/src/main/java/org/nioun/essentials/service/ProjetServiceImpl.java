package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Projet;
import org.nioun.essentials.repos.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjetServiceImpl implements ProjetService{

	@Autowired
	ProjetRepository projetRepository ;
	
	

	public ProjetRepository getProjetRepository() {
		return projetRepository;
	}

	public void setProjetRepository(ProjetRepository projetRepository) {
		this.projetRepository = projetRepository;
	}

	@Override
	public Projet saveProjet(Projet projet) {

		return projetRepository.save(projet);
	}

	@Override
	public Projet updateProjet(Projet projet) {
		return projetRepository.save(projet);
	}

	@Override
	public void deleteProjet(Projet projet) {
    projetRepository.delete(projet);

	}

	@Override
	public Projet getProjetById(Long id) {
		return projetRepository.getOne(id);
	}

	@Override
	public List<Projet> getAllProjets() {
		return projetRepository.findAll();
	}


}
