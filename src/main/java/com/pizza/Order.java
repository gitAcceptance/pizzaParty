package com.pizza;

public class Order {
	private int orderID;
	private String description;
	private String name;
	private int status;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String description, int status) {
		super();
		this.description = description;
		this.status = status;
	}
	public Order(int orderID,String name, String description, int status) {
		super();
		this.description = description;
		this.status = status;
		this.name=name;
		this.orderID=orderID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
