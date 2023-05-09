package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.Plan;

public interface PlanService {

	Plan savePlan(Plan plan);
	Plan updatePlan(Plan plan);
	void deletePlan(Plan plan);
	Plan getPlan(Long id);
	List<Plan> getAllPlans();
}
