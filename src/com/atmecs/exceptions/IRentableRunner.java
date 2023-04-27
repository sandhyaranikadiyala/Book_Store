package com.atmecs.exceptions;

public class IRentableRunner {
	public static void main(String[] args) {
        BookRentable book = new BookRentable("To Kill a Mockingbird", "Harper Lee", "1234");
        System.out.println(book);

        // Rent the book
        book.rent();

        try {
            // Try to check availability (should throw an exception)
            book.checkAvailability();
        } catch (BookUnavailableException e) {
            System.out.println("Book unavailable: " + e.getMessage());
        }

        // Return the book
        book.returnBook();

        try {
            // Try to check availability again (should not throw an exception)
            book.checkAvailability();
            System.out.println("Book is available.");
        } catch (BookUnavailableException e) {
            System.out.println("Book unavailable: " + e.getMessage());
        }
    }

}
