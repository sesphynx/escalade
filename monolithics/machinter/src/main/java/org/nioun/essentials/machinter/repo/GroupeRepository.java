package org.nioun.essentials.machinter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.nioun.essentials.machinter.model.Groupe;

@Repository
public interface GroupeRepository extends JpaRepository<Groupe, Long> {

}
