package com.in28minutes.jpa.demo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.demo.entity.Course;
import com.in28minutes.jpa.demo.entity.Review;
import com.in28minutes.jpa.demo.repository.CourseRepository;
import com.in28minutes.jpa.demo.repository.StudentRepository;


@SpringBootApplication
public class DemoJpaApplication implements CommandLineRunner {
	
	Logger log = org.slf4j.LoggerFactory.getLogger(DemoJpaApplication.class);
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//studentRepository.studentWithPasswordId();
		//log.info("All Users :: {}"+ repository.findAll());
		//log.info("Get Course by Id :: {} "+ repository.findById(10002l));
		//log.info("Insert Person :: {} "+ repository.insertCourse(new Course("Spring with 50 steps")));
		
		//repository.playWithEntityManager();
		
		//courseRepository.addHardCodedReviws();
		List<Review> reviews = new ArrayList<>();
			Review review1 = new Review("5","Vergood!!");
			Review review2 = new Review("5","Hatts off!!");
		
		courseRepository.addReviws(10001L,reviews);
	}

}
