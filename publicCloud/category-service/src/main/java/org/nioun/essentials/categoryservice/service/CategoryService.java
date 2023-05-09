package org.nioun.essentials.categoryservice.service;

import java.util.List; 

import org.nioun.essentials.niouncommerce.*;

public interface CategoryService {


	Category saveCategory(Category category);

	Category updateCategory(Category category);

	void deleteCategory(Category category);

	Category getCategoryById(Long id);

	List<Category> getAllCategorys();
}
