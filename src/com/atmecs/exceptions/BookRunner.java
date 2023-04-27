package com.atmecs.exceptions;

public class BookRunner {
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
