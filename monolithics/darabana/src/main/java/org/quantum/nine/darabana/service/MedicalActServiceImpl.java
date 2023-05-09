package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.MedicalAct;
import org.quantum.nine.darabana.repos.MedicalActRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MedicalActServiceImpl implements MedicalActService {

	
	@Autowired
	MedicalActRepository medicalActRepo ;
	
	
	
	
	
	public MedicalActRepository getMedicalActRepo() {
		return medicalActRepo;
	}

	public void setMedicalActRepo(MedicalActRepository medicalActRepo) {
		this.medicalActRepo = medicalActRepo;
	}

	@Override
	public MedicalAct saveMedicalAct(MedicalAct medicalAct) {
		
		return medicalActRepo.save(medicalAct);
	}

	@Override
	public MedicalAct updateMedicalAct(MedicalAct medicalAct) {
		
		return medicalActRepo.save(medicalAct);
	}

	@Override
	public void deleteMedicalAct(MedicalAct medicalAct) {
		medicalActRepo.delete(medicalAct);

	}

	@Override
	public MedicalAct getMedicalActById(Long id) {
		
		return medicalActRepo.getOne(id);
	}

	@Override
	public List<MedicalAct> getAllMedicalActs() {
	
		return medicalActRepo.findAll();
	}

}
