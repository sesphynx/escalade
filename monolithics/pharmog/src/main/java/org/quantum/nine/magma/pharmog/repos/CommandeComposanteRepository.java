package org.quantum.nine.magma.pharmog.repos;

import org.quantum.nine.magma.pharmog.entities.CommandeComposante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.quantum.nine.magma.pharmog.entities.Commande;
import java.util.List;
import org.quantum.nine.magma.pharmog.entities.Produit;

@Repository
public interface CommandeComposanteRepository extends JpaRepository<CommandeComposante, Long> {

	
	List<CommandeComposante> findByCommande(Commande commande);
	
	List<CommandeComposante> findByProduit(Produit produit);
}
