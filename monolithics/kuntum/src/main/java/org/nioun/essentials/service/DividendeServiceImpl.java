package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Dividende;
import org.nioun.essentials.repos.DividendeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DividendeServiceImpl implements DividendeService {

	@Autowired
	DividendeRepository dividendeRepository ;
	
	

	public DividendeRepository getDividendeRepository() {
		return dividendeRepository;
	}

	public void setDividendeRepository(DividendeRepository dividendeRepository) {
		this.dividendeRepository = dividendeRepository;
	}

	@Override
	public Dividende saveDividende(Dividende dividende) {

		return dividendeRepository.save(dividende);
	}

	@Override
	public Dividende updateDividende(Dividende dividende) {
		return dividendeRepository.save(dividende);
	}

	@Override
	public void deleteDividende(Dividende dividende) {
    dividendeRepository.delete(dividende);

	}

	@Override
	public Dividende getDividendeById(Long id) {
		return dividendeRepository.getOne(id);
	}

	@Override
	public List<Dividende> getAllDividendes() {
		return dividendeRepository.findAll();
	}


}
