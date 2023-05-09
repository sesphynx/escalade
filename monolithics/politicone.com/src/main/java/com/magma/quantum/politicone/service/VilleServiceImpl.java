package com.magma.quantum.politicone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.politicone.repos.VilleRepository ;

import com.magma.quantum.politicone.entities.Ville;

@Service
public class VilleServiceImpl implements VilleService {

	@Autowired
	VilleRepository villeRepository ;
	
	
	
	public VilleRepository getVilleRepository() {
		return villeRepository;
	}

	public void setVilleRepository(VilleRepository villeRepository) {
		this.villeRepository = villeRepository;
	}

	@Override
	public Ville saveVille(Ville ville) {
		return villeRepository.save(ville);
	}

	@Override
	public Ville updateVille(Ville ville) {
		return villeRepository.save(ville);
	}

	@Override
	public void deleteVille(Ville ville) {
		villeRepository.delete(ville);
	}

	@Override
	public Ville getVilleById(Long id) {
		return villeRepository.getOne(id);
	}

	@Override
	public List<Ville> getAllVilles() {
		return villeRepository.findAll();
	}

}
