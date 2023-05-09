package com.krishantha.rentcloud.authorizationserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishantha.rentcloud.authorizationserver.model.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long> {

}
