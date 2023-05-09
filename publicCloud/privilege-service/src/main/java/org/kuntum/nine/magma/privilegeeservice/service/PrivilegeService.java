package org.kuntum.nine.magma.privilegeeservice.service;

import java.util.List;

import org.nioun.essentials.core.niounmodel.*;

public interface PrivilegeService {


	Privilege savePrivilege(Privilege addresse);

	Privilege updatePrivilege(Privilege addresse);

	void deletePrivilege(Privilege addresse);

	Privilege getPrivilegeById(Long id);

	List<Privilege> getAllPrivileges();
}
