package org.quantum.nine.darabana.controllers;

import java.util.List;

import org.quantum.nine.darabana.entities.MedicalAct;
import org.quantum.nine.darabana.service.MedicalActService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MedicalActController {


	@Autowired
	MedicalActService service;
			

	@RequestMapping("/showCreateMedicalAct")
	public String showCreateMedicalAct(ModelMap map) {
		MedicalAct medicalAct= new MedicalAct();
		map.addAttribute(medicalAct);
		return "createMedicalAct";
	}

	@RequestMapping("/saveMedicalAct")
	public String saveMedicalAct(@ModelAttribute("medicalAct") MedicalAct medicalAct, ModelMap modelMap) {
		MedicalAct medicalActSaved = service.saveMedicalAct(medicalAct);
		String msg = "MedicalAct saved with id :" + medicalActSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createMedicalAct";
	}

	@RequestMapping("/displayMedicalActs")
	public String displayMedicalActs(ModelMap modelMap) {

		List<MedicalAct> medicalActs = service.getAllMedicalActs();
		modelMap.addAttribute("medicalActs", medicalActs);
		return "displayMedicalActs";
	}

	@RequestMapping("deleteMedicalAct")
	public String deleteMedicalAct(@RequestParam("id") Long id, ModelMap modelMap) {
		MedicalAct medicalAct = new MedicalAct();
		medicalAct.setId(id);
		service.deleteMedicalAct(medicalAct);
		List<MedicalAct> medicalActs = service.getAllMedicalActs();
		modelMap.addAttribute("medicalActs", medicalActs);
		return "displayMedicalActs";
	}

	@RequestMapping("/showUpdateMedicalAct")
	public String showUpdateMedicalAct(@RequestParam("id") Long  id, ModelMap modelMap) {
		MedicalAct medicalAct = new MedicalAct();
		medicalAct.setId(id);
		modelMap.addAttribute("medicalAct", medicalAct);
		return "updateMedicalAct";
	}

	@RequestMapping("updateMedicalAct")
	public String updateMedicalAct(@ModelAttribute("medicalAct") MedicalAct medicalAct, ModelMap modelMap) {
		service.updateMedicalAct(medicalAct);
		List<MedicalAct> medicalActs = service.getAllMedicalActs();
		modelMap.addAttribute("medicalActs", medicalActs);
		return "displayMedicalActs";
	}

	

	
}
