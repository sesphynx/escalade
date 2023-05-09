package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepository  extends JpaRepository<Voiture , Long>{

}
