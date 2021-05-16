package com.spring.application;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	private @Id String bookId;
	private int quantity;
	private String bookName;
	private String genre;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookId, int quantity, String bookName, String genre) {
		super();
		this.bookId = bookId;
		this.quantity = quantity;
		this.bookName = bookName;
		this.genre = genre;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
