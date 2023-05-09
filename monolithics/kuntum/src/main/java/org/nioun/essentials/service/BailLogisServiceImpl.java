package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.BailLogis;
import org.nioun.essentials.repos.BailLogisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BailLogisServiceImpl implements BailLogisService {

	@Autowired
	BailLogisRepository bailLogisRepository ;
	
	

	public BailLogisRepository getBailLogisRepository() {
		return bailLogisRepository;
	}

	public void setBailLogisRepository(BailLogisRepository bailLogisRepository) {
		this.bailLogisRepository = bailLogisRepository;
	}

	@Override
	public BailLogis saveBailLogis(BailLogis bailLogis) {

		return bailLogisRepository.save(bailLogis);
	}

	@Override
	public BailLogis updateBailLogis(BailLogis bailLogis) {
		return bailLogisRepository.save(bailLogis);
	}

	@Override
	public void deleteBailLogis(BailLogis bailLogis) {
    bailLogisRepository.delete(bailLogis);

	}

	@Override
	public BailLogis getBailLogisById(Long id) {
		return bailLogisRepository.getOne(id);
	}

	@Override
	public List<BailLogis> getAllBailLogiss() {
		return bailLogisRepository.findAll();
	}


}
