package org.nioun.essentials.categoryservice.controller;

import java.util.List;

import org.nioun.essentials.categoryservice.service.CategoryService;
import org.nioun.essentials.niouncommerce.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService ;
	
	@RequestMapping(value = "/category" , method = RequestMethod.POST)
	Category save ( @RequestBody Category category){
		return categoryService.saveCategory(category) ;
	}

	@RequestMapping(value="/category" , method = RequestMethod.GET)
	Category fetch(@RequestParam Long categoryId){
		return categoryService.getCategoryById(categoryId);
	}
	
	@RequestMapping(value="/categorys" , method = RequestMethod.GET)
	List<Category> fetch(){
		return categoryService.getAllCategorys();
	}
	
}
