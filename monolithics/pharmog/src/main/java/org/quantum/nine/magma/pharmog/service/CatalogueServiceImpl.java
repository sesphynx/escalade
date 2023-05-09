package org.quantum.nine.magma.pharmog.service;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Category;
import org.quantum.nine.magma.pharmog.entities.Producteur;
import org.quantum.nine.magma.pharmog.entities.Produit;
import org.quantum.nine.magma.pharmog.repos.CategoryRepository;
import org.quantum.nine.magma.pharmog.repos.ProducteurRepository;
import org.quantum.nine.magma.pharmog.repos.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogueServiceImpl implements CatalogueService {
	
	@Autowired
	public ProduitRepository produitRepository ;
	
	

	public ProduitRepository getProduitRepository() {
		return produitRepository;
	}

	public void setProduitRepository(ProduitRepository produitRepository) {
		this.produitRepository = produitRepository;
	}

	@Override
	public Produit saveProduit(Produit produit) {

		return produitRepository.save(produit);
	}

	@Override
	public Produit updateProduit(Produit produit) {
		return produitRepository.save(produit);
	}

	@Override
	public void deleteProduit(Produit produit) {
    produitRepository.delete(produit);

	}

	@Override
	public Produit getProduitById(Long id) {
		return produitRepository.getOne(id);
	}

	@Override
	public List<Produit> getAllProduits() {
		return produitRepository.findAll();
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

	@Override
	public Producteur saveProducteur(Producteur producteur) {

		return producteurRepository.save(producteur);
	}

	@Override
	public Producteur updateProducteur(Producteur producteur) {
		return producteurRepository.save(producteur);
	}

	@Override
	public void deleteProducteur(Producteur producteur) {
    producteurRepository.delete(producteur);

	}

	@Override
	public Producteur getProducteurById(Long id) {
		return producteurRepository.getOne(id);
	}

	@Override
	public List<Producteur> getAllProducteurs() {
		return producteurRepository.findAll();
	}
	
	/*Category's du Catalogue*/
	
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

	public List<Produit> searchProducts(String query) {
		return produitRepository.search("%"+query+"%");
	}
	
	public List<Produit> findProduitByCategory (Category category){
		List<Produit> produitsCategory = produitRepository.findByCategory(category);
		return produitsCategory;
	}
	
	public List<Produit> findProduitByProducteur (Producteur producteur){
		List<Produit> produitsProducteur = produitRepository.findByProducteur(producteur);
		return produitsProducteur;
	}

}
