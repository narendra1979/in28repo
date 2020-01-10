package com.in28minutes.database.databasedemo.jdbc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class PersonJpaRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Person> findAll() {
		TypedQuery<Person> createNamedQuery = entityManager.createNamedQuery("find_all_persons",Person.class);
		return createNamedQuery.getResultList();
	}

	public Person findById(int id) {
		return entityManager.find(Person.class,id);
	}
	
	public Person findByName(String name) {
		return entityManager.find(Person.class, name);
	}
	
	public void deleteById(int id) {
		entityManager.remove(id);
	}
	
	public Person insertPerson(Person p) {
		return entityManager.merge(p);
	}
	
	public Person updatePerson(Person p) {
		return entityManager.merge(p);
				
	}
}
