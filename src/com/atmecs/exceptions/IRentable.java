package com.atmecs.exceptions;

public interface IRentable {
	  void rent();
	    void returnBook();
	    
	    void checkAvailability() throws BookUnavailableException;
	}


