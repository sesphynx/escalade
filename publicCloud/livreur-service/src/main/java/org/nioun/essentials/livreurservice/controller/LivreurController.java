package org.nioun.essentials.livreurservice.controller;

import java.util.List;

import org.nioun.essentials.livreurservice.service.LivreurService;
import org.nioun.essentials.niounlivraison.Livreur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class LivreurController {
	
	@Autowired
	LivreurService livreurService ;
	
	@RequestMapping(value = "/livreur" , method = RequestMethod.POST)
	Livreur save ( @RequestBody Livreur livreur){
		return livreurService.saveLivreur(livreur) ;
	}

	@RequestMapping(value="/livreur" , method = RequestMethod.GET)
	Livreur fetch(@RequestParam Long livreurId){
		return livreurService.getLivreurById(livreurId);
	}
	
	@RequestMapping(value="/livreurs" , method = RequestMethod.GET)
	List<Livreur> fetch(){
		return 	livreurService.getAllLivreurs();
	}
	
}
