package org.nioun.essentials.livreur.repository;

import org.nioun.essentials.livreur.model.Livreur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreurRepository extends JpaRepository<Livreur, Long> {

Livreur	findByFirstNameAndLastName(String firstName, String lastName);
	
}
