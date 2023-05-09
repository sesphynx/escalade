package org.nioun.essentials.voiturageservice.controller;

import java.util.List;

import org.nioun.essentials.niountransport.Voiturage;
import org.nioun.essentials.voiturageservice.service.VoiturageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class VoiturageController {
	
	@Autowired
	VoiturageService voiturageService ;
	
	@RequestMapping(value = "/voiturage" , method = RequestMethod.POST)
	Voiturage save ( @RequestBody Voiturage voiturage){
		return voiturageService.saveVoiturage(voiturage) ;
	}

	@RequestMapping(value="/voiturage" , method = RequestMethod.GET)
	Voiturage fetch(@RequestParam Long voiturageId){
		return voiturageService.getVoiturageById(voiturageId);
	}
	
	@RequestMapping(value="/voiturages" , method = RequestMethod.GET)
	List<Voiturage> fetch(){
		return voiturageService.getAllVoiturages();
	}
	
}
