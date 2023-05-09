package org.nioun.essentials.actionservice.controller;

import java.util.List;

import org.nioun.essentials.actionservice.service.ActionService;
import org.nioun.essentials.niounsocial.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ActionController {
	
	@Autowired
	ActionService actionService ;
	
	@RequestMapping(value = "/action" , method = RequestMethod.POST)
	Action save ( @RequestBody Action action){
		return actionService.save(action) ;
	}

	@RequestMapping(value="/action" , method = RequestMethod.GET)
	Action fetch(@RequestParam Long actionId){
		return actionService.fetchById(actionId);
	}
	
	@RequestMapping(value="/actions" , method = RequestMethod.GET)
	List<Action> fetch(){
		return actionService.fetchAllActions();
	}
	
}
