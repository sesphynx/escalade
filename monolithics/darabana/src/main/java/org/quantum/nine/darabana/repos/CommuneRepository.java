package org.quantum.nine.darabana.repos;

import org.quantum.nine.darabana.entities.Commune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommuneRepository extends JpaRepository<Commune,Long> {

	Commune findByNom(String nom) ;
}
