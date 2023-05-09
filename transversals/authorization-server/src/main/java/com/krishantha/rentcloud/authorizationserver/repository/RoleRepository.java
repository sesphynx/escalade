package com.krishantha.rentcloud.authorizationserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishantha.rentcloud.authorizationserver.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
