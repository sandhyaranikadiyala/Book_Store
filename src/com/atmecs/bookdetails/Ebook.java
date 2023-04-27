package com.atmecs.bookdetails;

/**
 * This program is to display the Ebook details.
 * 
 * @author Sandhya.Kadiyala
 *
 */
class Ebook extends Book {
	private String fileSize;

	/**
	 * This is a Book constructor. Which sets the instance variables.
	 * 
	 * @param title
	 * @param author
	 * @param ISBN
	 * @param fileSize
	 */
	Ebook(String title, String author, String ISBN, String fileSize) {
		super(title, author, ISBN);
		this.fileSize = fileSize;
	}

	/**
	 * This method is used to return the input values in string representation.
	 */
	public String toString() {
		return super.toString() + ", File Size: " + fileSize;
	}
}
