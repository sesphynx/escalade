package org.quantum.nine.magma.resto.repos;

import java.util.List;


import org.quantum.nine.magma.resto.entities.Category;
import org.quantum.nine.magma.resto.entities.Plat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PlatRepository extends JpaRepository<Plat, Long> {
	
	Plat findByName(String name);

	Plat findBySku(String sku);
	@Query("select p from Plat p where p.name like ?1 or p.sku like ?1 or p.description like ?1")
	List<Plat> search(String query);
	
List<Plat> findByCategory(Category category);

}
