package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Bajeen;
import org.quantum.nine.darabana.repos.BajeenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BajeenServiceImpl implements BajeenService {
	
	@Autowired
	BajeenRepository bajeenRepo ;
	
	

	public BajeenRepository getBajeenRepo() {
		return bajeenRepo;
	}

	public void setBajeenRepo(BajeenRepository bajeenRepo) {
		this.bajeenRepo = bajeenRepo;
	}

	@Override
	public Bajeen saveBajeen(Bajeen bajeen) {
		
		return bajeenRepo.save(bajeen);
	}

	@Override
	public Bajeen updateBajeen(Bajeen bajeen) {
		
		return bajeenRepo.save(bajeen);
	}

	@Override
	public void deleteBajeen(Bajeen bajeen) {
		bajeenRepo.delete(bajeen);

	}

	@Override
	public Bajeen getBajeenById(Long id) {
		
		return bajeenRepo.getOne(id);
	}

	@Override
	public List<Bajeen> getAllBajeens() {

		return bajeenRepo.findAll();
	}

}
