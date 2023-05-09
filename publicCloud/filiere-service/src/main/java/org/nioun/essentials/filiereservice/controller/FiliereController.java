package org.nioun.essentials.filiereservice.controller;

import java.util.List;

import org.nioun.essentials.niouncore.Filiere;
import org.nioun.essentials.filiereservice.service.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class FiliereController {
	
	@Autowired
	FiliereService filiereService ;
	
	@RequestMapping(value = "/filiere" , method = RequestMethod.POST)
	Filiere save ( @RequestBody Filiere filiere){
		return filiereService.saveFiliere(filiere) ;
	}

	@RequestMapping(value="/filiere" , method = RequestMethod.GET)
	Filiere fetch(@RequestParam Long filiereId){
		return filiereService.getFiliereById(filiereId);
	}
	
	@RequestMapping(value="/filieres" , method = RequestMethod.GET)
	List<Filiere> fetch(){
		return filiereService.getAllFilieres();
	}
	
}
