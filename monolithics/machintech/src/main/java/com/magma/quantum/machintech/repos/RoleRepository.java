package com.magma.quantum.machintech.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magma.quantum.machintech.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
