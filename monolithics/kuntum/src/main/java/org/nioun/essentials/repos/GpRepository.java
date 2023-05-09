package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Gp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GpRepository extends JpaRepository<Gp, Long> {

}
