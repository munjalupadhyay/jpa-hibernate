package com.example.demo;

import com.example.demo.pojo.AccessCard;
import com.example.demo.pojo.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManagerFactory;

@SpringBootApplication
public class DemoApplication {
	// http://localhost:8080/h2-console

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
