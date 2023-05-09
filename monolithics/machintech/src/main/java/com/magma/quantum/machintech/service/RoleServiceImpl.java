package com.magma.quantum.machintech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.machintech.entities.Role;
import com.magma.quantum.machintech.repos.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;
	
	/**
	 * @return the roleRepository
	 */
	public RoleRepository getRoleRepository() {
		return roleRepository;
	}

	/**
	 * @param roleRepository the roleRepository to set
	 */
	public void setRoleRepository(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}


	public Role saveRole(Role role) {
		return roleRepository .save(role);
	}


	public Role updateRole(Role role) {
		return roleRepository.save(role) ;
	}


	public void deleteRole(Role role) {
		roleRepository.delete(role);
	}


	public Role getRoleById(Long id) {
		return roleRepository.getOne(id);
	}


	public List<Role> getAllRoles() {
		return roleRepository.findAll() ;
	}

}
