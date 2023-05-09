package org.nioun.essentials.paiement.repository;

import org.nioun.essentials.paiement.model.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement, Long>{

}
