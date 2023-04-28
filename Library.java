package com.atmecs.exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * This is Library class which contain list of books.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class Library {
	private List<BookLibrary> bookList;

	public Library() {
		bookList = new ArrayList<>();
	}

	/**
	 * This is addBook method in this add book with the same isbn it will throws
	 * DuplicateBookException.
	 * 
	 * @param book
	 * @throws DuplicateBookException
	 */
	public void addBook(BookLibrary book) throws DuplicateBookException {
		for (BookLibrary existingBook : bookList) {
			if (existingBook.getISBN().equals(book.getISBN())) {
				throw new DuplicateBookException(
						"\nBook with ISBN " + book.getISBN() + " already exists in the library.");
			}
		}
		bookList.add(book);
	}

}

/**
 * This is BookLibrary class which have instance variables for book.
 * 
 * @author Sandhya.Kadiyala
 *
 */
class BookLibrary {
	private String title;
	private String author;
	private String ISBN;

	/**
	 * This BookLibrary constructor which sets the instance variables.
	 * 
	 * @param title
	 * @param author
	 * @param ISBN
	 */
	BookLibrary(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}

	// Getters and Setters for title, author, and ISBN...

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

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getISBN() {
		return ISBN;
	}

}
