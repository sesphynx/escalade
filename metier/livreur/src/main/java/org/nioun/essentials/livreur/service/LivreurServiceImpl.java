package org.nioun.essentials.livreur.service;

import java.util.List;

import org.nioun.essentials.livreur.model.Livreur;
import org.nioun.essentials.livreur.repository.LivreurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivreurServiceImpl implements LivreurService {

	@Autowired
	LivreurRepository livreurRepository;
	
	
	
	public LivreurRepository getLivreurRepository() {
		return livreurRepository;
	}


	public void setLivreurRepository(LivreurRepository livreurRepository) {
		this.livreurRepository = livreurRepository;
	}


	public Livreur saveLivreur(Livreur livreur) {
	
		return livreurRepository.save(livreur);
	}


	public Livreur updateLivreur(Livreur livreur) {

		return livreurRepository.save(livreur);
	}


	public void deleteLivreur(Livreur livreur) {

		livreurRepository.delete(livreur);

	}


	public Livreur getLivreur(Long id) {

		return livreurRepository.getById(id);
	}


	public List<Livreur> getAllLivreurs() {

		return livreurRepository.findAll();
	}

}
