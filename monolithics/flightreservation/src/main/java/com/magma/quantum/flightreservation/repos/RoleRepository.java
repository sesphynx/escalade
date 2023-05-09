package com.magma.quantum.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magma.quantum.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
