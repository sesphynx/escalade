package com.magma.quantum.machintech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.machintech.entities.Absence;
import com.magma.quantum.machintech.repos.AbsenceRepository;

@Service
public class AbsenceServiceImpl implements AbsenceService {

	@Autowired
	AbsenceRepository absenceRepository ;	
	
	
	/**
	 * @return the absenceRepository
	 */
	public AbsenceRepository getAbsenceRepository() {
		return absenceRepository;
	}

	/**
	 * @param absenceRepository the absenceRepository to set
	 */
	public void setAbsenceRepository(AbsenceRepository absenceRepository) {
		this.absenceRepository = absenceRepository;
	}


	public Absence saveAbsence(Absence absence) {
		return absenceRepository.save(absence);
	}


	public Absence updateAbsence(Absence absence) {
		
		return absenceRepository.save(absence);
	}


	public void deleteAbsence(Absence absence) {
		absenceRepository.delete(absence);
		
	}


	public Absence getAbsenceById(Long id) {
		return absenceRepository.getOne(id);
	}


	public List<Absence> getAllAbsences() {
		return absenceRepository.findAll();
	}

}
