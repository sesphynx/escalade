package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Logis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogisRepository extends JpaRepository<Logis, Long> {

}
