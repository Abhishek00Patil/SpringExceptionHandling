package com.example.demo.exception;

import java.util.Date;

public class ApiError {
	
	private Integer errorCode;
	private String errorDescrpt;
	private Date date;
	
	
	public ApiError(Integer errorCode, String errorDescrpt, Date date) {
		super();
		this.errorCode = errorCode;
		this.errorDescrpt = errorDescrpt;
		this.date = date;
	}


	public Integer getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}


	public String getErrorDescrpt() {
		return errorDescrpt;
	}


	public void setErrorDescrpt(String errorDescrpt) {
		this.errorDescrpt = errorDescrpt;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	

}
