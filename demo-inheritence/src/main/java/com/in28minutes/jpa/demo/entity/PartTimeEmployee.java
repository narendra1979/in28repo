package com.in28minutes.jpa.demo.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class PartTimeEmployee extends Employee {

	private BigDecimal hourlyWages;
	
	public PartTimeEmployee() {}
	
	public PartTimeEmployee(String name,BigDecimal salary) {
		super(name);
		this.hourlyWages = salary;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hourlyWages=" + hourlyWages + ", getId()=" + getId() + ", getName()=" + getName()
				+ "]";
	}

	
}
