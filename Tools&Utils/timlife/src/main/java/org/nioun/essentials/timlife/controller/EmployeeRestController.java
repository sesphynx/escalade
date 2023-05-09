package org.nioun.essentials.timlife.controller;



import org.nioun.essentials.timlife.model.Employee;
import org.nioun.essentials.timlife.model.PagingRequest;
import org.nioun.essentials.timlife.model.paging.Page;
import org.nioun.essentials.timlife.model.paging.PageArray;
import org.nioun.essentials.timlife.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("employees")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Page<Employee> list(@RequestBody PagingRequest pagingRequest) {
        return employeeService.getEmployees(pagingRequest);
    }

    @PostMapping("/array")
    public PageArray array(@RequestBody PagingRequest pagingRequest) {
        return employeeService.getEmployeesArray(pagingRequest);
    }
}
	

