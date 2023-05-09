package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Grade;

public interface GradeService {

	Grade saveGrade(Grade grade);

	Grade updateGrade(Grade grade);

	void deleteGrade(Grade grade);

	Grade getGradeById(Long id);

	List<Grade> getAllGrades();
	
}
