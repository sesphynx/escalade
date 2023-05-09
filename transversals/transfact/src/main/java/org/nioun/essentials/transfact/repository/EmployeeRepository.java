package org.nioun.essentials.transfact.repository;

import org.nioun.essentials.transfact.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Employee findByEmpName(String empName);

}
