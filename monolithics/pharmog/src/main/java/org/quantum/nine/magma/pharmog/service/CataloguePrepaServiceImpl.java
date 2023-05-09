package org.quantum.nine.magma.pharmog.service;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.CategoryPrepa;
import org.quantum.nine.magma.pharmog.entities.Prepa;
import org.quantum.nine.magma.pharmog.repos.CategoryPrepaRepository;
import org.quantum.nine.magma.pharmog.repos.PrepaRepository;
import org.quantum.nine.magma.pharmog.repos.ProducteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CataloguePrepaServiceImpl implements CataloguePrepaService{

	@Autowired
	public PrepaRepository prepaRepository ;
	
	

	public PrepaRepository getPrepaRepository() {
		return prepaRepository;
	}

	public void setPrepaRepository(PrepaRepository prepaRepository) {
		this.prepaRepository = prepaRepository;
	}

	@Override
	public Prepa savePrepa(Prepa prepa) {

		return prepaRepository.save(prepa);
	}

	@Override
	public Prepa updatePrepa(Prepa prepa) {
		return prepaRepository.save(prepa);
	}

	@Override
	public void deletePrepa(Prepa prepa) {
    prepaRepository.delete(prepa);

	}

	@Override
	public Prepa getPrepaById(Long id) {
		return prepaRepository.getOne(id);
	}

	@Override
	public List<Prepa> getAllPrepas() {
		return prepaRepository.findAll();
	}
	
	/* Producteurs du Catalogues */
	
	@Autowired
	ProducteurRepository producteurRepository ;
	
	

	public ProducteurRepository getProducteurRepository() {
		return producteurRepository;
	}

	public void setProducteurRepository(ProducteurRepository producteurRepository) {
		this.producteurRepository = producteurRepository;
	}

	/*CategoryPrepa's du Catalogue*/
	
	@Autowired
	CategoryPrepaRepository categoryPrepaRepository ;
	
	public CategoryPrepaRepository getCategoryPrepaRepository() {
		return categoryPrepaRepository;
	}

	public void setCategoryPrepaRepository(CategoryPrepaRepository categoryPrepaRepository) {
		this.categoryPrepaRepository = categoryPrepaRepository;
	}

	@Override
	public CategoryPrepa saveCategoryPrepa(CategoryPrepa categoryPrepa) {

		return categoryPrepaRepository.save(categoryPrepa);
	}

	@Override
	public CategoryPrepa updateCategoryPrepa(CategoryPrepa categoryPrepa) {
		return categoryPrepaRepository.save(categoryPrepa);
	}

	@Override
	public void deleteCategoryPrepa(CategoryPrepa categoryPrepa) {
    categoryPrepaRepository.delete(categoryPrepa);

	}

	@Override
	public CategoryPrepa getCategoryPrepaById(Long id) {
		return categoryPrepaRepository.getOne(id);
	}

	@Override
	public List<CategoryPrepa> getAllCategoryPrepas() {
		return categoryPrepaRepository.findAll();
	}

	/*Cross Class Queries*/

	public List<Prepa> searchProducts(String query) {
		return prepaRepository.search("%"+query+"%");
	}
	
	public List<Prepa> findPrepaByCategoryPrepa (CategoryPrepa categoryPrepa){
		List<Prepa> prepasCategoryPrepa = prepaRepository.findByCategoryPrepa(categoryPrepa);
		return prepasCategoryPrepa;
	}
	
	

	public List<Prepa> searchPrepas(String query) {
		return prepaRepository.search("%"+query+"%");
	}
	
	public List<Prepa> findPrepatByCategoryPrepa (CategoryPrepa categoryPrepa){
		List<Prepa> prepasCategoryPrepa = prepaRepository.findByCategoryPrepa(categoryPrepa);
		return prepasCategoryPrepa;
	}
}
