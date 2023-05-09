package com.magma.quantum.machintech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.machintech.entities.Vente;
import com.magma.quantum.machintech.repos.VenteRepository;

@Service
public class VenteServiceImpl implements VenteService {
	
	@Autowired
	VenteRepository venteRepository;

	
	
	/**
	 * @return the venteRepository
	 */
	public VenteRepository getVenteRepository() {
		return venteRepository;
	}

	/**
	 * @param venteRepository the venteRepository to set
	 */
	public void setVenteRepository(VenteRepository venteRepository) {
		this.venteRepository = venteRepository;
	}

	
	public Vente saveVente(Vente vente) {
		return venteRepository.save(vente);
	}

	
	public Vente updateVente(Vente vente) {
		return venteRepository.save(vente);
	}

	
	public void deleteVente(Vente vente) {
		venteRepository.delete(vente);
	}

	
	public Vente getVenteById(Long id) {
		return venteRepository.getOne(id);
	}

	
	public List<Vente> getAllVentes() {
		return venteRepository.findAll();
	}

}
