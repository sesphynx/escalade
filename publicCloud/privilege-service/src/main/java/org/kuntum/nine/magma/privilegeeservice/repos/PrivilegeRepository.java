package org.kuntum.nine.magma.privilegeeservice.repos;

import org.nioun.essentials.core.niounmodel.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {

}
