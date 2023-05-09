package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.Role;
import com.magma.quantum.corniche.repos.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleRepository roleRepository;
	
	
	
	public RoleRepository getRoleRepository() {
		return roleRepository;
	}

	public void setRoleRepository(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	
	public Role saveRole(Role role) {
	
		return roleRepository.save(role);
	}

	
	public Role updateRole(Role role) {

		return roleRepository.save(role);
	}

	
	public void deleteRole(Role role) {
roleRepository.delete(role);

	}

	
	public Role getRole(Long id) {
	
		return roleRepository.getOne(id);
	}

	
	public List<Role> getAllRoles() {

		return roleRepository.findAll();
	}

}
