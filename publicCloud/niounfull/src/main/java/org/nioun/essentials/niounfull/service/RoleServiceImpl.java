package org.nioun.essentials.niounfull.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.nioun.essentials.niounfull.model.Role;
import org.nioun.essentials.niounfull.repositories.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository ;
	
	

	public RoleRepository getRoleRepository() {
		return roleRepository;
	}

	public void setRoleRepository(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	@Override
	public Role saveRole(Role role) {

		return roleRepository.save(role);
	}

	@Override
	public Role updateRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public void deleteRole(Role role) {
    roleRepository.delete(role);

	}

	@Override
	public Role getRoleById(Long id) {
		return roleRepository.getOne(id);
	}

	@Override
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}


}
