package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Livreur;
import org.nioun.essentials.repos.LivreurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivreurServiceImpl implements LivreurService {

	@Autowired
	LivreurRepository livreurRepo;

	@Override
	public Livreur saveLivreur(Livreur livreur) {

		return livreurRepo.save(livreur);
	}

	@Override
	public Livreur updateLivreur(Livreur livreur) {

		return livreurRepo.saveAndFlush(livreur);
	}

	@Override
	public void deleteLivreur(Livreur livreur) {
		livreurRepo.delete(livreur);

	}

	@Override
	public Livreur getLivreurById(Long id) {

		return livreurRepo.getOne(id);
	}

	@Override
	public List<Livreur> getAllLivreurs() {

		return livreurRepo.findAll();
	}

}
