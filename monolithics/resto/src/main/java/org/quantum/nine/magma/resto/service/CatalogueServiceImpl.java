package org.quantum.nine.magma.resto.service;

import java.util.List;

import org.quantum.nine.magma.resto.entities.Category;
import org.quantum.nine.magma.resto.entities.Plat;
import org.quantum.nine.magma.resto.repos.CategoryRepository;
import org.quantum.nine.magma.resto.repos.PlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogueServiceImpl implements CatalogueService {
	
	@Autowired
	public PlatRepository platRepository ;
	
	

	public PlatRepository getPlatRepository() {
		return platRepository;
	}

	public void setPlatRepository(PlatRepository platRepository) {
		this.platRepository = platRepository;
	}

	@Override
	public Plat savePlat(Plat plat) {

		return platRepository.save(plat);
	}

	@Override
	public Plat updatePlat(Plat plat) {
		return platRepository.save(plat);
	}

	@Override
	public void deletePlat(Plat plat) {
    platRepository.delete(plat);

	}

	@Override
	public Plat getPlatById(Long id) {
		return platRepository.getOne(id);
	}

	@Override
	public List<Plat> getAllPlats() {
		return platRepository.findAll();
	}
	
	
	
	/*Category's de Plats du Menu */
	
	@Autowired
	CategoryRepository categoryRepository ;
	
	

	public CategoryRepository getCategoryRepository() {
		return categoryRepository;
	}

	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Category saveCategory(Category category) {

		return categoryRepository.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategory(Category category) {
    categoryRepository.delete(category);

	}

	@Override
	public Category getCategoryById(Long id) {
		return categoryRepository.getOne(id);
	}

	@Override
	public List<Category> getAllCategorys() {
		return categoryRepository.findAll();
	}

	/*Cross Class Queries*/

	public List<Plat> searchPlatts(String query) {
		return platRepository.search("%"+query+"%");
	}
	
	public List<Plat> findProduitByCategory (Category category){
		List<Plat> platsCategory = platRepository.findByCategory(category);
		return platsCategory;
	}
	
	

}
