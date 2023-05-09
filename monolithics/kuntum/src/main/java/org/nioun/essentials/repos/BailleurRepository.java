package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Bailleur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BailleurRepository extends JpaRepository<Bailleur, Long> {

}
