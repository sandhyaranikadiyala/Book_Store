package com.atmecs.bookorderdetails;

import java.util.List;

public class User {

	private String name;
	private List<Ebook> bookList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Ebook> getBookList() {
		return bookList;
	}

	public void setBookList(List<Ebook> bookList) {
		this.bookList = bookList;
	}

	

}
