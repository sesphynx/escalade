package org.nioun.essentials.causeservice.controller;

import java.util.List;

import org.nioun.essentials.causeservice.service.CauseService;
import org.nioun.essentials.niounsocial.Cause;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class CauseController {
	
	@Autowired
	CauseService causeService ;
	
	@RequestMapping(value = "/cause" , method = RequestMethod.POST)
	Cause save ( @RequestBody Cause cause){
		return causeService.save(cause) ;
	}

	@RequestMapping(value="/cause" , method = RequestMethod.GET)
	Cause fetch(@RequestParam Long causeId){
		return causeService.fetchById(causeId);
	}
	
	@RequestMapping(value="/causes" , method = RequestMethod.GET)
	List<Cause> fetch(){
		return causeService.fetchAllCauses();
	}
	
}
