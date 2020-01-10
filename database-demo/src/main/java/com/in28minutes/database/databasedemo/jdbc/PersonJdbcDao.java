package com.in28minutes.database.databasedemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Person> findAll() {
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person findById(int id) {
		return jdbcTemplate.queryForObject("select * from person where id=?", new Object[] {id},
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person findByName(String name) {
		return jdbcTemplate.queryForObject("select * from person where name=?", new Object[] {name},
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public int deleteById(int id) {
		return jdbcTemplate.update("delete from person where id=?", new Object[] {id});
	}
	
	public int insertPerson(Person p) {
		return jdbcTemplate.update(
				"insert into person (id,name,location,birth_date)"  
				+ "values (?,?,?,?)", new Object[] {p.getId(),p.getName(),p.getLocation(), p.getBirth_date()});
	}
	
	
	public int updatePerson(Person p) {
		return jdbcTemplate.update(
				"update person set name = ? , location = ? , birth_date = ? "  
				+ "where id = ? ", new Object[] {p.getName(),p.getLocation(), p.getBirth_date(),p.getId()});
	}
	
	
}
