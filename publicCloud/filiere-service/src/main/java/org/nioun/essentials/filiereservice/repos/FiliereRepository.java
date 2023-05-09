package org.nioun.essentials.filiereservice.repos;

import org.nioun.essentials.niouncore.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiliereRepository extends JpaRepository<Filiere, Long> {

}
