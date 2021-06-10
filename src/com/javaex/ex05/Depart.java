package com.javaex.ex05;

public class Depart extends Employee{

	private String department;
	
	public Depart() {}
	
	public Depart(String department) {
		super();
		this.department = department;
	}
	
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void showInformation() {
		System.out.println("이름:" + super.getName() + "\t연봉:" +super.getSalary()+"\t부서:"+department);
	}
	 //코드작성

}
