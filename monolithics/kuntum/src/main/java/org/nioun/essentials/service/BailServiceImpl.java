package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Bail;
import org.nioun.essentials.repos.BailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BailServiceImpl implements BailService {

	@Autowired
	BailRepository bailRepository ;
	
	

	public BailRepository getBailRepository() {
		return bailRepository;
	}

	public void setBailRepository(BailRepository bailRepository) {
		this.bailRepository = bailRepository;
	}

	@Override
	public Bail saveBail(Bail bail) {

		return bailRepository.save(bail);
	}

	@Override
	public Bail updateBail(Bail bail) {
		return bailRepository.save(bail);
	}

	@Override
	public void deleteBail(Bail bail) {
    bailRepository.delete(bail);

	}

	@Override
	public Bail getBailById(Long id) {
		return bailRepository.getOne(id);
	}

	@Override
	public List<Bail> getAllBails() {
		return bailRepository.findAll();
	}


}
