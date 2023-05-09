package org.quantum.nine.darabana.repos;

import org.quantum.nine.darabana.entities.Daara;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaaraRepository extends JpaRepository  <Daara,Long > {
	
	
}
