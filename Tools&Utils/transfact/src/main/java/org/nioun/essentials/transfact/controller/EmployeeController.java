package org.nioun.essentials.transfact.controller;

import javax.transaction.Transactional;

import org.nioun.essentials.transfact.service.EmployeeService;
import org.nioun.essentials.transfact.vo.EmployeeRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employee")
	@Transactional
	public String saveEmployee(@RequestBody  EmployeeRequestVO employeeRequestVO) {
		return employeeService.saveEmployee(employeeRequestVO);
	}

}
