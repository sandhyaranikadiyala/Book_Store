package com.atmecs.bookorderdetails;

/**
 * This is Book class is implemented by IRentable interface. which have the
 * instance variables.
 * 
 * @author Sandhya.Kadiyala
 *
 */
class Book implements IRentable {
	private String title;
	private String author;
	private String isbn;
	private boolean isRented;

	/**
	 * This is a Book constructor. Which sets the instance variables.
	 * 
	 * @param title
	 * @param author
	 * @param isbn
	 */
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isRented = false;
	}

	// Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public void rent() {
		isRented = true;
	}

	@Override
	public void returnBook() {
		isRented = false;
	}

	/**
	 * This method is used to return the fileSize in string representation.
	 */
	@Override
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Rented: " + isRented;
	}
}
