package com.atmecs.bookorderdetails;

/**
 * This is main class to execute the methods.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class RentableRunner {
	/**
	 * This is main method to give the inputs and get the output. Create the object
	 * for class and call the methods.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Book book = new Book("Network", "john", "123");
		book.rent();
		book.returnBook();
		System.out.println(book);
	}
}
