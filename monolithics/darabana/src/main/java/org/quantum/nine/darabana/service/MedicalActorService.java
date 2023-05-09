package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.MedicalActor;

public interface MedicalActorService {
	
	MedicalActor saveMedicalActor(MedicalActor medicalActor);
	MedicalActor updateMedicalActor(MedicalActor mMedicalActor);
	void deleteMedicalActor(MedicalActor medicalActor);
	MedicalActor getMedicalActorById(Long id);
	List<MedicalActor> getAllMedicalActors();

}
