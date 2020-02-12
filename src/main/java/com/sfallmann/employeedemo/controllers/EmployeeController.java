package com.sfallmann.employeedemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfallmann.employeedemo.models.Employee;
import com.sfallmann.employeedemo.repositories.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping("/employees")
	public List<Employee> employees() {
		return employeeRepository.findAll();
	}
	
	@RequestMapping("/employees/{id}")
	public Employee employeeById(@PathVariable("id") int id) {
		return employeeRepository.findById(id);
	}
}
