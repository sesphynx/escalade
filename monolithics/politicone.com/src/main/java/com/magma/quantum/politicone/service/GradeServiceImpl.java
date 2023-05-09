package com.magma.quantum.politicone.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.politicone.entities.Grade;
import com.magma.quantum.politicone.repos.GradeRepository;

@Service
public class GradeServiceImpl implements GradeService {

	@Autowired
	GradeRepository gradeRepository ;
	
	

	public GradeRepository getGradeRepository() {
		return gradeRepository;
	}

	public void setGradeRepository(GradeRepository gradeRepository) {
		this.gradeRepository = gradeRepository;
	}

	@Override
	public Grade saveGrade(Grade grade) {

		return gradeRepository.save(grade);
	}

	@Override
	public Grade updateGrade(Grade grade) {
		return gradeRepository.save(grade);
	}

	@Override
	public void deleteGrade(Grade grade) {
    gradeRepository.delete(grade);

	}

	@Override
	public Grade getGradeById(Long id) {
		return gradeRepository.getOne(id);
	}

	@Override
	public List<Grade> getAllGrades() {
		return gradeRepository.findAll();
	}

}
