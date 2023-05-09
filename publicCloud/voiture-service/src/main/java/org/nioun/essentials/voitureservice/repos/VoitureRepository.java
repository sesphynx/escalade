package org.nioun.essentials.voitureservice.repos;

import org.nioun.essentials.niountransport.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {

}
