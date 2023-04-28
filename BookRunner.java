package com.atmecs.exceptions;

/**
 * This is BookRunner class which has main method.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class BookRunner {
	/**
	 * This is main method create object for class and call the object. Give inputs
	 * and get output.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		try {
			Book book = new Book("To Kill a Mockingbird", "Harper Lee", "1234", 1800);
			int yearPublished = book.getPublicationYear();
			System.out.println(book);
			System.out.println("Year of published : " + yearPublished);

			book.setPublicationYear(1800); // Should throw InvalidPublicationYearException
		} catch (InvalidPublicationYearException e) {
			System.out.println(e.getMessage());
		}

	}

}
