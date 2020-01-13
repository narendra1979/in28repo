package com.in28minutes.jpa.demo.repository;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.in28minutes.jpa.demo.DemoJpaApplication;
import com.in28minutes.jpa.demo.entity.Course;

//@SpringBootTest(classes=DemoJpaApplication.class)
@RunWith(JUnitPlatform.class)
@SpringBootTest(classes=DemoJpaApplication.class)
public class DemoApplicationRepositoryTest {
	
	@Autowired
	CourseRepository repository;
	

	@Test
	public void contextLoads() {
		System.out.print("+++++++++++++++++++++++==");
		Course findById = repository.findById(10001l);
		System.out.println("*************" + findById);
		
	}

}
