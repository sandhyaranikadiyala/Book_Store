package com.atmecs.exceptions;

import java.util.Calendar;

public class Book {

	private String title;
    private String author;
    private String isbn;
    private int publicationYear;

    public Book(String title, String author, String isbn, int publicationYear) throws InvalidPublicationYearException {
      this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) throws InvalidPublicationYearException {
        if (publicationYear < 1900 || publicationYear > Calendar.getInstance().get(Calendar.YEAR)) {
            throw new InvalidPublicationYearException("Invalid published year");
        }
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }}
    