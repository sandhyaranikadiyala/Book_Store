//package com.atmecs.bookorderdetails;
//
//public interface Borrowables {
//	void borrow(User user);
//    void returnBook(User user);
//}
//
//abstract class ReferenceBooks extends Book implements Borrowables {
//    private String publisher;
//    private int yearPublished;
//    private boolean isBorrowed;
//
//    public ReferenceBook(String title, String author, String isbn, String publisher, int yearPublished) {
//        super(title, author, isbn);
//        this.publisher = publisher;
//        this.yearPublished = yearPublished;
//        this.isBorrowed = false;
//    }
//
//    // Getter and Setter
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
//
//    public int getYearPublished() {
//        return yearPublished;
//    }
//
//    public void setYearPublished(int yearPublished) {
//        this.yearPublished = yearPublished;
//    }
//
//    // Borrowable interface methods
//    @Override
//    public void borrow(User user) {
//        if (!isBorrowed) {
//            isBorrowed = true;
//            user.getBorrowedBooks().add(this);
//        } else {
//            System.out.println("This reference book is already borrowed.");
//        }
//    }
//
//    @Override
//    public void returnBook(User user) {
//        if (isBorrowed) {
//            isBorrowed = false;
//            user.getBorrowedBooks().remove(this);
//        } else {
//            System.out.println("This reference book is not currently borrowed.");
//        }
//    }
//
//    // toString method
//    @Override
//    public String toString() {
//        return super.toString() + ", Publisher: " + publisher + ", Year Published: " + yearPublished;
//    }
//    
//
//}
//
