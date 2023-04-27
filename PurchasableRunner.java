package com.atmecs.bookorderdetails;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This is PurchasableRunner class to execute the main method.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class PurchasableRunner {
	/**
	 * This is main method to give the inputs and get the output. Create the object
	 * for class and call the methods.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		User user = new User();
		Ebook ebook1 = new Ebook("Publish News Letter", "Amit Garg", "123", 200);
		Ebook ebook2 = new Ebook("The Java Programming Language", "James Gosling", "124", 300);
		Ebook ebook3 = new Ebook("Network", "John", "125", 400);

		ArrayList<Ebook> al = new ArrayList<Ebook>();
		al.add(ebook1);
		al.add(ebook2);
		al.add(ebook3);

		Iterator<Ebook> itr = al.iterator();
		while (itr.hasNext()) {
			Ebook ebook = (Ebook) itr.next();
			System.out.println(ebook);
			System.out.println();
		}
		user.setName("sandhya");

		ebook3.purchase(user);
		System.out.println();
		System.out.println(ebook3);
		System.out.println("\nSuccessfully added to the library");
	}

}
