package com.example.backend;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long 	id;
	
	@ManyToOne(optional = false)
	private Book book;
	
	@ManyToOne(optional = false)
	private User user;
	
	@Column(nullable = false)
	private int reservationDate;

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(int reservationDate) {
		this.reservationDate = reservationDate;
	}
	
	
}
