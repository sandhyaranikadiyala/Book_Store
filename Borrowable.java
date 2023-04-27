package com.atmecs.bookorderdetails;

/**
 * This is Borrowable interface which have borrow and returnBook method.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public interface Borrowable {
	/**
	 * This is borrow method is display book is borrowed or not display in boolean
	 * values.
	 * 
	 * @param user
	 */
	void borrow(User user);

	/**
	 * This is returnBook method is display book is returned or not display in
	 * boolean values.
	 * 
	 * @param user
	 */
	void returnBook(User user);
}
