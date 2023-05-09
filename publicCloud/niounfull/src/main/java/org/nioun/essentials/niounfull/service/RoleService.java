package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Role;

public interface RoleService {

	Role saveRole(Role role);

	Role updateRole(Role role);

	void deleteRole(Role role);

	Role getRoleById(Long id);

	List<Role> getAllRoles();
	
}
