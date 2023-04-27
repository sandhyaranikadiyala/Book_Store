package com.atmecs.bookorderdetails;

/**
 * This is ReferenceBook class extended by Book and implemented by Borrowable
 * interface. Which have instance variables.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class ReferenceBook extends Book implements Borrowable {
	private String publisher;
	private int yearPublished;
	private boolean isBorrowed;

	/**
	 * This is constructor which sets instance variables.
	 * 
	 * @param title
	 * @param author
	 * @param ISBN
	 * @param publisher
	 * @param yearPublished
	 */
	public ReferenceBook(String title, String author, String ISBN, String publisher, int yearPublished) {
		super(title, author, ISBN);
		this.publisher = publisher;
		this.yearPublished = yearPublished;
		this.isBorrowed = false;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public void returnBook() {
		if (isBorrowed) {
			isBorrowed = false;
			System.out.println("Book has been returned.");
		} else {
			System.out.println("Sorry, this book has not been returned.");
		}
	}

	/**
	 * This method is used to return the fileSize in string representation.
	 */
	@Override
	public String toString() {
		return super.toString() + ", Publisher: " + publisher + ", Year Published: " + yearPublished;
	}

	public void borrow() {
		if (isBorrowed) {
			System.out.println("Sorry, this book is already borrowed.");
		} else {
			isBorrowed = true;
			System.out.println("Book has been borrowed.");
		}

	}

	@Override
	public void borrow(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void returnBook(User user) {
		// TODO Auto-generated method stub

	}
}