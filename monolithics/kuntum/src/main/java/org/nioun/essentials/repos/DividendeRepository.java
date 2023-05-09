package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Dividende;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DividendeRepository extends JpaRepository<Dividende, Long> {

}
