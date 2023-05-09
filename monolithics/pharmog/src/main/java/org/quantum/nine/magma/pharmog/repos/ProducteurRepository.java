package org.quantum.nine.magma.pharmog.repos;

import org.quantum.nine.magma.pharmog.entities.Producteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducteurRepository extends JpaRepository<Producteur, Long> {

	Producteur getProducteurByName(String name) ;
}
