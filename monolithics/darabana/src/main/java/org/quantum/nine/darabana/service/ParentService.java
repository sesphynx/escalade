package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Parent;

public interface ParentService {
	
	Parent	saveParent(Parent parent);
	Parent  updateParent(Parent parent);
	void deleteParent(Parent parent);
	Parent getParentById(Long id);
	List<Parent> getAllParents();

}
