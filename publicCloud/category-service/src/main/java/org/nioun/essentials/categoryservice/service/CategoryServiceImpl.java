package org.nioun.essentials.categoryservice.service;

import java.util.List;


import org.nioun.essentials.categoryservice.repos.CategoryRepository;
import org.nioun.essentials.niouncommerce.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository ;
	
	

	public CategoryRepository getCategoryRepository() {
		return categoryRepository;
	}

	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	
	public Category saveCategory(Category category) {

		return categoryRepository.save(category);
	}

	
	public Category updateCategory(Category category) {
		return categoryRepository.save(category);
	}

	
	public void deleteCategory(Category category) {
    categoryRepository.delete(category);

	}

	
	public Category getCategoryById(Long id) {
		return categoryRepository.getOne(id);
	}

	
	public List<Category> getAllCategorys() {
		return categoryRepository.findAll();
	}


}
