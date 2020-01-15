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
import com.in28minutes.jpa.demo.entity.Course;
import com.in28minutes.jpa.demo.entity.Review;
import com.in28minutes.jpa.demo.entity.Student;


@RunWith(JUnitPlatform.class)
@SpringBootTest(classes=DemoJpaApplication.class)
public class CourseRepositoryTest {
	
	private static final Logger log = LoggerFactory.getLogger(CourseRepositoryTest.class);
	 
	@Autowired
	CourseRepository repository;
	
	@Autowired
	EntityManager em;
	

	@Test
	@Transactional
	public void fetchReviewsbycourse() {
		Course course = repository.findById(10001L);
		log.info("Course Info:: {}"+course);
		log.info("reviews :: {}",course.getReviews());		
	}
	
	
	
	@Test
	@Transactional
	public void fetchCourseWithReviews() {
		Review  review = em.find(Review.class,50001L);
		log.info("Course Info:: {}"+review);
		log.info("reviews :: {}",review.getCourse());		
	}
	
	
	@Test
	@Transactional
	public void retriveStudentAndCourses() {
		Course course = em.find(Course.class,20001L);
		log.info("Student info :: {}"+course);
		log.info("passport info:: {}",course.getStudents());		
	}
	

}
