package org.nioun.essentials.repos;

import org.nioun.essentials.entities.BailLogis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BailLogisRepository extends JpaRepository<BailLogis , Long> {

}
