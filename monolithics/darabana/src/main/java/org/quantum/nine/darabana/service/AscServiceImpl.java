package org.quantum.nine.darabana.service;

import java.util.List;


import org.quantum.nine.darabana.entities.Asc;
import org.quantum.nine.darabana.repos.AscRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AscServiceImpl implements AscService {

	@Autowired
	AscRepo ascRepo;
	
	
	
	
	public AscRepo getAscRepo() {
		return ascRepo;
	}

	public void setAscRepo(AscRepo ascRepo) {
		this.ascRepo = ascRepo;
	}

	@Override
	public Asc saveAsc(Asc asc) {
		
		return ascRepo.save(asc);
	}

	@Override
	public Asc updateAsc(Asc asc) {
	
		return ascRepo.save(asc);
	}

	@Override
	public void deleteAsc(Asc asc) {
		ascRepo.delete(asc);

	}

	@Override
	public Asc getAscById(Long id) {
		return ascRepo.getOne(id);
	}

	@Override
	public List<Asc> getAllAscs() {
		
		return ascRepo.findAll();
	}


}
