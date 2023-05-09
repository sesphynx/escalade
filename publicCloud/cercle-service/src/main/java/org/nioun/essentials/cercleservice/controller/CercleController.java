package org.nioun.essentials.cercleservice.controller;

import java.util.List;

import org.nioun.essentials.cercleservice.service.CercleService;
import org.nioun.essentials.niounsocial.Cercle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class CercleController {
	
	@Autowired
	CercleService cercleService ;
	
	@RequestMapping(value = "/cercle" , method = RequestMethod.POST)
	Cercle save ( @RequestBody Cercle cercle){
		return cercleService.save(cercle) ;
	}

	@RequestMapping(value="/cercle" , method = RequestMethod.GET)
	Cercle fetch(@RequestParam Long cercleId){
		return cercleService.fetchById(cercleId);
	}
	
	@RequestMapping(value="/cercles" , method = RequestMethod.GET)
	List<Cercle> fetch(){
		return cercleService.fetchAllCercles();
	}
	
}
