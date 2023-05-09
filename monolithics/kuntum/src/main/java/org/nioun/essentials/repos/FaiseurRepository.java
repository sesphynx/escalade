package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Faiseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaiseurRepository extends JpaRepository<Faiseur, Long> {

}
