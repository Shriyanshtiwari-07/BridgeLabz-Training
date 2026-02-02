package com.collectors.librarybookstatistics;

public class Book {
	private String bookName;
	private String genre;
	private int page;
	public Book(String bookName, String genre, int page) {
		super();
		this.bookName = bookName;
		this.genre = genre;
		this.page = page;
	}
	public String getBookName() {
		return bookName;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getPage() {
		return page;
	}
	
}
