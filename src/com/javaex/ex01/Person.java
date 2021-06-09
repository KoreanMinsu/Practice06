package com.javaex.ex01;

public class Person {
	
	protected String name;
	protected String hp;
	
	public Person() {
	}
	
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public void showInfo() {
		System.out.println("#이름:"+name+", #핸드폰:"+hp);
	}
	
	
	
}
