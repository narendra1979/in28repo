package com.in28minutes.jpa.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.in28minutes.jpa.demo.DemoJpaInheritenceApplication;
import com.in28minutes.jpa.demo.entity.Employee;


//@RunWith(SpringRunner.class)
@RunWith(JUnitPlatform.class)
@SpringBootTest(classes=DemoJpaInheritenceApplication.class)
public class JpqlRepositoryTest {
	
	private static final Logger log = LoggerFactory.getLogger(JpqlRepositoryTest.class);
	 
	@Autowired
	EntityManager em;
	

	@Test
	public void jpql_query() {
		Query createQuery = em.createNamedQuery("query_all_courses");
		log.info("query_all_courses :: {}",createQuery.getResultList());		
	}
	
	@Test
	public void jpql_typedQuery() {
		TypedQuery<Employee> createQuery = em.createNamedQuery("query_all_courses",Employee.class);
		log.info("Using Typed Query :: SELECT c FROM Course  :: {}",createQuery.getResultList());		
	}
	
	@Test
	public void jpql_where() {
		TypedQuery<Employee> createQuery = em.createNamedQuery("query_course_for_id",Employee.class);
		createQuery.setParameter("id", 1l);
		
		log.info("Using Typed Query WHERE :: SELECT c FROM Course  :: {}",createQuery.getResultList());		
	}

}
