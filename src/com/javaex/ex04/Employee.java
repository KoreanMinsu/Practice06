package com.javaex.ex04;

public class Employee extends User{

	private int salary;
	
	public Employee() {
		
	}

	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void showInfo() {
		System.out.println("#아이디:"+super.id+", #패스워드:"+super.password+", #이름:"+super.name+", #월급:"+salary);
		
	}
	
	

	
}
