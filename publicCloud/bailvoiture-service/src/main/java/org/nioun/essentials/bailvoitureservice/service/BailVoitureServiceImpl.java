package org.nioun.essentials.bailvoitureservice.service;

import java.util.List;

import org.nioun.essentials.bailvoitureservice.repos.BailVoitureRepository;
import org.nioun.essentials.niountransport.BailVoiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BailVoitureServiceImpl implements BailVoitureService {

	@Autowired
	BailVoitureRepository bailVoitureRepository ;
	
	

	public BailVoitureRepository getBailVoitureRepository() {
		return bailVoitureRepository;
	}

	public void setBailVoitureRepository(BailVoitureRepository bailVoitureRepository) {
		this.bailVoitureRepository = bailVoitureRepository;
	}

	@Override
	public BailVoiture saveBailVoiture(BailVoiture bailVoiture) {

		return bailVoitureRepository.save(bailVoiture);
	}

	@Override
	public BailVoiture updateBailVoiture(BailVoiture bailVoiture) {
		return bailVoitureRepository.save(bailVoiture);
	}

	@Override
	public void deleteBailVoiture(BailVoiture bailVoiture) {
    bailVoitureRepository.delete(bailVoiture);

	}

	@Override
	public BailVoiture getBailVoitureById(Long id) {
		return bailVoitureRepository.getOne(id);
	}

	@Override
	public List<BailVoiture> getAllBailVoitures() {
		return bailVoitureRepository.findAll();
	}


}
