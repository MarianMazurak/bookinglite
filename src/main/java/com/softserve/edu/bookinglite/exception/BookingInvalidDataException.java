package com.softserve.edu.bookinglite.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BookingInvalidDataException  extends Exception{

	private static final long serialVersionUID = 1L;
	
	public BookingInvalidDataException() {
		super("You entered invalid data...Please try again");
	}
}
