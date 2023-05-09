package org.nioun.essentials.livreur.controller;

import org.nioun.essentials.livreur.model.Livreur;
import org.nioun.essentials.livreur.repository.LivreurRepository;
import org.nioun.essentials.livreur.service.LivreurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivreurController {

	@Autowired
	LivreurRepository livreurRepository ;
	
	@Autowired
	LivreurService livreurService;

@GetMapping("/livreur/firstName/{firstName}/lastName/{lastName}")
public  Livreur	getLivreur(@PathVariable String firstName , @PathVariable String lastName){
	 
	Livreur livreur = livreurRepository.findByFirstNameAndLastName(firstName, lastName);
	
	if (livreur==null){
		
		throw new RuntimeException("Impossible de trouver le livreur aunom de  "+firstName+lastName);
	}
	
	return  livreur;
	}

@GetMapping("/livreur/livreurId/{livreurId}")
public Livreur getLivreurById(@PathVariable Long livreurId) {
	
	Livreur livreur = livreurService.getLivreur(livreurId);
	return livreur;
}
	
}
