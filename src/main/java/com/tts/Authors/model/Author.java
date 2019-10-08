package com.tts.Authors.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private Long id;
	private String authorName;
	private String bookName;
	
	public Author(String authorName, String bookName) {
		this.authorName = authorName;
		this.bookName = bookName;
	}
	public Author () {}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", bookName=" + bookName + "]";
	}
	
	
	
	
}
