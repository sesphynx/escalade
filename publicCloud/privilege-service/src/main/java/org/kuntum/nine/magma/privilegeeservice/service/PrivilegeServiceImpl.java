package org.kuntum.nine.magma.privilegeeservice.service;

import java.util.List;

import org.kuntum.nine.magma.privilegeeservice.repos.PrivilegeRepository;
import org.nioun.essentials.core.niounmodel.Privilege;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrivilegeServiceImpl implements PrivilegeService {

	@Autowired
	PrivilegeRepository privilegeRepository ;
	
	

	public PrivilegeRepository getPrivilegeRepository() {
		return privilegeRepository;
	}

	public void setPrivilegeRepository(PrivilegeRepository privilegeRepository) {
		this.privilegeRepository = privilegeRepository;
	}

	@Override
	public Privilege savePrivilege(Privilege privilege) {

		return privilegeRepository.save(privilege);
	}

	@Override
	public Privilege updatePrivilege(Privilege privilege) {
		return privilegeRepository.save(privilege);
	}

	@Override
	public void deletePrivilege(Privilege privilege) {
    privilegeRepository.delete(privilege);

	}

	@Override
	public Privilege getPrivilegeById(Long id) {
		return privilegeRepository.getOne(id);
	}

	@Override
	public List<Privilege> getAllPrivileges() {
		return privilegeRepository.findAll();
	}


}
