package org.nioun.essentials.produitservice.repos;

import org.nioun.essentials.niouncommerce.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
