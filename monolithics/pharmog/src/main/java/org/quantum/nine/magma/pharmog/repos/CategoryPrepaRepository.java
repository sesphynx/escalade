package org.quantum.nine.magma.pharmog.repos;

import org.quantum.nine.magma.pharmog.entities.CategoryPrepa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryPrepaRepository extends JpaRepository<CategoryPrepa, Long> {
	
	CategoryPrepa getByName(String name);

}
