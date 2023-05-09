package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Gp;
import org.nioun.essentials.repos.GpRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GpServiceImpl implements GpService {

	@Autowired
	GpRepository gpRepository ;
	
	

	public GpRepository getGpRepository() {
		return gpRepository;
	}

	public void setGpRepository(GpRepository gpRepository) {
		this.gpRepository = gpRepository;
	}

	@Override
	public Gp saveGp(Gp gp) {

		return gpRepository.save(gp);
	}

	@Override
	public Gp updateGp(Gp gp) {
		return gpRepository.save(gp);
	}

	@Override
	public void deleteGp(Gp gp) {
    gpRepository.delete(gp);

	}

	@Override
	public Gp getGpById(Long id) {
		return gpRepository.getOne(id);
	}

	@Override
	public List<Gp> getAllGps() {
		return gpRepository.findAll();
	}


}
