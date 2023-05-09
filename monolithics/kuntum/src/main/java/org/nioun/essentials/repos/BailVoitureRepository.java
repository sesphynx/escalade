package org.nioun.essentials.repos;

import org.nioun.essentials.entities.BailVoiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BailVoitureRepository extends JpaRepository<BailVoiture , Long> {

}
