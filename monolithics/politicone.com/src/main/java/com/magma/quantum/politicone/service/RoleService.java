package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Role;

public interface RoleService {

	Role saveRole(Role role);

	Role updateRole(Role role);

	void deleteRole(Role role);

	Role getRoleById(Long id);

	List<Role> getAllRoles();
	
}
