package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Bailleur;
import org.nioun.essentials.repos.BailleurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BailleurServiceImpl implements BailleurService {

	@Autowired
	BailleurRepository bailleurRepository ;
	
	

	public BailleurRepository getBailleurRepository() {
		return bailleurRepository;
	}

	public void setBailleurRepository(BailleurRepository bailleurRepository) {
		this.bailleurRepository = bailleurRepository;
	}

	@Override
	public Bailleur saveBailleur(Bailleur bailleur) {

		return bailleurRepository.save(bailleur);
	}

	@Override
	public Bailleur updateBailleur(Bailleur bailleur) {
		return bailleurRepository.save(bailleur);
	}

	@Override
	public void deleteBailleur(Bailleur bailleur) {
    bailleurRepository.delete(bailleur);

	}

	@Override
	public Bailleur getBailleurById(Long id) {
		return bailleurRepository.getOne(id);
	}

	@Override
	public List<Bailleur> getAllBailleurs() {
		return bailleurRepository.findAll();
	}


}
