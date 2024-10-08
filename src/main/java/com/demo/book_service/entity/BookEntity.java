package com.demo.book_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data

@Entity
@Table(name="book_details")
public class BookEntity {
	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;
	@Column(name="book_name")
	private String bookName;
	@Column(name="book_author")
	private String author;
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BookEntity(long bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
