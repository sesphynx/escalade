package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Bail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BailRepository extends JpaRepository<Bail , Long> {

}
