package org.nioun.essentials.chapiteauservice.repos;

import org.nioun.essentials.niounsocial.Chapiteau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapiteauRepository extends JpaRepository<Chapiteau, Long> {

}
