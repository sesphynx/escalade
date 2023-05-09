package org.nioun.essentials.bailvoitureservice.repos;

import org.nioun.essentials.niountransport.BailVoiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BailVoitureRepository extends JpaRepository<BailVoiture, Long> {

}
