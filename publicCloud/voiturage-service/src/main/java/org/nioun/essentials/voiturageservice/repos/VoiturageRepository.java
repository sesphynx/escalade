package org.nioun.essentials.voiturageservice.repos;

import org.nioun.essentials.niountransport.Voiturage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoiturageRepository extends JpaRepository<Voiturage, Long> {

}
