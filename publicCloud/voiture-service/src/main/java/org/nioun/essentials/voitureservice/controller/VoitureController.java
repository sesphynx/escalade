package org.nioun.essentials.voitureservice.controller;

import java.util.List;

import org.nioun.essentials.niountransport.Voiture;
import org.nioun.essentials.voitureservice.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class VoitureController {
	
	@Autowired
	VoitureService voitureService ;
	
	@RequestMapping(value = "/voiture" , method = RequestMethod.POST)
	Voiture save ( @RequestBody Voiture voiture){
		return voitureService.saveVoiture(voiture) ;
	}

	@RequestMapping(value="/voiture" , method = RequestMethod.GET)
	Voiture fetch(@RequestParam Long voitureId){
		return voitureService.getVoitureById(voitureId);
	}
	
	@RequestMapping(value="/voitures" , method = RequestMethod.GET)
	List<Voiture> fetch(){
		return voitureService.getAllVoitures();
	}
	
}
