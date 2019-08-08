package com.pizza;

public class Buyer {
	private String uname;
	private String pword;
	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Buyer(String uname, String pword) {
		super();
		this.uname = uname;
		this.pword = pword;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	@Override
	public String toString() {
		return "Buyer [uname=" + uname + ", pword=" + pword + "]";
	}
	
	
}
