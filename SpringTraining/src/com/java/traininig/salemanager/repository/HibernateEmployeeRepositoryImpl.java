package com.java.traininig.salemanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.java.training.salemanager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository{

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees=new ArrayList<>();
		Employee employee=new Employee();
		employee.setEmployeeName("Jothi");
		employee.setEmployeeLocation("Badulla");
		employees.add(employee);
		
		return employees;
	}

}
