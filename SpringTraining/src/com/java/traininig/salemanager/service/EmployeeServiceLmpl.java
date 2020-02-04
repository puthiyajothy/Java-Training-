package com.java.traininig.salemanager.service;

import java.util.List;

import com.java.training.salemanager.model.Employee;
import com.java.traininig.salemanager.repository.EmployeeRepository;

public class EmployeeServiceLmpl {
	
	private EmployeeRepository employeeRepository;

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees() {

		return employeeRepository.getAllEmployees();

	}

}
