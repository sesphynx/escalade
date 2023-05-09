package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Category;
import org.nioun.essentials.repos.CategoryRepository;
import org.nioun.essentials.repos.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryRepository categoryRep ;
	
	@Autowired
	ProduitRepository produitRep ;

	
	@GetMapping(value="/creerCategory")
	public String creerCategory(ModelMap map) {
		Category category = new Category();
		map.addAttribute(category);
		return "creerCategory";
	}
	
	@GetMapping(value="/toutCategorys")
	public String toutCategorys(ModelMap map ) {
		 List<Category> categories = categoryRep.findAll();
		map.addAttribute( "categories",categories);
		return "toutCategories";
	}
	
	@PostMapping(path="/suvegarderCategory")
	public String sauvegarderCategory(@ModelAttribute("category") Category category) {
		categoryRep.save(category);
	return "creerCategory";	
	}
	
	@DeleteMapping(value="/supprimerCategory")
	public String supprimerCategory( Category category ) {
		categoryRep.delete(category);
		return "toutCategorys";
	}
	
	@PutMapping(path="/reglercategory")
	public String reglercategory(@ModelAttribute("category") Category category) {
		categoryRep.save(category);
	return "toutCategorys";	
	}
	
	@RequestMapping("/ciblerCategory")
	public String ciblerCategory(@RequestParam ("id") Long id , ModelMap model) {
		Category category = categoryRep.getOne(id);
		model.addAttribute("category", category);
		return "ciblercategory";
		
	}
		
	@ModelAttribute
	public void getProduitsCategory(@RequestParam Category category , Model map ){
	
		map.addAttribute("produitsCategory" , produitRep.findByCategory(category));
	}
}
