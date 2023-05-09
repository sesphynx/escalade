package org.nioun.essentials.chapiteauservice.controller;

import java.util.List;

import org.nioun.essentials.chapiteauservice.service.ChapiteauService;
import org.nioun.essentials.niounsocial.Chapiteau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ChapiteauController {
	
	@Autowired
	ChapiteauService chapiteauService ;
	
	@RequestMapping(value = "/profile" , method = RequestMethod.POST)
	Chapiteau save ( @RequestBody Chapiteau chapiteau){
		return chapiteauService.save(chapiteau) ;
	}

	@RequestMapping(value="/profile" , method = RequestMethod.GET)
	Chapiteau fetch(@RequestParam Long profileId){
		return chapiteauService.fetchById(profileId);
	}
	
	@RequestMapping(value="/profiles" , method = RequestMethod.GET)
	List<Chapiteau> fetch(){
		return chapiteauService.fetchAllProfiles();
	}
	
}
