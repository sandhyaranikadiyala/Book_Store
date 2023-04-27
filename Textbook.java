package com.atmecs.bookdetails;

/**
 * This program is to display the Text Book details.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class Textbook extends Book {
	private String subject;
	private char gradeLevel;

	/**
	 * This is a Book constructor. Which sets the instance variables.
	 * 
	 * @param title
	 * @param author
	 * @param ISBN
	 * @param subject
	 * @param gradelevel
	 */
	Textbook(String title, String author, String ISBN, String subject, char gradelevel) {
		super(title, author, ISBN);
		this.subject = subject;
		this.gradeLevel = gradelevel;
	}

	/**
	 * This method is used to return the input values in string representation.
	 */
	public String toString() {
		return super.toString() + ", Subject :" + subject + ",GradeLevel :" + gradeLevel;
	}
}
