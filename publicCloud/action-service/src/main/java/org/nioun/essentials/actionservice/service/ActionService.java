package org.nioun.essentials.actionservice.service;

import java.util.List;

import org.nioun.essentials.niounsocial.Action;

public interface ActionService {

	Action save(Action action);
	Action   fetchById(Long actionId);
	List<Action> fetchAllActions();
}
