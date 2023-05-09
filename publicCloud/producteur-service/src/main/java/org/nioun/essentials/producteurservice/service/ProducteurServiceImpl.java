
package org.nioun.essentials.producteurservice.service;

import java.util.List;

import org.nioun.essentials.producteurservice.repos.ProducteurRepository;
import org.nioun.essentials.niouncommerce.Producteur;
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

	public Producteur saveProducteur(Producteur producteur) {

		return producteurRepository.save(producteur);
	}


	public Producteur updateProducteur(Producteur producteur) {
		return producteurRepository.save(producteur);
	}

	
	public void deleteProducteur(Producteur producteur) {
    producteurRepository.delete(producteur);

	}

	public Producteur getProducteurById(Long id) {
		return producteurRepository.getOne(id);
	}

	public List<Producteur> getAllProducteurs() {
		return producteurRepository.findAll();
	}


}
