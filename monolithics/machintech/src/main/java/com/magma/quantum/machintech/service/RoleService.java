package com.magma.quantum.machintech.service;

import java.util.List;

import com.magma.quantum.machintech.entities.Role;


public interface RoleService {
	
	Role saveRole(Role role);

	Role updateRole(Role role);

	void deleteRole(Role role);

	Role getRoleById(Long id);

	List<Role> getAllRoles();

}
