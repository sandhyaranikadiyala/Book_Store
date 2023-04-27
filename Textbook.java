package com.atmecs.bookorderdetails;

/**
 * This is Textbook class which is extended by Book and implemented by
 * ISearchable. Which has instance variables.
 * 
 * @author Sandhya.Kadiyala
 *
 */
class Textbook extends Book implements ISearchable {
	private String subject;
	private int gradeLevel;

	/**
	 * This is Textbook constructor which sets the instance variables.
	 * 
	 * @param title
	 * @param author
	 * @param isbn
	 * @param subject
	 * @param gradeLevel
	 */
	public Textbook(String title, String author, String isbn, String subject, int gradeLevel) {
		super(title, author, isbn);
		this.subject = subject;
		this.gradeLevel = gradeLevel;
	}

	// Getter and Setter
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getGradeLevel() {
		return gradeLevel;

	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public void search(String keyword) {
		System.out.println("Searching for '" + keyword + "' in " + this.getTitle() + "...");

	}

	/**
	 * This method is used to return the fileSize in string representation.
	 */
	public String toString() {
		return super.toString() + ",Subject: " + subject + " GradeLevel :" + gradeLevel;

	}
}
