package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="subscribers")
public class Subscriber {
	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	
//	System.out.println("Subscriber class is initialized");
	
	public Subscriber() {
		System.out.println("MySQL Costructor is called");
	}
	
	public Subscriber(String firstName, String lastName, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@Column(name="first_name", nullable=false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	@Column(name="last_name", nullable=false)
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Column(name="email_address", nullable=false)
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", firstName=" + firstName +", lastName="+ lastName +"]";
	}
}
