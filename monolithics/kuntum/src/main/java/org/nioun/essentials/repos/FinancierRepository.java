package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Financier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancierRepository extends JpaRepository<Financier , Long> {

}
