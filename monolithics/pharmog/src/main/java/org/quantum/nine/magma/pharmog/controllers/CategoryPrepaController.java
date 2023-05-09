package org.quantum.nine.magma.pharmog.controllers;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.CategoryPrepa;
import org.quantum.nine.magma.pharmog.service.CataloguePrepaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CategoryPrepaController {
	
	@Autowired
	CataloguePrepaServiceImpl service ;
	
	@RequestMapping("/ajouterCategoryPrepa")
	public String ajouterCategoryPrepa(ModelMap map) {
		CategoryPrepa categoryPrepa = new CategoryPrepa();
		map.addAttribute(categoryPrepa);
		return "creerCategoryPrepa";
	}

	@RequestMapping("/sauvegarderCategoryPrepa")
	public String sauvegarderCategoryPrepa(@ModelAttribute("categoryPrepa") CategoryPrepa categoryPrepa,
							ModelMap modelMap) {
		CategoryPrepa categoryPrepaSaved = service.saveCategoryPrepa(categoryPrepa);
		String msg = "CategoryPrepa saved with id :" + categoryPrepaSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerCategoryPrepa";
	}

	@RequestMapping("/toutCategoryPrepas")
	public String toutCategoryPrepas(ModelMap modelMap) {

		List<CategoryPrepa> categoryPrepas = service.getAllCategoryPrepas();
		modelMap.addAttribute("categoryPrepas", categoryPrepas);
		return "toutCategoryPrepas";
	}

	@RequestMapping("supprimerCategoryPrepa")
	public String supprimerCategoryPrepa(@RequestParam("id") Long id, ModelMap modelMap) {
		CategoryPrepa categoryPrepa = new CategoryPrepa();
		categoryPrepa.setId(id);
		service.deleteCategoryPrepa(categoryPrepa);
		List<CategoryPrepa> categoryPrepas = service.getAllCategoryPrepas();
		modelMap.addAttribute("categoryPrepas", categoryPrepas);
		return "toutCategoryPrepas";
	}

	@RequestMapping("/ciblerCategoryPrepa")
	public String ciblerCategoryPrepa(@RequestParam("id") Long  id, ModelMap modelMap) {
		CategoryPrepa categoryPrepa = new CategoryPrepa();
		categoryPrepa.setId(id);
		modelMap.addAttribute("categoryPrepa", categoryPrepa);
		return "ciblerCategoryPrepa";
	}

	@RequestMapping("reglerCategoryPrepa")
	public String reglerCategoryPrepa(@ModelAttribute("categoryPrepa") CategoryPrepa categoryPrepa, ModelMap modelMap) {
		service.updateCategoryPrepa(categoryPrepa);
		List<CategoryPrepa> categoryPrepas = service.getAllCategoryPrepas();
		modelMap.addAttribute("categoryPrepas", categoryPrepas);
		return "toutCategoryPrepas";
	}

	
	
}
