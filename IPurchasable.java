package com.atmecs.bookorderdetails;

/**
 * This is IPurchasable interface which have purchase() method.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public interface IPurchasable {

	/**
	 * This is purchase method is to purchase and added to the user library.
	 * 
	 * @param user
	 */
	void purchase(User user);
}
