package org.quantum.nine.magma.resto.service;

import java.util.List; 

import org.quantum.nine.magma.resto.entities.Category;
import org.quantum.nine.magma.resto.entities.Plat;
import org.quantum.nine.magma.resto.repos.CategoryRepository;
import org.quantum.nine.magma.resto.repos.PlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {

	@Autowired CategoryRepository categoryRepository;
	@Autowired PlatRepository platRepository;
	
	public List<Category> getAllCategories() {
		
		return categoryRepository.findAll();
	}
	
	public List<Plat> getAllPlats() {
		
		return platRepository.findAll();
	}

	public Category getCategoryByName(String name) {
		return categoryRepository.getByName(name);
	}
	
	public Category getCategoryById(Long id) {
		return categoryRepository.getOne(id);
	}

	public Category createCategory(Category category) {
		Category persistedCategory = getCategoryByName(category.getName());
		return categoryRepository.save(category);
	}

	public Category updateCategory(Category category) {
		Category persistedCategory = getCategoryById(category.getId());
		
		persistedCategory.setDescription(category.getDescription());
		persistedCategory.setDisplayOrder(category.getDisplayOrder());
		persistedCategory.setDisabled(category.isDisabled());
		return categoryRepository.save(persistedCategory);
	}

	public Plat getPlatById(Long id) {
		return platRepository.getOne(id);
	}
	
	public Plat getPlatBySku(String sku) {
		return platRepository.findBySku(sku);
	}
	
	public Plat createPlat(Plat plat) {
		Plat persistedPlat = getPlatBySku(plat.getName());
		
		return platRepository.save(plat);
	}
	
	public Plat updatePlat(Plat plat) {
		Plat persistedPlat = getPlatById(plat.getId());
		persistedPlat.setDescription(plat.getDescription());
		persistedPlat.setDisabled(plat.isDisabled());
		persistedPlat.setPrice(plat.getPrice());
		persistedPlat.setCategory(getCategoryById(plat.getCategory().getId()));
		return platRepository.save(persistedPlat);
	}

	public List<Plat> searchPlats(String query) {
		return platRepository.search("%"+query+"%");
	}
	
	public List<Plat> findPlattByCategory (Category category){
		List<Plat> produitsCategory = platRepository.findByCategory(category);
		return produitsCategory;
	}
}
