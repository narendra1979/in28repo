package com.in28minutes.jpa.demo;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.demo.entity.Course;
import com.in28minutes.jpa.demo.repository.CourseRepository;


@SpringBootApplication
public class DemoJpaApplication implements CommandLineRunner {
	
	Logger log = org.slf4j.LoggerFactory.getLogger(DemoJpaApplication.class);
	
	@Autowired
	CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//log.info("All Users :: {}"+ repository.findAll());
		
		log.info("Get Course by Id :: {} "+ repository.findById(10002l));
		
		log.info("Insert Person :: {} "+ repository.insertCourse(new Course("Allen")));
		
		
	}

}
