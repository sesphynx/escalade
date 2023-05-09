package com.magma.quantum.machintech.service;

import java.util.List;

import com.magma.quantum.machintech.entities.Absence;


public interface AbsenceService {
	

	Absence saveAbsence(Absence absence);
	Absence updateAbsence (Absence absence);
	void deleteAbsence(Absence absence) ;
	Absence getAbsenceById(Long id);
	List<Absence> getAllAbsences();

}
