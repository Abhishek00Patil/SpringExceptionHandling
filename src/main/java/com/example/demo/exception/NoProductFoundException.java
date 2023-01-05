package com.example.demo.exception;

public class NoProductFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2127693933403277965L;

	public NoProductFoundException(String msg) {
		
		super(msg);
	}

}
