package com.magma.quantum.machintech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.machintech.entities.Absence;
import com.magma.quantum.machintech.service.AbsenceService;

@Controller
public class AbsenceController {

	
	@Autowired
	AbsenceService absenceService ;
	
	String allabsences = "afficherAllAbsences";
	/*  Absencemethods*/
	@GetMapping(path="/creerAbsence")
	public String creerAbsence(){
		return "creerAbsence" ;
		
	}
	@PostMapping(path="/enregistrerAbsence")
	public String enregistrerAbsence(@ModelAttribute("absence") Absence absence,ModelMap modelMap){
		Absence  savedAbsence= absenceService.saveAbsence(absence);
		String msg = ("Absence Enregistré avec Id:"+savedAbsence.getId());
		modelMap.addAttribute("msg", msg);
		return "creerAbsence" ;
	}
	@GetMapping(path="/afficherAllAbsences")
	public String afficherAllAbsences(ModelMap modelMap){
		  List<Absence> absences = absenceService.getAllAbsences();
		  modelMap.addAttribute("absences",absences);
		return allabsences ;
	}
	
	@DeleteMapping(path="/supprimerAbsence")
	public String supprimerAbsence(@RequestParam("id") Long id,ModelMap modelMap){
		Absence absence= new Absence();
		absence.setId(id);
		absenceService.deleteAbsence(absence);
		List<Absence> absences = absenceService.getAllAbsences();
		  modelMap.addAttribute("absences", absences);
		return allabsences ;
	}
	@GetMapping(path="/ciblerAbsence")
	public String ciblerAbsence(@RequestParam("id") Long id,ModelMap modelMap){
		Absence absence= absenceService.getAbsenceById(id);
		modelMap.addAttribute("absence", absence);
		return "editerAbsence" ;
	}
	
	@GetMapping(path="/editerAbsence")
	public String editerAbsence(@ModelAttribute("absence") Absence absence,ModelMap modelMap){
		absenceService.saveAbsence(absence);
		List<Absence> absences = absenceService.getAllAbsences();
		  modelMap.addAttribute("absences",absences);
		return allabsences ;
	}
	

}
