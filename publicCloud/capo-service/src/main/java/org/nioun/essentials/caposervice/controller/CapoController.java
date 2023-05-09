package org.nioun.essentials.caposervice.controller;

import java.util.List;

import org.nioun.essentials.caposervice.service.CapoService;
import org.nioun.essentials.niounsocial.Capo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class CapoController {
	
	@Autowired
	CapoService capoService ;
	
	@RequestMapping(value = "/capo" , method = RequestMethod.POST)
	Capo save ( @RequestBody Capo capo){
		return capoService.save(capo) ;
	}

	@RequestMapping(value="/capo" , method = RequestMethod.GET)
	Capo fetch(@RequestParam Long capoId){
		return capoService.fetchById(capoId);
	}
	
	@RequestMapping(value="/capos" , method = RequestMethod.GET)
	List<Capo> fetch(){
		return capoService.fetchAllCapos();
	}
	
}
