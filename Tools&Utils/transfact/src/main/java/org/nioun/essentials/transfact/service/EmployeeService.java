package org.nioun.essentials.transfact.service;

import org.nioun.essentials.transfact.model.Departement;
import org.nioun.essentials.transfact.model.Employee;
import org.nioun.essentials.transfact.repository.DepartementRepository;
import org.nioun.essentials.transfact.repository.EmployeeRepository;
import org.nioun.essentials.transfact.vo.EmployeeRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartementRepository departementRepository;
	
	
	
	public String saveEmployee(EmployeeRequestVO employeeRequestVO) {
		
		Departement departement = new Departement();
		departement.setDepartementName(employeeRequestVO.getDepartementName());
		departement.setDepartementCode(employeeRequestVO.getDepartementName());
	Long departementId = departementRepository.save(departement)
			                                  .getDepartementId();
		
	   Employee employee = new Employee();
	   employee.setDepartementId(departementId);
	   employee.setEmpName(employeeRequestVO.getEmpName());
	   employee.setEmail(employeeRequestVO.getEmail());
	   
	   employeeRepository.save(employee);
		
		return "Employee is saved with id :" + employee.getEmployeeId();
	}

}
