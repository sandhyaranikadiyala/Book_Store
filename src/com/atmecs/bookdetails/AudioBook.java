package com.atmecs.bookdetails;

/**
 * This program is to display the Audio Book details.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class AudioBook extends Book {
	private String narrator;
	private int duration;

	/**
	 * This is a Audio Book constructor. Which sets the instance variables.
	 * 
	 * @param title
	 * @param author
	 * @param ISBN
	 * @param narrator
	 * @param duration
	 */
	AudioBook(String title, String author, String ISBN, String narrator, int duration) {
		super(title, author, ISBN);
		this.narrator = narrator;
		this.duration = duration;
	}

	/**
	 * This method is used to return the input values in string representation.
	 */
	public String toString() {
		return super.toString() + ", Narrator: " + narrator + ", Duration: " + duration;
	}
}
