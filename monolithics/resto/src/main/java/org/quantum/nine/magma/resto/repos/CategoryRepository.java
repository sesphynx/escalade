package org.quantum.nine.magma.resto.repos;

import org.quantum.nine.magma.resto.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	Category getByName(String name);

}
