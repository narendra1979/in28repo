package com.in28minutes.jpa.demo.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class FullTimeEmployee extends Employee {

	private BigDecimal salaray;
	
	public FullTimeEmployee() {}
	
	public FullTimeEmployee(String name,BigDecimal salary) {
		super(name);
		this.salaray = salary;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [salaray=" + salaray + ", getId()=" + getId() + ", getName()=" + getName()
				+ "]";
	}

	
}
