package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.Plan;
import com.magma.quantum.corniche.repos.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	PlanRepository planRepository;
	
	
	public PlanRepository getPlanRepository() {
		return planRepository;
	}

	public void setPlanRepository(PlanRepository planRepository) {
		this.planRepository = planRepository;
	}

	
	public Plan savePlan(Plan plan) {

		return planRepository.save(plan);
	}


	public Plan updatePlan(Plan plan) {

		return planRepository.save(plan);
	}

	
	public void deletePlan(Plan plan) {
	planRepository.delete(plan);

	}

	
	public Plan getPlan(Long id) {
	
		return planRepository.getOne(id);
	}

	
	public List<Plan> getAllPlans() {
		
		return planRepository.findAll();
	}

}
