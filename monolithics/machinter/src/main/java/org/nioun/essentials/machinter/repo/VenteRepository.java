package org.nioun.essentials.machinter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.nioun.essentials.machinter.model.Vente;

@Repository
public interface VenteRepository extends JpaRepository<Vente, Long> {

}
