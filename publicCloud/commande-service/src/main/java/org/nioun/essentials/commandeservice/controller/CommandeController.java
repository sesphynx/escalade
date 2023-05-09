package org.nioun.essentials.commandeservice.controller;

import java.util.List;

import org.nioun.essentials.commandeservice.service.CommandeService;
import org.nioun.essentials.niouncommerce.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class CommandeController {
	
	@Autowired
	CommandeService commandeService ;
	
	@RequestMapping(value = "/commande" , method = RequestMethod.POST)
	Commande save ( @RequestBody Commande commande){
		return commandeService.saveCommande(commande) ;
	}

	@RequestMapping(value="/commande" , method = RequestMethod.GET)
	Commande fetch(@RequestParam Long commandeId){
		return commandeService.getCommandeById(commandeId);
	}
	
	@RequestMapping(value="/commandes" , method = RequestMethod.GET)
	List<Commande> fetch(){
		return commandeService.getAllCommandes();
	}
	
}
