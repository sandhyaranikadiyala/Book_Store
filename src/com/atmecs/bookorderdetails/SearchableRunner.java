package com.atmecs.bookorderdetails;

/**
 * This is SearchableRunner class which have main method.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class SearchableRunner {
	/**
	 * This is main method creates the object for class and call the methods with
	 * the given input values.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Textbook tbook = new Textbook("Publish News Letter", "Amit Garg", "123", "Science", 5);
		tbook.getSubject();
		System.out.println(tbook);
		tbook.search("News");
	}

}
