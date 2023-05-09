package org.quantum.nine.magma.resto.repos;

import org.quantum.nine.magma.resto.entities.CommandeComposante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeComposanteRepository extends JpaRepository<CommandeComposante, Long> {

}
