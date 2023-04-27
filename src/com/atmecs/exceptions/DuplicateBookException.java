package com.atmecs.exceptions;

@SuppressWarnings("serial")
public class DuplicateBookException extends Exception {
	public DuplicateBookException(String message) {
        super(message);
    }

}
