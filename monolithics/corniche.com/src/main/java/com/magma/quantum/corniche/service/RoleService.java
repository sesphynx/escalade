package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.Role;

public interface RoleService {
	Role saveRole(Role role);
	Role updateRole(Role role);
	void deleteRole(Role role);
	Role getRole(Long id);
	List<Role> getAllRoles();
}
