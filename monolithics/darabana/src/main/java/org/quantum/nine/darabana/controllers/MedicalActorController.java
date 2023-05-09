package org.quantum.nine.darabana.controllers;

import java.util.List;

import org.quantum.nine.darabana.entities.MedicalActor;
import org.quantum.nine.darabana.service.MedicalActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MedicalActorController {


	@Autowired
	MedicalActorService service;
			

	@RequestMapping("/showCreateMedicalActor")
	public String showCreateMedicalActor(ModelMap map) {
		MedicalActor medicalActor= new MedicalActor();
		map.addAttribute(medicalActor);
		return "createMedicalActor";
	}

	@RequestMapping("/saveMedicalActor")
	public String saveMedicalActor(@ModelAttribute("medicalActor") MedicalActor medicalActor, ModelMap modelMap) {
		MedicalActor medicalActorSaved = service.saveMedicalActor(medicalActor);
		String msg = "MedicalActor saved with id :" + medicalActorSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createMedicalActor";
	}

	@RequestMapping("/displayMedicalActors")
	public String displayMedicalActors(ModelMap modelMap) {

		List<MedicalActor> medicalActors = service.getAllMedicalActors();
		modelMap.addAttribute("medicalActors", medicalActors);
		return "displayMedicalActors";
	}

	@RequestMapping("deleteMedicalActor")
	public String deleteMedicalActor(@RequestParam("id") Long id, ModelMap modelMap) {
		MedicalActor medicalActor = new MedicalActor();
		medicalActor.setId(id);
		service.deleteMedicalActor(medicalActor);
		List<MedicalActor> medicalActors = service.getAllMedicalActors();
		modelMap.addAttribute("medicalActors", medicalActors);
		return "displayMedicalActors";
	}

	@RequestMapping("/showUpdateMedicalActor")
	public String showUpdateMedicalActor(@RequestParam("id") Long  id, ModelMap modelMap) {
		MedicalActor medicalActor = new MedicalActor();
		medicalActor.setId(id);
		modelMap.addAttribute("medicalActor", medicalActor);
		return "updateMedicalActor";
	}

	@RequestMapping("updateMedicalActor")
	public String updateMedicalActor(@ModelAttribute("medicalActor") MedicalActor medicalActor, ModelMap modelMap) {
		service.updateMedicalActor(medicalActor);
		List<MedicalActor> medicalActors = service.getAllMedicalActors();
		modelMap.addAttribute("medicalActors", medicalActors);
		return "displayMedicalActors";
	}

	
	
	
}
