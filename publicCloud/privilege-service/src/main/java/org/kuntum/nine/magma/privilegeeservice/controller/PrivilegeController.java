package org.kuntum.nine.magma.privilegeeservice.controller;

import java.util.List;

import org.kuntum.nine.magma.privilegeeservice.service.PrivilegeService;
import org.nioun.essentials.core.niounmodel.Privilege;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class PrivilegeController {
	
	@Autowired
	PrivilegeService privilegeService ;
	
	@RequestMapping(value = "/privilege" , method = RequestMethod.POST)
	Privilege save ( @RequestBody Privilege privilege){
		return privilegeService.savePrivilege(privilege) ;
	}

	@RequestMapping(value="/privilege" , method = RequestMethod.GET)
	Privilege fetch(@RequestParam Long privilegeId){
		return privilegeService.getPrivilegeById(privilegeId);
	}
	
	@RequestMapping(value="/privileges" , method = RequestMethod.GET)
	List<Privilege> fetch(){
		return privilegeService.getAllPrivileges();
	}
	
}
