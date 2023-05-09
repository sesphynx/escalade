package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.Chambre;
import com.magma.quantum.corniche.repos.ChambreRepository;

@Service
public class ChambreServiceImpl implements ChambreService {

	@Autowired 
	ChambreRepository chambreRepository ;
	
	
	public ChambreRepository getChambreRepository() {
		return chambreRepository;
	}

	public void setChambreRepository(ChambreRepository chambreRepository) {
		this.chambreRepository = chambreRepository;
	}

	
	public Chambre saveChambre(Chambre chambre) {
		return chambreRepository.save(chambre);
	}

	
	public Chambre updateChambre(Chambre chambre) {

		return chambreRepository.save(chambre);
	}

	
	public void deleteChambre(Chambre chambre) {
	chambreRepository.delete(chambre);

	}

	
	public Chambre getChambre(Long id) {
	
		return chambreRepository.getOne(id);
	}

	
	public List<Chambre> getAllChambres() {
		
		return chambreRepository.findAll();
				}

}
