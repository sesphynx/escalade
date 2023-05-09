package org.quantum.nine.magma.pharmog.repos;

import org.quantum.nine.magma.pharmog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	Category getCategoryByName(String name);

}
