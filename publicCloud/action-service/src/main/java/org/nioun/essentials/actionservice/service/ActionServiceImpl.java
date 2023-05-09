package org.nioun.essentials.actionservice.service;

import java.util.List;
import java.util.Optional;

import org.nioun.essentials.actionservice.repos.ActionRepository;
import org.nioun.essentials.niounsocial.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionServiceImpl implements ActionService {

	@Autowired
	ActionRepository actionRepository ;
	
	
	public Action save(Action action) {
		
		return actionRepository.save(action);
	}

	
	public Action fetchById(Long actionId) {
	
		Optional<Action>	action = actionRepository.findById(actionId);
	
	if (action.isPresent()){
		return action.get();
	}
	else {
		return null ;
	}	
	
	
	}

	
	public List<Action> fetchAllActions() {
		
		return actionRepository.findAll();
	}

}
