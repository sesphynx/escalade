package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Pensionnaire;
import org.quantum.nine.darabana.repos.PensionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PensionnaireServiceImpl implements PensionnaireService {
	
	@Autowired
	PensionnaireRepository pensionnaireRepository;

	
	
	public PensionnaireRepository getPensionnaireRepository() {
		return pensionnaireRepository;
	}

	public void setPensionnaireRepository(PensionnaireRepository pensionnaireRepository) {
		this.pensionnaireRepository = pensionnaireRepository;
	}

	@Override
	public Pensionnaire savePensionnaire(Pensionnaire pensionnaire) {
		return pensionnaireRepository.save(pensionnaire);
	}

	@Override
	public Pensionnaire updatePensionnaire(Pensionnaire pensionnaire) {
		return pensionnaireRepository.save(pensionnaire);
	}

	@Override
	public void deletePensionnaire(Pensionnaire pensionnaire) {
		pensionnaireRepository.delete(pensionnaire);

	}

	@Override
	public Pensionnaire getPensionnaireById(Long id) {
	return pensionnaireRepository.getOne(id);
	}

	@Override
	public List<Pensionnaire> getAllPensionnaires() {
	return pensionnaireRepository.findAll();
	}

}
