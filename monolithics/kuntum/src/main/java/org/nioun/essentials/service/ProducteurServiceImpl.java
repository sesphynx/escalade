package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Producteur;
import org.nioun.essentials.repos.ProducteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducteurServiceImpl implements ProducteurService {

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


}
