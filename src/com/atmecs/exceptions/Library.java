package com.atmecs.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<BookLibrary> bookList;

	public Library() {
		bookList = new ArrayList<>();
	}

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

class BookLibrary {
	private String title;
	private String author;
	private String ISBN;

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
