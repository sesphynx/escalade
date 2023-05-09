package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Voiturage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoiturageRepository extends JpaRepository<Voiturage , Long> {

}
