package org.quantum.nine.magma.pharmog.repos;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.CategoryPrepa;
import org.quantum.nine.magma.pharmog.entities.Prepa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PrepaRepository extends JpaRepository<Prepa, Long> {
	
	Prepa findByName(String name);

	Prepa findBySku(String sku);
	@Query("select p from Prepa p where p.name like ?1 or p.sku like ?1 or p.description like ?1")
	List<Prepa> search(String query);
	
List<Prepa> findByCategoryPrepa(CategoryPrepa categoryPrepa);

}
