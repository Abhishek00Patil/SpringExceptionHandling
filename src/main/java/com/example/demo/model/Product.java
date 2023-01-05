package com.example.demo.model;


public class Product {

	private String pid;
	private String pname;
	private Double price;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(String pid, String pname, Double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}


	public String getPid() {
		return pid;
	}


	public void setPid(String pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	
	
}
