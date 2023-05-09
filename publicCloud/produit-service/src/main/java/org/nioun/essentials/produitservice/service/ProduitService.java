package org.nioun.essentials.produitservice.service;

import java.util.List;

import org.nioun.essentials.niouncommerce.*;

public interface ProduitService {


	Produit saveProduit(Produit produit);

	Produit updateProduit(Produit produit);

	void deleteProduit(Produit produit);

	Produit getProduitById(Long id);

	List<Produit> getAllProduits();
}
