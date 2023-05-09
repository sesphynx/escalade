package com.magma.quantum.politicone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.magma.quantum.politicone.entities.Grade;
import com.magma.quantum.politicone.service.GradeService;

public class GradeController {

	@Autowired
	GradeService service;
	
	
			

	@RequestMapping("/showCreateGrade")
	public String showCreateGrade(ModelMap map) {
		Grade grade = new Grade();
		map.addAttribute(grade);
		return "createGrade";
	}

	@RequestMapping("/saveGrade")
	public String saveGrade(@ModelAttribute("grade") Grade grade , ModelMap modelMap) {
		Grade gradeSaved = service.saveGrade(grade);
		String msg = "Grade saved with id :" + gradeSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "createGrade";
	}

	@RequestMapping("/displayGrades")
	public String displayGrades(ModelMap modelMap) {

		List<Grade> grades = service.getAllGrades();
		modelMap.addAttribute("grades", grades);
		return "displayGrades";
	}

	@RequestMapping("deleteGrade")
	public String deleteGrade(@RequestParam("id") Long id, ModelMap modelMap) {
		Grade grade = new Grade();
		grade.setId(id);
		service.deleteGrade(grade);
		List<Grade> grades = service.getAllGrades();
		modelMap.addAttribute("grades", grades);
		return "displayGrades";
	}

	@RequestMapping("/showUpdateGrade")
	public String showUpdateGrade(@RequestParam("id") Long  id, ModelMap modelMap) {
		Grade grade = new Grade();
		grade.setId(id);
		modelMap.addAttribute("grade", grade);
		return "updateGrade";
	}

	@RequestMapping("updateGrade")
	public String updateGrade(@ModelAttribute("grade") Grade grade, ModelMap modelMap) {
		service.updateGrade(grade);
		List<Grade> grades = service.getAllGrades();
		modelMap.addAttribute("grades", grades);
		return "displayGrades";
	}

	



}
