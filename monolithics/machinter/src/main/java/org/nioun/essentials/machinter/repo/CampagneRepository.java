package org.nioun.essentials.machinter.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.nioun.essentials.machinter.model.Campagne;

@Repository
public interface CampagneRepository extends JpaRepository<Campagne, Long> {

}
