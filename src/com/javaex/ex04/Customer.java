package com.javaex.ex04;

public class Customer extends User{
	
	public int point;
	
	public Customer() {
	}

	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}

	private int getPoint() {
		return point;
	}

	private void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
		System.out.println("#아이디:"+id+", #패스워드:"+password+", #이름:"+name+", #포인트:"+point);
	}
	
	
}
