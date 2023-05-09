package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.MedicalActor;
import org.quantum.nine.darabana.repos.MedicalActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalActorServiceImpl implements MedicalActorService {

	@Autowired
	MedicalActorRepository medicalActorRepo;
	
	
	public MedicalActorRepository getMedicalActorRepo() {
		return medicalActorRepo;
	}

	public void setMedicalActorRepo(MedicalActorRepository medicalActorRepo) {
		this.medicalActorRepo = medicalActorRepo;
	}

	@Override
	public MedicalActor saveMedicalActor(MedicalActor medicalActor) {

		return medicalActorRepo.save(medicalActor);
	}

	@Override
	public MedicalActor updateMedicalActor(MedicalActor medicalActor) {

		return medicalActorRepo.save(medicalActor);
	}

	@Override
	public void deleteMedicalActor(MedicalActor medicalActor) {
		medicalActorRepo.delete(medicalActor);

	}

	@Override
	public MedicalActor getMedicalActorById(Long id) {

		return medicalActorRepo.getOne(id);
	}

	@Override
	public List<MedicalActor> getAllMedicalActors() {

		return medicalActorRepo.findAll();
	}

}
