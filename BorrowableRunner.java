package com.atmecs.bookorderdetails;

/**
 * This is BorrowableRunner class which has main method.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class BorrowableRunner {
	/**
	 * This is main method to give the inputs and get the output. Create the object
	 * for class and call the methods.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		ReferenceBook rbook = new ReferenceBook("Publish News Letter", "Amit Garg", "123", "Ram", 2012);
		System.out.println("Book details:");
		System.out.println(rbook);

		// Borrow the book
		System.out.println("\nBorrowing the book:");
		rbook.borrow();

		// Try to borrow the book again
		System.out.println("\nTrying to borrow the book again:");
		rbook.borrow();

		// Return the book
		System.out.println("\nReturning the book:");
		rbook.returnBook();

		// Try to return the book again
		System.out.println("\nTrying to return the book again:");
		rbook.returnBook();

	}

}
