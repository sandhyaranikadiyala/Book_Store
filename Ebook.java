
package com.atmecs.bookorderdetails;

/**
 * This is Ebook class extended by Book class and implemented by IPurchasable.
 * Which have instance variable fileSize.
 * 
 * @author Sandhya.Kadiyala
 *
 */
class Ebook extends Book implements IPurchasable {
	private double fileSize;

	/**
	 * This is Ebook constructor which sets the instance variables.
	 * 
	 * @param title
	 * @param author
	 * @param ISBN
	 * @param fileSize
	 */
	public Ebook(String title, String author, String ISBN, int fileSize) {
		super(title, author, ISBN);
		this.fileSize = fileSize;
	}

	public double getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	/**
	 * This method is used to return the fileSize in string representation.
	 */
	@Override
	public String toString() {
		return super.toString() + ", File Size: " + fileSize + " MB";
	}

	public void purchase(User user) {

		System.out.println(getTitle() + " Ebook purchased and added to User library");

	}

}
