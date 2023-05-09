package org.nioun.essentials.paiement.service;

import java.util.List;

import org.nioun.essentials.paiement.model.Paiement;
import org.nioun.essentials.paiement.repository.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaiementServiceImpl implements PaiementService {


	@Autowired
	PaiementRepository paiementRepository;
	
	public PaiementRepository getPaiementRepository() {
		return paiementRepository;
	}

	public void setPaiementRepository(PaiementRepository paiementRepository) {
		this.paiementRepository = paiementRepository;
	}

	public Paiement savePaiement(Paiement paiement) {

		return paiementRepository.save(paiement);
	}

	@Override
	public Paiement updatePaiement(Paiement paiement) {
		
		return paiementRepository.save(paiement);
	}

	@Override
	public void deletePaiement(Paiement paiement) {
		paiementRepository.delete(paiement);
		
	}

	@Override
	public Paiement getPaiement(Long id) {
		
		return paiementRepository.getById(id);
	}

	@Override
	public List<Paiement> getAllPaiements() {

		return paiementRepository.findAll();
	}

	
	
}
