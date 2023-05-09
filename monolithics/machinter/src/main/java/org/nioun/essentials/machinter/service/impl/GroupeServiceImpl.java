package org.nioun.essentials.machinter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.nioun.essentials.machinter.service.GroupeService;
import org.nioun.essentials.machinter.model.Groupe;
import org.nioun.essentials.machinter.repo.GroupeRepository;

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
