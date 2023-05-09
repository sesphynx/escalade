package org.nioun.essentials.bailvoitureservice.controller;

import java.util.List;

import org.nioun.essentials.bailvoitureservice.service.BailVoitureService;
import org.nioun.essentials.niountransport.BailVoiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class BailVoitureController {
	
	@Autowired
	BailVoitureService bailVoitureService ;
	
	@RequestMapping(value = "/bailVoiture" , method = RequestMethod.POST)
	BailVoiture save ( @RequestBody BailVoiture bailVoiture){
		return bailVoitureService.saveBailVoiture(bailVoiture) ;
	}

	@RequestMapping(value="/bailVoiture" , method = RequestMethod.GET)
	BailVoiture fetch(@RequestParam Long bailVoitureId){
		return bailVoitureService.getBailVoitureById(bailVoitureId);
	}
	
	@RequestMapping(value="/bailVoitures" , method = RequestMethod.GET)
	List<BailVoiture> fetch(){
		return bailVoitureService.getAllBailVoitures();
	}
	
}
