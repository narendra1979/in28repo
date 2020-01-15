package com.in28minutes.jpa.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	@GeneratedValue
	private Long id;
	private String number;
	
	@OneToOne(fetch=FetchType.LAZY,mappedBy="passport")
	private Student student; 
	
	public Passport() {}
	public Passport(String number) {
		super();
		this.number = number;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Passport [id=" + id + ", number=" + number + "]";
	}
}
