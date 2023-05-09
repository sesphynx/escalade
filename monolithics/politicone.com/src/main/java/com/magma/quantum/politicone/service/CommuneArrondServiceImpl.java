package com.magma.quantum.politicone.service;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.magma.quantum.politicone.entities.CommuneArrond;
import com.magma.quantum.politicone.repos.CommuneArrondRepository;

@Service
public class CommuneArrondServiceImpl implements CommuneArrondService {

	@Autowired
	CommuneArrondRepository communeArrondRepository ;
	
	

	public CommuneArrondRepository getCommuneArrondRepository() {
		return communeArrondRepository;
	}

	public void setCommuneArrondRepository(CommuneArrondRepository communeArrondRepository) {
		this.communeArrondRepository = communeArrondRepository;
	}

	@Override
	public CommuneArrond saveCommuneArrond(CommuneArrond communeArrond) {

		return communeArrondRepository.save(communeArrond);
	}

	@Override
	public CommuneArrond updateCommuneArrond(CommuneArrond communeArrond) {
		return communeArrondRepository.save(communeArrond);
	}

	@Override
	public void deleteCommuneArrond(CommuneArrond communeArrond) {
    communeArrondRepository.delete(communeArrond);

	}

	@Override
	public CommuneArrond getCommuneArrondById(Long id) {
		return communeArrondRepository.getOne(id);
	}

	@Override
	public List<CommuneArrond> getAllCommuneArronds() {
		return communeArrondRepository.findAll();
	}

}
