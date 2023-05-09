package org.nioun.essentials.commandeservice.repos;

import org.nioun.essentials.niouncommerce.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {

}
