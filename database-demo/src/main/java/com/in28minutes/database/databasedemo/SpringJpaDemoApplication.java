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
import com.in28minutes.database.databasedemo.jdbc.PersonJpaRepository;

@SpringBootApplication
public class SpringJpaDemoApplication implements CommandLineRunner {
	
	Logger log = org.slf4j.LoggerFactory.getLogger(SpringJpaDemoApplication.class);
	
	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//log.info("All Users :: {}"+ repository.findAll());
		
		//log.info("Get Person by Id :: {} "+ repository.findById(10002));
		
		//log.info("Get Person by name :: {} "+ repository.findByName("Peter"));
		
		log.info("Insert Person :: {} "+ repository.insertPerson(new Person("Ranga","Chennai",new Date())));
		
		log.info("Update Person :: {} "+ repository.updatePerson(new Person("Peter", "Untrach" , new Date())));
		
	}

}
