package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.MedicalAct;

public interface MedicalActService {
	
 MedicalAct	saveMedicalAct(MedicalAct medicalAct);
 MedicalAct updateMedicalAct(MedicalAct medicalAct);
 void deleteMedicalAct(MedicalAct medicalAct);
 MedicalAct getMedicalActById(Long id);
 List<MedicalAct> getAllMedicalActs();

}
