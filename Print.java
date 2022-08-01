package com.example.backend;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Print {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long 	id;
	
	@ManyToOne(optional = false)
	private Book book;
	
	@Column(nullable = false)
	private int 	state;
	
	@Column(length = 100, nullable = false)
	private String 	stateDescription;

	@OneToMany(mappedBy = "print")
	private List<BorrowTransaction> borrowTransactions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateDescription() {
		return stateDescription;
	}

	public void setStateDescription(String stateDescription) {
		this.stateDescription = stateDescription;
	}
	
	
	public List<BorrowTransaction> getBorrowTransactions() {
		return borrowTransactions;
	}

	public void setBorrowTransactions(List<BorrowTransaction> borrowTransactions) {
		this.borrowTransactions = borrowTransactions;
	}
	
}
