package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Acquisition;
import org.nioun.essentials.repos.AcquisitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcquisitionServiceImpl implements AcquisitionService {

	@Autowired
	AcquisitionRepository acquisitionRepository ;
	
	

	public AcquisitionRepository getAcquisitionRepository() {
		return acquisitionRepository;
	}

	public void setAcquisitionRepository(AcquisitionRepository acquisitionRepository) {
		this.acquisitionRepository = acquisitionRepository;
	}

	@Override
	public Acquisition saveAcquisition(Acquisition acquisition) {

		return acquisitionRepository.save(acquisition);
	}

	@Override
	public Acquisition updateAcquisition(Acquisition acquisition) {
		return acquisitionRepository.save(acquisition);
	}

	@Override
	public void deleteAcquisition(Acquisition acquisition) {
    acquisitionRepository.delete(acquisition);

	}

	@Override
	public Acquisition getAcquisitionById(Long id) {
		return acquisitionRepository.getOne(id);
	}

	@Override
	public List<Acquisition> getAllAcquisitions() {
		return acquisitionRepository.findAll();
	}


}
