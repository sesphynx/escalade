package org.nioun.essentials.timlife.service;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.nioun.essentials.timlife.model.Column;
import org.nioun.essentials.timlife.model.Employee;
import org.nioun.essentials.timlife.model.EmployeeComparators;
import org.nioun.essentials.timlife.model.Order;
import org.nioun.essentials.timlife.model.PagingRequest;
import org.nioun.essentials.timlife.model.paging.Page;
import org.nioun.essentials.timlife.model.paging.PageArray;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service

public class EmployeeService {



	    private static final Comparator<Employee> EMPTY_COMPARATOR = (e1, e2) -> 0;

	    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

	    public PageArray getEmployeesArray(PagingRequest pagingRequest) {
	        pagingRequest.setColumns(Stream.of("name", "position", "office", "start_date", "salary")
	                                       .map(Column::new)
	                                       .collect(Collectors.toList()));
	        Page<Employee> employeePage = getEmployees(pagingRequest);

	        PageArray pageArray = new PageArray();
	        pageArray.setRecordsFiltered(employeePage.getRecordsFiltered());
	        pageArray.setRecordsTotal(employeePage.getRecordsTotal());
	        pageArray.setDraw(employeePage.getDraw());
	        pageArray.setData(employeePage.getData()
	                                      .stream()
	                                      .map(this::toStringList)
	                                      .collect(Collectors.toList()));
	        return pageArray;
	    }

	    private List<String> toStringList(Employee employee) {
	        return Arrays.asList(employee.getName(), employee.getPosition(), employee.getOffice(), sdf.format(employee.getStartDate()),
	                employee.getSalary()
	                        .toString());
	    }

	    public Page<Employee> getEmployees(PagingRequest pagingRequest) {
	        ObjectMapper objectMapper = new ObjectMapper();

	        try {
	            List<Employee> employees = objectMapper.readValue(getClass().getClassLoader()
	                                                                        .getResourceAsStream("employees.json"),
	                    new TypeReference<List<Employee>>() {
	                    });

	            return getPage(employees, pagingRequest);

	        } catch (IOException e) {
	            log.error(e.getMessage(), e);
	        }

	        return new Page<>();
	    }

	    private Page<Employee> getPage(List<Employee> employees, PagingRequest pagingRequest) {
	        List<Employee> filtered = employees.stream()
	                                           .sorted(sortEmployees(pagingRequest))
	                                           .filter(filterEmployees(pagingRequest))
	                                           .skip(pagingRequest.getStart())
	                                           .limit(pagingRequest.getLength())
	                                           .collect(Collectors.toList());

	        long count = employees.stream()
	                              .filter(filterEmployees(pagingRequest))
	                              .count();

	        Page<Employee> page = new Page<>(filtered);
	        page.setRecordsFiltered((int) count);
	        page.setRecordsTotal((int) count);
	        page.setDraw(pagingRequest.getDraw());

	        return page;
	    }

	    private Predicate<Employee> filterEmployees(PagingRequest pagingRequest) {
	        if (pagingRequest.getSearch() == null || StringUtils.isEmpty(pagingRequest.getSearch()
	                                                                                  .getValue())) {
	            return employee -> true;
	        }

	        String value = pagingRequest.getSearch()
	                                    .getValue();

	        return employee -> employee.getName()
	                                   .toLowerCase()
	                                   .contains(value)
	                || employee.getPosition()
	                           .toLowerCase()
	                           .contains(value)
	                || employee.getOffice()
	                           .toLowerCase()
	                           .contains(value);
	    }

	    private Comparator<Employee> sortEmployees(PagingRequest pagingRequest) {
	        if (pagingRequest.getOrder() == null) {
	            return EMPTY_COMPARATOR;
	        }

	        try {
	            Order order = pagingRequest.getOrder()
	                                       .get(0);

	            int columnIndex = order.getColumn();
	            Column column = pagingRequest.getColumns()
	                                         .get(columnIndex);

	            Comparator<Employee> comparator = EmployeeComparators.getComparator(column.getData(), order.getDir());
	            if (comparator == null) {
	                return EMPTY_COMPARATOR;
	            }

	            return comparator;

	        } catch (Exception e) {
	            log.error(e.getMessage(), e);
	        }

	        return EMPTY_COMPARATOR;
	    }
	}
	

