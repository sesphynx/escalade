package org.quantum.nine.magma.resto.service;

import java.util.List; 

import org.quantum.nine.magma.resto.entities.Role;

public interface RoleService {

	Role saveRole(Role role);

	Role updateRole(Role role);

	void deleteRole(Role role);

	Role getRoleById(Long id);

	List<Role> getAllRoles();
	
}
