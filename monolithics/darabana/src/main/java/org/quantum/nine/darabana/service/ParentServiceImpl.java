package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Parent;
import org.quantum.nine.darabana.repos.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentServiceImpl implements ParentService {
	
	@Autowired
	ParentRepository parentRepo;
	
	

	public ParentRepository getParentRepo() {
		return parentRepo;
	}

	public void setParentRepo(ParentRepository parentRepo) {
		this.parentRepo = parentRepo;
	}

	@Override
	public Parent saveParent(Parent parent) {

		return parentRepo.save(parent);
	}

	@Override
	public Parent updateParent(Parent parent) {

		return parentRepo.save(parent);
	}

	@Override
	public void deleteParent(Parent parent) {
		parentRepo.delete(parent);
	}

	@Override
	public Parent getParentById(Long id) {

		return parentRepo.getOne(id);
	}

	@Override
	public List<Parent> getAllParents() {

		return parentRepo.findAll();
	}

}
