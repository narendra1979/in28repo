package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.h2.command.CommandInterface;
import org.junit.platform.commons.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.jdbc.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {
	
	Logger log = org.slf4j.LoggerFactory.getLogger(SpringJdbcDemoApplication.class);
	
	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("All Users :: {}"+ personJdbcDao.findAll());
		
		log.info("Get Person by Id :: {} "+ personJdbcDao.findById(10002));
		
		log.info("Get Person by name :: {} "+ personJdbcDao.findByName("Peter"));
		
		log.info("Insert Person :: {} "+ personJdbcDao.insertPerson(new Person(10004,"Ranga","Chennai",new Date())));
		
		log.info("Update Person :: {} "+ personJdbcDao.updatePerson(new Person(10003,"Peter", "Untrach" , new Date())));
		
	}

}
