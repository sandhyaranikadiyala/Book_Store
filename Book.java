package com.atmecs.exceptions;

import java.util.Calendar;

/**
 * This is Book class to check the publication year is valid or not. which have
 * instance variables.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class Book {

	private String title;
	private String author;
	private String isbn;
	private int publicationYear;

	/**
	 * This is Book constructor which sets the instance variables.
	 * 
	 * @param title
	 * @param author
	 * @param isbn
	 * @param publicationYear
	 * @throws InvalidPublicationYearException
	 */
	public Book(String title, String author, String isbn, int publicationYear) throws InvalidPublicationYearException {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publicationYear = publicationYear;
	}

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

	public int getPublicationYear() {
		return publicationYear;
	}

	/**
	 * This is publication year set method to write the logic for <1900 and >
	 * current date it will throws Invalid publication year exception.
	 * 
	 * @param publicationYear
	 * @throws InvalidPublicationYearException
	 */
	public void setPublicationYear(int publicationYear) throws InvalidPublicationYearException {
		if (publicationYear < 1900 || publicationYear > Calendar.getInstance().get(Calendar.YEAR)) {
			throw new InvalidPublicationYearException("Invalid published year");
		}
		this.publicationYear = publicationYear;
	}

	/**
	 * This is toString method to get the book details in string representation.
	 */
	@Override
	public String toString() {
		return "{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", isbn='" + isbn + '\''
				+ ", publicationYear=" + publicationYear + '}';
	}
}
