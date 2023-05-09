package org.nioun.essentials.repos;

import java.util.List;

import org.nioun.essentials.entities.Category;
import org.nioun.essentials.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
	Produit findByName(String name);

	Produit findBySku(String sku);
	@Query("select p from Produit p where p.name like ?1 or p.sku like ?1 or p.description like ?1")
	List<Produit> search(String query);
	
List<Produit> findByCategory(Category category);

}
