package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Acquisition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcquisitionRepository extends JpaRepository<Acquisition, Long> {

}
