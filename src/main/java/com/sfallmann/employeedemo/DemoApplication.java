package com.sfallmann.employeedemo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sfallmann.employeedemo.models.Employee;
import com.sfallmann.employeedemo.repositories.EmployeeRepository;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Bean
	InitializingBean seedDatabase() {
		return () -> {
			employeeRepository.save(new Employee("John", "Doe"));
			employeeRepository.save(new Employee("Sean", "Fallmann"));
		};
	}
}
