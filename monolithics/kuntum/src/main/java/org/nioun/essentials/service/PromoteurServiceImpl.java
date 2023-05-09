package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Promoteur;
import org.nioun.essentials.repos.PromoteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromoteurServiceImpl implements PromoteurService {

	@Autowired
	PromoteurRepository promoteurRepository ;
	
	

	public PromoteurRepository getPromoteurRepository() {
		return promoteurRepository;
	}

	public void setPromoteurRepository(PromoteurRepository promoteurRepository) {
		this.promoteurRepository = promoteurRepository;
	}

	@Override
	public Promoteur savePromoteur(Promoteur promoteur) {

		return promoteurRepository.save(promoteur);
	}

	@Override
	public Promoteur updatePromoteur(Promoteur promoteur) {
		return promoteurRepository.save(promoteur);
	}

	@Override
	public void deletePromoteur(Promoteur promoteur) {
    promoteurRepository.delete(promoteur);

	}

	@Override
	public Promoteur getPromoteurById(Long id) {
		return promoteurRepository.getOne(id);
	}

	@Override
	public List<Promoteur> getAllPromoteurs() {
		return promoteurRepository.findAll();
	}


}
