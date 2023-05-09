package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	Category getByName(String name);

}
