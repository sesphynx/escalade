package org.nioun.essentials.machinter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.nioun.essentials.machinter.model.ProspectExcell;

@Repository
public interface ProspectExcellRepository extends JpaRepository<ProspectExcell, Long> {


}
