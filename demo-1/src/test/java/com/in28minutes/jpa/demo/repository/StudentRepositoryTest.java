package com.in28minutes.jpa.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.in28minutes.jpa.demo.DemoJpaApplication;
import com.in28minutes.jpa.demo.entity.Student;


@RunWith(JUnitPlatform.class)
@SpringBootTest(classes=DemoJpaApplication.class)
public class StudentRepositoryTest {
	
	private static final Logger log = LoggerFactory.getLogger(StudentRepositoryTest.class);
	 
	@Autowired
	EntityManager em;
	

	@Test
	@Transactional
	public void fetchStudentAndPassword() {
		Student student = em.find(Student.class,20001L);
		log.info("Student info :: {}"+student);
		log.info("passport info:: {}",student.getPassport());		
	}
	
	
	@Test
	@Transactional
	public void retriveStudentAndCourses() {
		Student student = em.find(Student.class,20001L);
		log.info("Student info :: {}"+student);
		log.info("passport info:: {}",student.getCourses());		
	}
	

}
