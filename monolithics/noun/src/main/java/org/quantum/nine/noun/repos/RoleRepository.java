package org.quantum.nine.noun.repos;

import org.quantum.nine.noun.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role , Long> {

}
