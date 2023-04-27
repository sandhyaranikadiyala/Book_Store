package com.atmecs.exceptions;

public class BookRentable implements IRentable {
	private String title;
	private String author;
	private String isbn;
	private boolean isRented;
	
	public BookRentable(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isRented = true;
	}

    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}

	public void rent() {
		if(isRented=true) {
        
            throw new IllegalStateException("Book is already rented.");
            
    }
	}
    public void returnBook() {
    	isRented = false;
    }

    

    public void checkAvailability() throws BookUnavailableException {
        if (isRented=true) {
            throw new BookUnavailableException("Book is currently rented and not available.");
        }
    }
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", isRented=" + isRented +
                '}';
    }

	

	}
       
    

