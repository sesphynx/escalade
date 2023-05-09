package org.quantum.nine.magma.pharmog.controllers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Category;
import org.quantum.nine.magma.pharmog.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CategoryController {
	
	@Autowired
	CatalogueService service ;
	
	@RequestMapping("/ajouterCategory")
	public String ajouterCategory(ModelMap map) {
		
		Category category = new Category();
		map.addAttribute(category);
		
		List<String> listDisabled = new LinkedList<>(Arrays.asList(new String[] {"Disponible","Indisponible"}));
		map.addAttribute("listDisabledOptions", listDisabled);
		
		
		return "creerCategory";
	}

	@RequestMapping("/sauvegarderCategory")
	public String sauvegarderCategory(@ModelAttribute("category") Category category,
							ModelMap modelMap) {
		Category categorySaved = service.saveCategory(category);
		String msg = "Category saved with id :" + categorySaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerCategory";
	}

	@RequestMapping("/toutCategorys")
	public String toutCategorys(ModelMap modelMap) {

		List<Category> categorys = service.getAllCategorys();
		modelMap.addAttribute("categorys", categorys);
		return "toutCategorys";
	}

	@RequestMapping("supprimerCategory")
	public String supprimerCategory(@RequestParam("id") Long id, ModelMap modelMap) {
		Category category = new Category();
		category.setId(id);
		service.deleteCategory(category);
		List<Category> categorys = service.getAllCategorys();
		modelMap.addAttribute("categorys", categorys);
		return "toutCategorys";
	}

	@RequestMapping("/ciblerCategory")
	public String ciblerCategory(@RequestParam("id") Long  id, ModelMap modelMap) {
		Category category = new Category();
		category.setId(id);
		modelMap.addAttribute("category", category);
		return "ciblerCategory";
	}

	@RequestMapping("reglerCategory")
	public String reglerCategory(@ModelAttribute("category") Category category, ModelMap modelMap) {
		service.updateCategory(category);
		List<Category> categorys = service.getAllCategorys();
		modelMap.addAttribute("categorys", categorys);
		return "toutCategorys";
	}

	
	
}
