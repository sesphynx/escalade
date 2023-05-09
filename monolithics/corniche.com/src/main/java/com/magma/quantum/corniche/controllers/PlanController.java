package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.corniche.entities.Plan;
import com.magma.quantum.corniche.service.PlanService;

@Controller
public class PlanController {
	

	@Autowired 
	PlanService planService;

	
/*  Plan methods*/
	
	@RequestMapping("/creerPlan")
	private String creerPlan(){
		return "creerPlan" ;
	}
	
	@RequestMapping("/enregistrerPlan")
	private String enregistrerPlan(@ModelAttribute("plan") Plan plan,ModelMap modelMap){
		Plan savedPlan = planService.savePlan(plan);
		String msg = "Plan Enregistré avec Id:"+savedPlan.getId();
		return "creerPlan" ;
	}
	@RequestMapping("/afficherAllPlans")
	private String afficherAllPlans(ModelMap modelMap){
		  List<Plan> plans = planService.getAllPlans();
		  modelMap.addAttribute("plans", plans);
		return "afficherAllPlans" ;
	}
	@RequestMapping("/supprimerPlan")
	private String supprimerPlan(@RequestParam("id") Long id,ModelMap modelMap){
		Plan plan = new Plan();
		plan.setId(id);
		planService.deletePlan(plan);
		List<Plan> plans = planService.getAllPlans();
		  modelMap.addAttribute("plans", plans);
		return "afficherAllPlans" ;
	}
	@RequestMapping("/ciblerPlan")
	private String ciblerPlan(@RequestParam("id") Long id,ModelMap modelMap){
		Plan updatedPlan = planService.getPlan(id);
		modelMap.addAttribute("plan", updatedPlan);
		return "editerPlan" ;
	}
	@RequestMapping("/editerPlan")
	private String editerPlan(@ModelAttribute("plan") Plan plan,ModelMap modelMap){
		planService.savePlan(plan);
		List<Plan> plans = planService.getAllPlans();
		  modelMap.addAttribute("plans", plans);
		return "afficherAllPlans" ;
	}
}
