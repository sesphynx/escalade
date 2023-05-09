package org.nioun.essentials.machinter.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.nioun.essentials.machinter.service.RoleService;
import org.nioun.essentials.machinter.model.Role;
import org.nioun.essentials.machinter.repo.RoleRepository;

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
