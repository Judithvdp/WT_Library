package com.example.backend;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long 	id;
	
	@Column(length = 20, nullable = false)
	private String 	firstName;
	
	@Column(length = 20, nullable = false)
	private String 	lastName;
	
	@Column(length = 100, nullable = false)
	private String 	email;
	
	@Column(length = 25, nullable = false)
	private String 	password;
	
	@Column(nullable = false)
	private int 	status;
	
	@OneToMany(mappedBy = "user")
	private List<BorrowTransaction> borrowTransactions;

	@OneToMany(mappedBy = "user")
	private List<Reservation> reservations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public List<BorrowTransaction> getBorrowTransactions() {
		return borrowTransactions;
	}

	public void setBorrowTransactions(List<BorrowTransaction> borrowTransactions) {
		this.borrowTransactions = borrowTransactions;
	}

}
