package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Promoteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromoteurRepository extends JpaRepository<Promoteur, Long> {

}
