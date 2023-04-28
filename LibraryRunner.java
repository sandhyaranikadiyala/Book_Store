package com.atmecs.exceptions;

/**
 * This is LibraryRunner class which has main method.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class LibraryRunner {
	/**
	 * This is main method create the object for class and call the method. Give
	 * book details and get output. Use the try,catch blocks to catch the exception
	 * if any.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Library library = new Library();
		BookLibrary book1 = new BookLibrary("Title 1", "Author 1", "ISBN-1");
		BookLibrary book2 = new BookLibrary("Title 2", "Author 2", "ISBN-2");
		BookLibrary book3 = new BookLibrary("Title 3", "Author 3", "ISBN-3");
		BookLibrary book4 = new BookLibrary("Title 4", "Author 4", "ISBN-2");
		// Duplicate ISBN

		try {
			library.addBook(book1);
			library.addBook(book2);
			library.addBook(book3);
			library.addBook(book4);
		} catch (DuplicateBookException e) {

			System.out.println("Error: Added Duplicate ISBN number book " + e.getMessage());
		}

	}

}
