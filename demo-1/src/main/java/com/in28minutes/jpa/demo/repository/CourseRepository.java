package com.in28minutes.jpa.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.jpa.demo.entity.Course;
import com.in28minutes.jpa.demo.entity.Review;

@Repository
@Transactional
public class CourseRepository {

	@Autowired
	EntityManager em;
	
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}
	
	public void deleteById(Long id) {
		em.remove(id);
	}
	
	public Course insertCourse(Course c) {
		return em.merge(c);
	}
	
	public Course updateCourse(Course c) {
		return em.merge(c);
	}
	
	public void addHardCodedReviws() {
		//retrive the course
		Course course = em.find(Course.class,10001l);
		
		//building the reviews
		Review review1 = new Review("5","Vergood!!");
		Review review2 = new Review("5","Hatts off!!");
		
		//establishing the relation
		review1.setCourse(course);
		review2.setCourse(course);
		
		//persist the reviews
		em.persist(review1);
		em.persist(review2);
		
	}
	
	
	public void addReviws(Long courseId,List<Review> reviews) {
		//retrive the course
		Course course = em.find(Course.class,courseId);
		
		for(Review review : reviews) {
			review.setCourse(course);
			em.persist(review);
		}
		
	}
	
	public void playWithEntityManager() {
		Course c = em.find(Course.class,10001l);
		String s = c.getName();
		c.setName(s+ " - Updated");
		em.merge(c);
	}
}
