package org.nioun.essentials.tontine.service;

import java.util.List;

import org.nioun.essentials.tontine.model.Tontine;
import org.nioun.essentials.tontine.repository.TontineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TontineServiceImpl implements TontineService {


	@Autowired
	TontineRepository tontineRepository;
	
	
	
	
	public TontineRepository getTontineRepository() {
		return tontineRepository;
	}

	public void setTontineRepository(TontineRepository tontineRepository) {
		this.tontineRepository = tontineRepository;
	}

	@Override
	public Tontine saveTontine(Tontine tontine) {

		return tontineRepository.save(tontine);
	}

	
	public Tontine updateTontine(Tontine tontine) {

		return tontineRepository.save(tontine);
	}

	@Override
	public void deleteTontine(Tontine tontine) {
		tontineRepository.delete(tontine);

	}

	@Override
	public Tontine getTontine(Long tontineId) {

		return tontineRepository.findById(tontineId).get();
	}

	@Override
	public List<Tontine> getAllTontines() {

		return tontineRepository.findAll();
	}

}
