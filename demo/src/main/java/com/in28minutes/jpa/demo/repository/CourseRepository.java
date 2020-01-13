package com.in28minutes.jpa.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.jpa.demo.entity.Course;

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
}
