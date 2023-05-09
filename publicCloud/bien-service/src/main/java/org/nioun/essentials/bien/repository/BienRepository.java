package org.nioun.essentials.bien.repository;

import org.nioun.essentials.bien.model.Bien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BienRepository extends JpaRepository<Bien, Long> {

	Bien findByNameAndDescription(String name, String description);

}
