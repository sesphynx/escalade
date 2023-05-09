package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Grade;

public interface GradeService {

	Grade saveGrade(Grade grade);

	Grade updateGrade(Grade grade);

	void deleteGrade(Grade grade);

	Grade getGradeById(Long id);

	List<Grade> getAllGrades();
	
}
