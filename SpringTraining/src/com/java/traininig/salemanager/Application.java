package com.java.traininig.salemanager;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.training.salemanager.model.Employee;
import com.java.traininig.salemanager.service.EmployeeService;


public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService emplyeeService = applicationContext
				.getBean("employeeService",EmployeeService.class);
		List<Employee> employees=emplyeeService.getAllEmployees();
		for (Employee employee : employees) {
			System.out.println(employee.getEmployeeName() +" at "+ employee.getEmployeeLocation());
			
		}

	}

}
