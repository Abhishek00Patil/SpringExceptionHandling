package com.example.demo.exception;

public class NoBookFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1712050861398804712L;

	public NoBookFoundException(String msg)
	{
		super(msg);
	}

}
