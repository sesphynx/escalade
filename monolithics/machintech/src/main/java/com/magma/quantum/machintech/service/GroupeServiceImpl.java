package com.magma.quantum.machintech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.machintech.entities.Groupe;
import com.magma.quantum.machintech.repos.GroupeRepository;

@Service
public class GroupeServiceImpl implements GroupeService{

	@Autowired
	GroupeRepository groupeRepository ;
		
	
	/**
	 * @return the groupeRepository
	 */
	public GroupeRepository getGroupeRepository() {
		return groupeRepository;
	}

	/**
	 * @param groupeRepository the groupeRepository to set
	 */
	public void setGroupeRepository(GroupeRepository groupeRepository) {
		this.groupeRepository = groupeRepository;
	}


	public Groupe saveGroupe(Groupe groupe) {
		
		return groupeRepository.save(groupe);
	}


	public Groupe updateGroupe(Groupe groupe) {
		return groupeRepository.save(groupe);
	}


	public void deleteGroupe(Groupe groupe) {
		groupeRepository.delete(groupe);
		
	}


	public Groupe getGroupeById(Long id) {
		return groupeRepository.getOne(id);
	}


	public List<Groupe> getAllGroupes() {
		return groupeRepository.findAll();
	}

}
