package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Producteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducteurRepository extends JpaRepository<Producteur, Long> {

}
