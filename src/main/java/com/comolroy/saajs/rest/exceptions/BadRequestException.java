package com.comolroy.saajs.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST)
public class BadRequestException  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7593697088818129029L;
	
	public BadRequestException(){
		
	}
	
	public BadRequestException(Throwable cause){
		super(cause);
	}
	
}
