package com.atmecs.bookdetails;

/**
 * This program is to display the Book details.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class Book {
	String title, author;
	String ISBN;

	/**
	 * This is a Book constructor. Which sets the instance variables.
	 * 
	 * @param title
	 * @param author
	 * @param ISBN
	 */
	 Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}

	/**
	 * This method is used to return the input values in string representation.
	 */
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;

	}

}
