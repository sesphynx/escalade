package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role , Long> {

}
