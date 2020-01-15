package com.in28minutes.jpa.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.jpa.demo.entity.Passport;
import com.in28minutes.jpa.demo.entity.Student;

@Repository
@Transactional
public class StudentRepository {

	@Autowired
	EntityManager em;
	
	public Student findById(Long id) {
		return em.find(Student.class, id);
	}
	
	public void deleteById(Long id) {
		em.remove(id);
	}
	
	public Student insertStudent(Student c) {
		return em.merge(c);
	}
	
	public Student updateStudent(Student c) {
		return em.merge(c);
	}
	
	public void studentWithPasswordId() {
		Passport passport = new Passport();
		passport.setNumber("Z231423");
		em.persist(passport);
		
		Student student = new Student();
		student.setName("Mike");
		student.setPassport(passport);
		em.persist(student);
	}
}
