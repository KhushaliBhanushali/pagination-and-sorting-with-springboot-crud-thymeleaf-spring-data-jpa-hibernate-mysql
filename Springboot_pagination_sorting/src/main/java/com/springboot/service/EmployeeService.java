package com.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.springboot.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(Integer id);
	
	void deleteEmployeeById(Integer id);
	
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
