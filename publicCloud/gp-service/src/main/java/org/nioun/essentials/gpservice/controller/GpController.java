package org.nioun.essentials.gpservice.controller;

import java.util.List;

import org.nioun.essentials.niounlivraison.Gp;
import org.nioun.essentials.gpservice.service.GpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class GpController {
	
	@Autowired
	GpService gpService ;
	
	@RequestMapping(value = "/gp" , method = RequestMethod.POST)
	Gp save ( @RequestBody Gp gp){
		return gpService.saveGp(gp) ;
	}

	@RequestMapping(value="/gp" , method = RequestMethod.GET)
	Gp fetch(@RequestParam Long gpId){
		return gpService.getGpById(gpId);
	}
	
	@RequestMapping(value="/gps" , method = RequestMethod.GET)
	List<Gp> fetch(){
		return gpService.getAllGps();
	}
	
}
