package org.nioun.essentials.livreurservice.service;

import java.util.List;

import org.nioun.essentials.livreurservice.repos.LivreurRepository;
import org.nioun.essentials.niounlivraison.Livreur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivreurServiceImpl implements LivreurService {

	@Autowired
	LivreurRepository livreurRepository ;
	
	

	public LivreurRepository getLivreurRepository() {
		return livreurRepository;
	}

	public void setLivreurRepository(LivreurRepository livreurRepository) {
		this.livreurRepository = livreurRepository;
	}

	@Override
	public Livreur saveLivreur(Livreur livreur) {

		return livreurRepository.save(livreur);
	}

	@Override
	public Livreur updateLivreur(Livreur livreur) {
		return livreurRepository.save(livreur);
	}

	@Override
	public void deleteLivreur(Livreur livreur) {
    livreurRepository.delete(livreur);

	}

	@Override
	public Livreur getLivreurById(Long id) {
		return livreurRepository.getOne(id);
	}

	@Override
	public List<Livreur> getAllLivreurs() {
		return livreurRepository.findAll();
	}


}
