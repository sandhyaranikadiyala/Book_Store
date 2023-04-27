package com.atmecs.bookdetails;

/**
 * This program is to display the Book details.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class BookRunner {
	/**
	 * This is main method is to give the input values and get the output.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Book book = new Book("Publish News Letter", "Amit Garg", "123");
		book.toString();
		System.out.println(book);

		Ebook ebook = new Ebook("Publish News Letter", "Amit Garg", "123", "200");
		ebook.toString();
		System.out.println(ebook);

		AudioBook abook = new AudioBook("Publish News Letter", "Amit Garg", "123", "john", 5);
		abook.toString();
		System.out.println(abook);

		Textbook tbook = new Textbook("Publish News Letter", "Amit Garg", "123", "Science", 'A');
		tbook.toString();
		System.out.println(tbook);

		ReferenceBook rbook = new ReferenceBook("Publish News Letter", "Amit Garg", "123", "Ram", 2012);
		rbook.toString();
		System.out.println(rbook);
	}
}
