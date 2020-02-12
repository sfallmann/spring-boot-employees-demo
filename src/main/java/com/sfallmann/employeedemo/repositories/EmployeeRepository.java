package com.sfallmann.employeedemo.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sfallmann.employeedemo.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	List<Employee> findAll();
	
	Employee findById(int id);
}
