package com.in28minutes.jpa.demo;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.demo.entity.FullTimeEmployee;
import com.in28minutes.jpa.demo.entity.PartTimeEmployee;
import com.in28minutes.jpa.demo.repository.EmployeeRepository;


@SpringBootApplication
public class DemoJpaInheritenceApplication implements CommandLineRunner {
	
	Logger log = org.slf4j.LoggerFactory.getLogger(DemoJpaInheritenceApplication.class);
	
	
	
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaInheritenceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeRepository.insertEmployee(new FullTimeEmployee("Mike", new BigDecimal(10000)));
		employeeRepository.insertEmployee(new PartTimeEmployee("Jill", new BigDecimal(50)));
		
		log.info("*************** All Employees {}",employeeRepository.retriveEmployees());
	}

}
