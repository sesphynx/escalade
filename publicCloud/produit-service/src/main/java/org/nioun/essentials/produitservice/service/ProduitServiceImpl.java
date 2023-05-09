
package org.nioun.essentials.produitservice.service;

import java.util.List;

import org.nioun.essentials.niouncommerce.Produit;
import org.nioun.essentials.produitservice.repos.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	ProduitRepository produitRepository ;
	
	

	public ProduitRepository getProduitRepository() {
		return produitRepository;
	}

	public void setProduitRepository(ProduitRepository produitRepository) {
		this.produitRepository = produitRepository;
	}

	public Produit saveProduit(Produit produit) {

		return produitRepository.save(produit);
	}


	public Produit updateProduit(Produit produit) {
		return produitRepository.save(produit);
	}

	
	public void deleteProduit(Produit produit) {
    produitRepository.delete(produit);

	}

	public Produit getProduitById(Long id) {
		return produitRepository.getOne(id);
	}

	public List<Produit> getAllProduits() {
		return produitRepository.findAll();
	}


}
