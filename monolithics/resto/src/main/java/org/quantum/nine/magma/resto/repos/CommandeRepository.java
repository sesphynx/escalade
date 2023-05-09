package org.quantum.nine.magma.resto.repos;

import org.quantum.nine.magma.resto.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<Commande,Long> {

}
