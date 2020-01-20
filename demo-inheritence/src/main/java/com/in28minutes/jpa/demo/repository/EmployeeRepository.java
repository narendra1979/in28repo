package com.in28minutes.jpa.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.jpa.demo.entity.Employee;

@Repository
@Transactional
public class EmployeeRepository {

	@Autowired
	EntityManager em;
	
	public void  insertEmployee(Employee e) {
		 em.persist(e);
	}
	
	
	public List<Employee>  retriveEmployees() {
		Query createQuery = em.createQuery("select e from Employee e");
		 return createQuery.getResultList();
	}
	
	
}
