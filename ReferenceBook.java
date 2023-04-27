package com.atmecs.bookdetails;

/**
 * This program is to display the Reference Book details.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class ReferenceBook extends Book {
	private String publisher;
	private long yearpublisher;

	/**
	 * This is a Book constructor. Which sets the instance variables.
	 * 
	 * @param title
	 * @param author
	 * @param ISBN
	 * @param publisher
	 * @param yearpublisher
	 */
	ReferenceBook(String title, String author, String ISBN, String publisher, long yearpublisher) {
		super(title, author, ISBN);
		this.publisher = publisher;
		this.yearpublisher = yearpublisher;
	}

	/**
	 * This method is used to return the input values in string representation.
	 */
	public String toString() {
		return super.toString() + ", Publisher :" + publisher + ",YearofPublisher :" + yearpublisher;

	}

}
