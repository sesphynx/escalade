package org.nioun.essentials.categoryservice.repos;

import org.nioun.essentials.niouncommerce.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
